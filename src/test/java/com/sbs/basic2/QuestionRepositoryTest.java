package com.sbs.basic2;

import com.sbs.basic2.boundedContext.question.entity.Question;
import com.sbs.basic2.boundedContext.question.repository.QuestionRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDateTime;

@SpringBootTest
@ActiveProfiles("test") // 테스트 프로파일을 활성화하여 테스트 환경에서 실행
class QuestionRepositoryTest {

  @Autowired
  private QuestionRepository questionRepository;

  @Test
  // @DisplayName은 테스트 메서드의 설명을 작성하는 데 사용
  @DisplayName("질문 데이터 저장")
  @Transactional
  @Rollback(false)
  void t1() {
    Question q1 = new Question();
    q1.setSubject("sbb가 무엇인가요?");
    q1.setContent("sbb에 대해서 알고 싶습니다.");
    q1.setCreateDate(LocalDateTime.now());
    questionRepository.save(q1);  // 첫번째 질문 저장

    // 두번째 질문(빌더 패턴 사용)
    Question q2 = Question.builder()
        .subject("스프링부트 모델 질문입니다.")
        .content("id는 자동으로 생성되나요?")
        .createDate(LocalDateTime.now())
        .build();

    questionRepository.save(q2);  // 두번째 질문 저장
    // 수정
  }
}