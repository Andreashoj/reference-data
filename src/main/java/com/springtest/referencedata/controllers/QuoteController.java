package com.springtest.referencedata.controllers;

import com.springtest.referencedata.dtos.QuoteResponse;
import com.springtest.referencedata.services.FinnhubService;
import com.springtest.referencedata.services.SecurityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/quote")
public class QuoteController {
    private final FinnhubService finnhubService;
    private final SecurityService securityService;

    public QuoteController(FinnhubService finnhubService, SecurityService securityService) {
        this.finnhubService = finnhubService;
        this.securityService = securityService;
    }

    @GetMapping("/ticker/{ticker}")
    public QuoteResponse getQuote(@PathVariable String ticker) {
        return this.finnhubService.getQuote(ticker);
    }

    @GetMapping("/exchange/{exchange}")
    public List<QuoteResponse> getQuotes(@PathVariable String exchange) {
        var securities = this.securityService.getSecuritiesByExchange(exchange);
        var quotes = this.finnhubService.getQuotes(securities);
        return quotes;
    }
}
