package com.sbs.basic2.boundedContext.question.repository;

import com.sbs.basic2.boundedContext.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

// question 엔티티에 대한 CRUD 작업을 수행하는 리포지토리 인터페이스
// JpaRepository를 상속받아 기본적인 CRUD 메서드를 자동으로 제공받음
// Question : 엔티티의 타입, Integer : 엔티티의 ID 타입
public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
