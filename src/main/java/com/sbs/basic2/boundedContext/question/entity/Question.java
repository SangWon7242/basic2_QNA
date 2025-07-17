package com.sbs.basic2.boundedContext.question.entity;

import com.sbs.basic2.boundedContext.answer.Entity.Answer;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Question {
  @Id // Primary Key
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrementing ID
  private Long id;

  @Column(length = 200) // 문자 열 길이 제한 200자
  private String subject;

  @Column(columnDefinition = "TEXT") // TEXT 타입으로 긴 문자열 저장
  private String content;

  private LocalDateTime createDate; // 생성 날짜 및 시간

  // One-to-Many 관계 설정 : 하나의 질문에 여러 개의 답변이 있을 수 있음
  // mappedBy = "question"은 Answer 엔티티의 question 필드에 의해 매핑됨
  // cascade = CascadeType.REMOVE : 질문이 삭제될 때 관련된 답변도 함께 삭제됨
  // 하는 이유 : 데이터베이스는 리스트, 배열 등의 복잡한 자료구조를 지원하지 않기 때문에
  @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
  private List<Answer> answerList;
}