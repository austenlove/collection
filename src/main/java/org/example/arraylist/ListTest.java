package org.example.arraylist;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {

        ArrayList alist = new ArrayList();

        // 상위 타입으로도 ArrayList 객체 생성 가능
        // List 인터페이스 하위의 다양한 구현체로 타입 변경이 가능하므로
        // 레퍼런스 타입을 List로 지정하면 코드 유연성 향상
        List list = new ArrayList();
        Collection clist = new ArrayList();

        // Object 클래스의 하위 타입 모두 저장
        alist.add("apple");
        alist.add(123);   // autoBoxing 처리(값 -> 객체)
        alist.add(45.67);
        alist.add(new Date());

        // toString 메소드가 override됨
        System.out.println("alist: " + alist);

        // size() 메소드는 배열의 크기가 아닌 요소의 개수 반환
        System.out.println("alist의 size: " + alist.size());

        // 인덱스가 지정되기 때문에 for문 접근 가능
        for(int i=0; i<alist.size(); i++) {
            // 인덱스에 해당하는 값 출력
            System.out.println(i + " : " + alist.get(i));
        }

        // 중복저장 허용
        alist.add("apple");
        System.out.println("alist : " + alist);

        // 원하는 인덱스 위치에 값 추가 가능
        // 해당 인덱스에 덮어쓰는 것이 아니고 이후 값들은 하나씩 뒤로 밀리는 형태
        alist.add(1, "banana");
        System.out.println("alist : " + alist);

        // 저장된 값 삭제 시 remove() 메소드 사용
        // 마찬가지로 중간 인덱스 값 삭제 시 이후 값들은 하나씩 앞으로 당겨지는 형태
        alist.remove(2);
        System.out.println("alist : " + alist);

        // 저장된 값 수정 시 set() 메소드 사용
        alist.set(1, new String("hello"));
        System.out.println("alist : " + alist);

        // 모든 컬렉션 클래스는 제네릭으로 작성되어 있음
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("grapes");
        System.out.println("stringList : " + stringList);
        
        /** 오름차순 정렬 처리
         *  Collection 인터페이스가 아닌 Collections 클래스 사용
         *  Collections 클래스: Collection 인터페이스에서 사용되는 기능들을 static 메소드로 구현한 클래스
         *  sort 메소드를 사용 시 오름차순 정렬 후 정렬상태 유지
        */
        Collections.sort(stringList);
        System.out.println("stringListSort : " + stringList);

        /** 내림차순 정렬 처리
         *  ArrayList -> LinkedList로 변환하여 내림차순 메소드 descendingIterator() 적용
         *  Iterator 타입 목록으로 반환
         */
        /** Iterator 반복자 인터페이스
         *  컬렉션에서 값을 읽어오는 방식을 통일하기 위해 사용
         *  Collection 인터페이스의 iterator() 메소드
         *  반복문을 이용해 목록을 하나씩 꺼내는 방식으로 사용
         *  hasNext() : 다음 요소를 가지고 있는 경우 true, 없는 경우 false 반환
         *  next() : 현재 반복자가 가리키는 요소를 반환하고, 다음 요소로 반복자를 이동시킴
         *  */
        stringList = new LinkedList<>(stringList);
        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();
        List<String> descList = new ArrayList<>();
        while (dIter.hasNext()) {
            descList.add(dIter.next());
        }
        System.out.println("descList : " + descList);

    }
}