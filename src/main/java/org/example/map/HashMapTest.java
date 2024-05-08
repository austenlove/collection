package org.example.map;

import java.util.*;

public class HashMapTest {

    /** Map : 키와 값을 하나의 쌍으로 저장하는 자료 구조
     *  Collection 인터페이스와 다른 저장 방식
     *  HashMap, HashTable, TreeMap 등 포함
     * */

    public static void main(String[] args) {
        /** HashMap : key-value 쌍으로 데이터를 저장하며 다양한 value를 가지지만 key는 중복 불가
         *  저장은 느린 편
         *  해시 함수를 이용해 데이터를 해시 테이블에 저장하므로 검색 측면에서 뛰어남
         *  중복된 키 값을 저장하면 기존의 값에 새로운 값 덮어쓰기 처리 됨
         */

        HashMap hmap = new HashMap();

        // 키와 값을 쌍으로 저장하며, 둘 다 반드시 객체어야 함
        hmap.put("one", new Date());
        hmap.put(12, "red apple");   // autoBoxing 처리 됨 : 12 => new Integer(12)
        hmap.put(33, 123);
        System.out.println("hmap : " + hmap);
        // hmap : {33=123, one=Wed May 08 22:58:32 KST 2024, 12=red apple}



        // key는 중복 저장 불가 (최근 저장된 값으로 override됨)
        hmap.put(12, "yellow banana");
        System.out.println("hmap : " + hmap);

        // value는 중복 저장 가능
        hmap.put(11, "yellow banana");
        hmap.put(9, "yellow banana");
        System.out.println("hmap : " + hmap);

        // key의 value를 가져올 때
        System.out.println("키 9에 대한 객체 : " + hmap.get(9));

        // key로 삭제 처리
        hmap.remove(9);
        System.out.println("hmap : " + hmap);

        // 저장된 객체 수 확인
        System.out.println("hmap에 저장된 객체 수 : " + hmap.size());

        HashMap<String, String> hmap2 = new HashMap<>();

        hmap2.put("one", "Java 8");
        hmap2.put("two", "oracle 11g");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html5");
        hmap2.put("five", "css3");



        /** 1. keySet()을 이용해 key만 따로 set로 만들고, iterator로 key-value 목록 만들기 */
        // Set<String> keys = hmap2.keySet();
        // Iterator<String> keyIter = keys.iterator();
        Iterator<String> keyIter = hmap2.keySet().iterator();

        while(keyIter.hasNext()) {
            String key = (String)keyIter.next();
            String value = (String)hmap2.get(key);
            System.out.println(key + " = " + value);
        }



        /** 2. 저장된 value 값들을 collection으로 만들기 */
        Collection<String> values = hmap2.values();

        // Iterator()로 목록 만들기
        Iterator<String> valueIter = values.iterator();
        while(valueIter.hasNext()) {
            System.out.println(valueIter.next());
        }

        // 배열로 만들기
        Object[] valueArr = values.toArray();
        for(int i=0; i<valueArr.length; i++) {
            System.out.println(i + " : " + valueArr[i]);
        }
    }
}
