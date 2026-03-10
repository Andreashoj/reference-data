package com.springtest.referencedata.repos;

import com.springtest.referencedata.models.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecurityRepository extends JpaRepository<Security, String>, JpaSpecificationExecutor<Security> {
    List<Security> findByExchange(String exchange);
    Security findByIsin(String isin);
}
