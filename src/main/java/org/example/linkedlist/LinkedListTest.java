package org.example.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    /** 연속된 공간에 저장되는 것이 아니라 각각의 데이터가 링크를 연결하여 구성되는 형태
     *  데에터 수정이 빈번할 경우 ArrayList보다 적합
     *  스택, 큐, 양방향 큐를 구성하기 용이
     *
     *  1) 단일연결 리스트
     *  순서를 유지하지 않고 저장되나, 다음 요소와 링크로 연결
     *
     *  2) 이중연결 리스트
     *  이전 요소, 다음 요소와 링크되는 구조
     *  */

    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println("size : " + linkedList.size());

        // 반복문을 활용한 요소 나열
        for(int i=0; i<linkedList.size(); i++) {
            System.out.println(i + " : " + linkedList.get(i));
        }

        // 요소 제거 remove()
        // 요소의 삽입과 삭제가 ArrayList보다 빠름
        linkedList.remove(1);   // 여기서 1은 인덱스가 아니라 삭제할 요소의 순서 의미
        // 요소의 순서는 컬렉션에 추가된 순서에 따라 결정
        System.out.println("================요소 제거================");
        System.out.println(linkedList);   // 따라서 삭제할 요소의 위치를 알고 있어야 remove 호출 가능

        // 향상된 for문을 활용한 요소 나열
        System.out.println("==========향상된 for문 배열 요소 나열==========");
        for(String s : linkedList) {
            System.out.println(s);
        }

        // 요소 수정 set(0, "pineapple")
        linkedList.set(0, "pineapple");
        System.out.println(linkedList);

        // isEmpty() : list가 비어있는지 확인(boolean값 반환)
        System.out.println(linkedList.isEmpty());

    }

}
