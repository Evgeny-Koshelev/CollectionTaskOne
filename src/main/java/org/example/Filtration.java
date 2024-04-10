package org.example;


public class Filtration {

    public Object [] filter(Object[] objects, Filter filter) {
        int len = objects.length;
        Object [] newArray = new Object[len];
        for(int i = 0; i < len; i++) {
            newArray[i] = filter.apply(objects[i]);
        }
        return newArray;
    }
}
