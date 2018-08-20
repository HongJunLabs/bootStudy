package com.manning.readinglist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manning.readinglist.domain.Book;

//-- JpaRepository 인터페이스는 타입 매개변수를 두 개를 받는다.
//-- 그 중 첫번째는 리포지토리가 사용할 도메인 타입, 두 번째는 클래스의 ID 프로퍼티 타입이다.

public interface ReadinglistRepository extends JpaRepository<Book, Long>{
	
	//-- 지정한 도자의 이름으로 독서 목록을 검색하는 메서드
	List<Book> findByReader(String reader);
}
