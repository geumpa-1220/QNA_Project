package com.sbs.exam.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testJpa()
	{
		Question q1=new Question();
		q1.setSubject("what is sbb?");
		q1.setContent("I wanna know sbb!!");
        q1.setCreateDAte(LocalDateTime.now());
		this.questionRepository.save(q1);
	}

}
