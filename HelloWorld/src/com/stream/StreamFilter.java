package com.stream;

import java.time.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamFilter {

//        IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
//                .filter(n -> n % 2 != 0)
//                .forEach(System.out::println);
//
        public static void main(String[] args) {
            Stream.generate(new LocalDateSupplier())
                    .limit(31)
                    .filter(ldt -> ldt.getDayOfWeek() == DayOfWeek.SATURDAY || ldt.getDayOfWeek() == DayOfWeek.SUNDAY)
                    .forEach(System.out::println);
        }
    }

