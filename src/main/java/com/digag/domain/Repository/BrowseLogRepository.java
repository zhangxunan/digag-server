package com.digag.domain.Repository;

import com.digag.domain.BrowseLog;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;


@RepositoryRestResource
public interface BrowseLogRepository  extends JpaRepository<BrowseLog,String> {

    BrowseLog findByIp(String ip);

    BrowseLog findByUid(String uid);

    @Transactional
    <S extends BrowseLog> S  save(S s);

}
