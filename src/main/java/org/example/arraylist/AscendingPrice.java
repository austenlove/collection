package org.example.arraylist;
import java.util.Comparator;

// Comparator<BookDTO>를 구현. BookDTO 객체를 가격 기준으로 오름차순 정렬
public class AscendingPrice implements Comparator<BookDTO> {

    // Comparator 인터페이스 상속 시 오버라이드해야 하는 메소드
    // 두 개의 BookDTO 객체를 매개변수로 받아 비교하고, 정수 -1, 0, 1 중 하나를 반환
    @Override
    public int compare(BookDTO o1, BookDTO o2) {

        /** sort()에서 내부적으로 사용하는 매소드
         *  오름차순 정렬 : 두 인스턴스 중 앞의 가격이 뒤의 가격보다 적어야 함
         *
         * */
        int result = 0;

        if(o1.getPrice() > o2.getPrice()) {
            result = 1;   // 순서를 바꿔야 하는 경우 양수 반환

        } else if(o1.getPrice() < o2.getPrice()) {
            result = -1;   // 순서 유지 시 음수 반환

        } else {
            result = 0;   // 두 값이 같은 경우 0 반환
        }

        return result;
    }
}
