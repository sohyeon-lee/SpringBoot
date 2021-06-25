package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* @SpringBootApplication : 이 클래스가 스프링부트로 만든 애플리케이션의 시작 클래스임을 의미 */
@SpringBootApplication
public class Ch01Application {
	/* 
	 * 웹 애플리케이션으로 실행 
	 * Srping Application 객체의 run() 메소드를 정적(static) 호출 방식으로 호출
	 */
//	public static void main(String[] args) {
//		SpringApplication.run(Ch01Application.class, args);
//	}
	
	/* 
	 * 자바 애플리케이션으로 실행
	 * 정적 메소드 호출 방식 -> 객체 생성 방식 (변경) 
	 */
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Ch01Application.class);
		app.setWebApplicationType(WebApplicationType.NONE); 
		// NONE : 웹 애플리케이션이 아닌 일반 자바 애플리케이션으로 실행됨, 톰캣 서버 구동X
		// SERVLET : 스프링MVC를 기반으로 웹 애플리케이션을 구동
		app.run(args);
	}

}
