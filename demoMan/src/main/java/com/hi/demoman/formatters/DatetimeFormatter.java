package com.hi.demoman.formatters;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Locale;

public class DatetimeFormatter implements Formatter<LocalDate> {

    @Override
    public LocalDate parse(String text, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(LocalDate object, Locale locale) {
        return null;
    }
}
