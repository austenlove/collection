package org.example;

import java.util.Stack;

public class StackTest {

    /** Stack : 리스트 계열 Vector 클래스 상속
     *  LIFO(Last In First Out) : 나중에 들어간 데이터가 가장 먼저 나옴
     *  */
    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();

        // 값을 넣을 때는 push 메소드 사용(Vector)
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);

        // 요소를 찾을 때는 search() 사용
        // 인덱스가 아닌 위에서부터의 순번 의미 (1부터 시작)
        // 스택의 맨 위부터 아래로 순차적으로 요소 탐색, 해당 요소가 스택 몇 번째 위치에 있는지 반환
        System.out.println(integerStack.search(5));

        // 값을 꺼낼 때는 peek()과 pop() 사용
        // peek() : 스택 가장 마지막에 있는(상단에 있는) 요소 반환
        // pop() : 스택 가장 마지막에 있는(상단에 있는) 요소 반환 후 제거
        System.out.println("peek : " + integerStack.peek());
        System.out.println(integerStack);

        // pop()은 꺼내면서 요소를 제거하므로 스택이 비면 에러 발생
        System.out.println("pop : " + integerStack.pop());
        System.out.println("pop : " + integerStack.pop());
        System.out.println("pop : " + integerStack.pop());
        System.out.println("pop : " + integerStack.pop());
        System.out.println("pop : " + integerStack.pop());
//        System.out.println("pop : " + integerStack.pop());   //EmptyStackException 발생
        System.out.println(integerStack);

    }

}
