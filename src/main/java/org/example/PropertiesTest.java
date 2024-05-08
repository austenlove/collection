package org.example;

import java.util.Properties;

public class PropertiesTest {

    /** Properties : Hashtable을 상속받아 구현한 구현체
     * (Object, Object)의 형태로 저장하는 해시 테이블과 달리
     * (String, String) 형태로 저장
     *
     * 주로 프로그램 환결설정 관련 속성 저장 시 사용
     * Key-value 모두 String이기 때문에 제네릭이 필요하지 않음
     */

    public static void main(String[] args) {

        // 설정 파일 값을 읽어서 어플리케이션에 적용 시 사용
        Properties prop = new Properties();

        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
        prop.setProperty("user", "student");
        prop.setProperty("password", "student");

        System.out.println(prop);

//        try {prop} catch () {}
    }
}
