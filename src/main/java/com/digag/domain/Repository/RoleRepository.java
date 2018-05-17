package com.digag.domain.Repository;

import com.digag.domain.Role;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@RepositoryRestResource
@CacheConfig(cacheNames = "roles")
public interface RoleRepository extends JpaRepository<Role,String> {

    @Cacheable()
    Role findByName(final String name);
}
