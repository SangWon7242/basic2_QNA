package com.sbs.basic2.boundedContext.answer.Entity;

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

//  private Question question;
}