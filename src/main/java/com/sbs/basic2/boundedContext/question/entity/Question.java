package com.sbs.basic2.boundedContext.question.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Question {
  @Id // Primary Key
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrementing ID
  private Long id;

  @Column(length = 200) // 문자 열 길이 제한 200자
  private String subject;

  @Column(columnDefinition = "TEXT") // TEXT 타입으로 긴 문자열 저장
  private String content;

  private LocalDateTime createDate; // 생성 날짜 및 시간
}