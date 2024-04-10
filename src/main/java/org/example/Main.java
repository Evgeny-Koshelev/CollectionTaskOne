package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Filtration filter = new Filtration();

        Object[] array = new Object[]{"12345 ", "feeff", null, "a","b", "c","1"};

        Object[] newArray =  filter.filter(array, new Filter() {
            @Override
            public Object apply(Object o) {
                if(o != null)
                    return o.toString().length();
                else
                    return 999;
            }
        });

        Arrays.stream(newArray).forEach(System.out::println);
    }
}