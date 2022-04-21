package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Ioc(Inversion of Control) - 제어의 역전
// 스프링이 com.cos.blog 패키지 이하를 스캔해서 모든 클래스를 메모리에 new(인스턴스)하는 것은 아니구요.
// 특정 어노테이션이 붙어있는 클래스 파일을 new(인스턴스화)해서 Ioc 스프링 컨테이너에서 관리해 줍니다.
@RestController 
public class BlogControllerTest {
	
	// http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}

}
