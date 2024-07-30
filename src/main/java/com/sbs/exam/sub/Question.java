package com.sbs.exam.sub;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
//엔티티 클래스 => 아래 클래스와 1:1로 매칭되는 테이블이 DB에 없다면,자동 생성.
public class Question {
    @Id   //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
    private Integer id;

    @Column(length = 200)  //너비를 늘리고 싶다. (varchar(200)
    private String subject;

    @Column(columnDefinition = "TEXT")  //본문이 많기 때문에 TEXT
    private String content;

    private LocalDateTime createDAte;  //Datetime

}
