package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return values -> {
            List<Integer> list = new ArrayList<>(values);
            list.replaceAll(integer -> integer / divider);
            return list;
        };
    }
}
