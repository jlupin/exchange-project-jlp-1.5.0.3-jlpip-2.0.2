package com.example.exchange.service.interfaces;

import com.example.exchange.common.pojo.Currency;

import java.math.BigDecimal;

/**
 * @author Piotr Heilman
 */
public interface CurrencyConverterService {
    BigDecimal convert(BigDecimal value, Currency from, Currency to);
}