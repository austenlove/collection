package org.example.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    /** HashSet과 비숫한 구조를 가지기 때문에
     *  중복 데이터를 저장하지 않고 저장 순서를 유지하지 않음
     *
     *  데이터가 정렬된 상태로 저장되는 2진 검색 트리의 형태로 요소 저장
     *  데이터 추가 및 제거 동작이 매우 빠름
     *  정렬 상태 유지
     *  */

    public static void main(String[] args) {
        // 자동 오름차순 정렬하여 2진 트리 형태로 요소 저장
        TreeSet<String> tset = new TreeSet<>();
//        Set<String> tset = new TreeSet<>();

        tset.add("java");
        tset.add("oracle");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");

        System.out.println(tset);   // 자동 오름차순 정렬

        // 목록을 만들어서 하나씩 대문자로 변경해서 출력하기
        Iterator<String> iter = tset.iterator();

        while(iter.hasNext()) {
            System.out.println(((String)iter.next()).toUpperCase());
        }

        // 배열로 바꾸어 연속 처리하기
        Object[] arr = tset.toArray();

        for(Object obj : arr) {
            System.out.println(((String)obj).toUpperCase());
        }

        // 로또 번호 발생(TreeSet 특징 이용)
        Set<Integer> lotto = new TreeSet<>();

        while (lotto.size() < 6) {
            lotto.add(((int)(Math.random()*45)) + 1);
        }

        System.out.println("lotto : " + lotto);
    }

}
