package org.example.set.hashset;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetTest {

    public static void main(String[] args) {
        /* LinkedHashSet */
        LinkedHashSet<String> hset = new LinkedHashSet<>();

        hset.add("java");
        hset.add("oracle");
        hset.add("jdbc");
        hset.add("html");
        hset.add("css");

        System.out.println("hset : " + hset);

        /* 생성된 LinkedHashSet를 가지고 TreeSet으로 객체를 생성하면
         * 같은 타입의 객체를 자동으로 비교하여 오름차순 정렬됨 */
        TreeSet<String> tset = new TreeSet<>(hset);
        System.out.println("hset : " + tset);

    }

}
