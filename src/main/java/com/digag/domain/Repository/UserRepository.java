package com.digag.domain.Repository;

import com.digag.domain.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
@CacheConfig(cacheNames = "users")
public interface UserRepository extends JpaRepository<User,String>{

    @Cacheable()
    User findByUsername(final String username);

    @Cacheable()
    User findByAccount(final String account);
}
