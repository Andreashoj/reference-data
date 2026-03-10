package com.springtest.referencedata.controllers;

import com.springtest.referencedata.models.Security;
import com.springtest.referencedata.services.SecurityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/securities")
public class SecurityController {
    private final SecurityService securityService;

    public SecurityController(SecurityService securityService) {
        this.securityService = securityService;
    }

    @GetMapping
    public List<Security> getSecurities(
            @RequestParam(required = false) String search, // looks through name, ticker and isin for matches
            @RequestParam(required = false) String exchange,
            @RequestParam(required = false) String currency
    ) {
        return securityService.getAllSecurities(search, exchange, currency);
    }

    @GetMapping("/{isin}")
    public Security getByIsin(@PathVariable String isin) {
        return securityService.getByIsin(isin);
    }

    @PostMapping
    public Security create(@RequestBody Security security) {
        return securityService.createSecurity(security);
    }
}
