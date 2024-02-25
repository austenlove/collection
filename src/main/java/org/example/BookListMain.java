package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookListMain {

    public static void main(String[] args) {

        // 책 목록 관리용 ArrayList 인스턴스 생성
        List<BookDTO> bookList = new ArrayList<>();

        // 도서 정보 추가
        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));



        // Comparable 타입을 가진 경우에만 sort 사용 가능
//        Collections.sort(bookList);

        // 정렬 전 책 리스트 출력
        System.out.println("==================정렬 전 책 리스트==================");
        for(BookDTO book : bookList) {
            System.out.println(book);
        }



        // 오름차순/내림차순 정렬 방법 - 둘 중 하나 택1

        // 1. 가격 오름차순 정렬
        // 1) AscendingPrice 정의 : Comparator 인터페이스 상속 및 override
        // 2) 1)을 List의 sort() 메소드의 파라미터로 전달
        bookList.sort(new AscendingPrice());

        System.out.println("==================가격 오름차순 정렬==================");
        for(BookDTO book : bookList) {
            System.out.println(book);
        }

        // 2. 가격 내림차순 정렬
        // 인터페이스는 바로 인스턴스 생성 불가능
        // bookList.sort(new Comparator<BookDTO>());
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return  o1.getPrice() >= o2.getPrice() ? -1 : 1;
            }
        });

        System.out.println("==================가격 내림차순 정렬==================");
        for(BookDTO book : bookList) {
            System.out.println(book);
        }



        // [연습문제] String 타입 정렬방법 - 제목 오름차순 정렬
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                // String 클래스에 정의된 CompareTo() 메소드 사용
                // 앞의 값이 작으면 -1, 앞의 값이 크면 1, 같으면 0 반환
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        System.out.println("==================제목 내림차순 정렬==================");
        for(BookDTO book : bookList) {
            System.out.println(book);
        }



    }

}
