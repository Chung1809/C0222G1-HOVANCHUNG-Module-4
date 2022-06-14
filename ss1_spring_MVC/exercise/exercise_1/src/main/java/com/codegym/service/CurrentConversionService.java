package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class CurrentConversionService implements ICurrentConversionService {
    private final Integer RATE = 23000;
    @Override
    public double convert(Double usd) {
        return usd*RATE;
    }
}
