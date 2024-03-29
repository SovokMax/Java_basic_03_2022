package ru.itone.otushw.homework5;

import java.util.*;

public class Sort {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(15);
        list.add(122);
        list.add(1123);
        list.add(13465);
        list.add(1555);
        list.add(175);
        list.add(135);
        list.add(1665);
        list.add(15);
        list.add(75);
        list.add(15);
        list.add(5);
        list.add(79);
        list.add(24);
        list.add(8);

        //System.out.println(list);

        SortUtil sortUtil = new SortUtil();
        Date start = new Date();
        sortUtil.bubbleSorter(list);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        Date end = new Date();
        System.out.println("Sort time: " + (end.getTime() - start.getTime()));


        Date start2 = new Date();
        Collections.sort(list);
        Date end2 = new Date();
        System.out.println("Sort time fast: " + (end2.getTime() - start2.getTime()));
    }
}
