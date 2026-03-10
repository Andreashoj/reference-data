package com.springtest.referencedata.services;

import com.springtest.referencedata.dtos.FinnhubQuoteRequest;
import com.springtest.referencedata.dtos.QuoteResponse;
import com.springtest.referencedata.models.Security;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FinnhubService {
    @Value("${finnhub.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public FinnhubService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Cacheable("quote")
    public QuoteResponse getQuote(String ticker) {
        var url = "https://finnhub.io/api/v1/quote?symbol=" + ticker + "&token=" + this.apiKey;
        var rawQuote = restTemplate.getForObject(url, FinnhubQuoteRequest.class);
        var quote = new QuoteResponse(
                ticker,
                rawQuote.getCurrentPrice(),
                rawQuote.getPreviousClose(),
                rawQuote.getChange(),
                rawQuote.getChangePercent(),
                rawQuote.getHigh(),
                rawQuote.getLow(),
                rawQuote.getOpen(),
                rawQuote.getTimestamp()
        );

        return quote;
    }

    public List<QuoteResponse> getQuotes(List<Security> securities) {
        return securities.stream()
                .map(security -> getQuote(security.getTicker()))
                .collect(Collectors.toList());
    }
}
