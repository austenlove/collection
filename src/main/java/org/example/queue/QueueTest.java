package org.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        /** Queue 인터페이스
         *  FIFO(First In First Out) : 먼저 들어간 데이터가 가장 먼저 나옴
         *  front와 rear을 정하고 한 곳에서는 삭제, 다른 곳에서는 삽입 연산만 처리
         *  */

        // Queue 자체는 인터페이스이기 때문에 구현 객체 필요
        // Queue<String> que = new Queue<>();   에러 발생
        Queue<String> que = new LinkedList<>();

        // 데이터 삽입 offer()
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println(que);

        System.out.println("========================================");

        // 데이터 나열 peek(), poll()

        // peek() : 큐의 가장 앞에 있는(먼저 들어온) 요소 반환
        System.out.println("peek() : " + que.peek());
        System.out.println("peek() : " + que.peek());
        System.out.println(que);

        // poll() : 큐의 가장 앞에 있는(먼저 들어온) 요소 반환 후 제거
        System.out.println("========================================");
        System.out.println("poll() : " + que.poll());
        System.out.println("poll() : " + que.poll());
        System.out.println(que);

    }


}
