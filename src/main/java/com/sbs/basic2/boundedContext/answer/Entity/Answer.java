package com.sbs.basic2.boundedContext.answer.Entity;

import com.sbs.basic2.boundedContext.question.entity.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
  @Id // Primary Key
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrementing ID
  private Integer id;

  @Column(columnDefinition = "TEXT") // TEXT 타입으로 긴 문자열 저장
  private String content;

  private LocalDateTime createDate;

  @ManyToOne // Manu-to-One 관계 설정 : 여러 개의 답변이 하나의 질문에 속할 수 있음
  private Question question; // foreign key로 Question 엔티티를 참조
}