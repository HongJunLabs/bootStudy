package com.manning.readinglist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//-- 테스트에서 사용할 bean을 지장한다. ex : @SpringBootTest(classes = {ClassName1.class, ClassName2.class})
//-- @Configuration 어노테이션을 사용하는 클래스가 있다면 내부에서 @Bean 어노테이션을 통해서 생성되는 빈도 모두 등록 된다.
//-- 만일 classes 속성을 통해서 클래스를 지정하지 않으면 애플리케이션 상에 정의된 모든 빈을 생성한다.
//-- 아래는 Example
/*
 *  @RunWith(SpringRunner.class)
	@SpringBootTest(classes = {ArticleServiceImpl.class, CommonConfig.class})
	public class SomeClassTest {
		// Service로서 등록된 빈
		@Autowired
		private ArticleServiceImpl articleServiceImpl;
		// CommonConfig에서 생성되는 빈
		@Autowired
		private RestTemplate restTemplate;
	}
 * 
 * 
 * */

@SpringBootTest
public class ReadinglistApplicationTests {

	@Test
	public void contextLoads() {
	}

}
