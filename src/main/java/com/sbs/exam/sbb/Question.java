package com.sbs.exam.sbb;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
//엔티티 클래스 => 아래 클래스와 1:1로 매칭되는 테이블이 DB에 없다면,자동 생성.
@Data
public class Question {
    @Id   //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
    private Integer id;

    @Column(length = 200)  //너비를 늘리고 싶다. (varchar(200)
    private String subject;

    @Column(columnDefinition = "TEXT")  //본문이 많기 때문에 TEXT
    private String content;

    private LocalDateTime createDAte;  //Datetime

    @OneToMany(mappedBy = "question",cascade = CascadeType.REMOVE)
          //Anwser클라스에 있는 question변수    // 직문을 삭제시 모든 답변도 같이 삭제됨
    private List<Answer> answerList;


}
