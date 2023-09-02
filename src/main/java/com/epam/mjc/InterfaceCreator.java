package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return x -> {
            List<Integer> resultList = new ArrayList<>();
            for (Integer element : x) {
                int newElement = element / divider;
                resultList.add(newElement);
            }
            return resultList;
        };
    }
}
