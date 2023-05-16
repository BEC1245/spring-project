package com.hi.app.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// Localdate로 변환 시켜주는 formatter
public class localdateFormatter implements Formatter<LocalDate> {

    @Override
    public LocalDate parse(String text, Locale locale) throws ParseException {

        // 사용자가 전달하는 파라미터는 String 이였기에
        // 그 String을 localdate로 변환시켜줘야 한다.
        return LocalDate.parse(text, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    @Override
    public String print(LocalDate object, Locale locale) {
        return null;
    }
}
