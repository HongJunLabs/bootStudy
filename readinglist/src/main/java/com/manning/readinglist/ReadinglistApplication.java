package com.manning.readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//-- 컴포넌트 검색과 자동 구성 활성화 (@SpringBootApplication 은 아래 설명하는 애너테이션의 기능이 합쳐졌다.)
//-- @Configuration : 이 애너테이션이 붙은 클래스를 스프링의 자바 기반 구성 클래스로 지정(설정 용도)
//-- @ComponentScan : 컴포넌트 검색 기능을 활성화해서 웹 컨트롤러 클래스나 다른 컴포넌트 클래스들을 자동으로 검색하여 스프링 애플리케이션 컨텍스트에 빈으로 등록 시킨다.
//-- @EnableAutoConfiguration : 스프링 부트의 자동 구성을 할 수 있는 애너테이션

@SpringBootApplication
public class ReadinglistApplication {
	
	//-- 개발시작코드
	public static void main(String[] args) {
		//-- 애플리케이션 부트스트랩
		SpringApplication.run(ReadinglistApplication.class, args);
	}
}
