package ru.itone.otushw.homework5;

import java.util.List;

public class SortUtil {
    public void swap(int first, int second, List<Integer> list){
        Integer temporaryVar = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temporaryVar);
    }

    public void bubbleSorter(List<Integer> list) {
        for (int out = list.size() - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (list.get(in) > list.get(in + 1))
                    swap(in, in + 1, list);
            }
        }
    }
}
