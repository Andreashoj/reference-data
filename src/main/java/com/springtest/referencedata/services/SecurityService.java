package com.springtest.referencedata.services;

import com.springtest.referencedata.models.Security;
import com.springtest.referencedata.repos.SecurityRepository;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecurityService {
    private final SecurityRepository securityRepository;

    public SecurityService(SecurityRepository securityRepository) {
        this.securityRepository = securityRepository;
    }

    public List<Security> getAllSecurities(String search, String exchange, String currency) {
        Specification<Security> spec = (root, query, criteriaBuilder) -> null;

        if (search != null) {
            spec = spec.and((root, query, criteriaBuilder) ->
                    criteriaBuilder.or(
                        criteriaBuilder.like(root.get("name"), "%" + search + "%"),
                        criteriaBuilder.like(root.get("ticker"), "%" + search + "%"),
                        criteriaBuilder.like(root.get("isin"), "%" + search + "%")
                    ));
        }

        if (exchange != null) {
            spec = spec.and(((root, query, criteriaBuilder) ->
                    criteriaBuilder.equal(root.get("exchange"), exchange)
                    ));
        }

        if (currency != null) {
            spec = spec.and(((root, query, criteriaBuilder) ->
                    criteriaBuilder.equal(root.get("currency"), currency)
            ));
        }

        return this.securityRepository.findAll(spec);
    }

    public List<Security> getSecuritiesByExchange(String exchange) {
        return this.securityRepository.findByExchange(exchange);
    }

    public Security getByIsin(String isin) {
        return this.securityRepository.findByIsin(isin);
    }

    public Security createSecurity(Security security) {
        return securityRepository.save(security);
    }
}
