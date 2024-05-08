package org.example.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {

        /** HashSet
         *  테이블을 이용하여 데이터를 저장하는 구조
         *  저장 시 순서 유지 안되고 중복 불허(Map의 특성)
         *  인덱스가 아닌 key 값을 이용하여 데이터에 접근 및 저장
         *  삽입 삭제가 빈번한 경우 사용
         * */

        HashSet<String> hset = new HashSet<>();

        // 다형성
        Set hset2 = new HashSet();
        Collection hset3 = new HashSet();

        hset.add(new String("java"));
        hset.add(new String("oracle"));
        hset.add(new String("jdbc"));
        hset.add(new String("html"));
        hset.add(new String("css"));

        // 저장순서 유지 안됨
        System.out.println("hset : " + hset);

        System.out.println("=========================================");

        // 중복 허용 안함
        hset.add(new String("java"));
        System.out.println("hset : " + hset);
        System.out.println("저장된 객체 수 : " + hset.size());
        System.out.println("oracle 포함 여부 : " + hset.contains(new String("oracle")));

        System.out.println("=========================================");

        // 저장된 객체를 하나씩 꺼내는 기능이 없으므로 반복문 활용
        System.out.println("1. toArray() 배열로 변경");
        Object[] arr = hset.toArray();

        for(int i=0; i<arr.length; i++) {
            System.out.println(i + " : " + arr[i]);
        }

        System.out.println("=========================================");

        System.out.println("2. iterator()로 목록을 만들어 연속 처리");
        Iterator<String> iter = hset.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("=========================================");

        // clear() 전체 삭제
        hset.clear();
        System.out.println("empty? : " + hset.isEmpty());

    }
}
