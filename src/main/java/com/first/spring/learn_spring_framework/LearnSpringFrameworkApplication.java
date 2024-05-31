package com.first.spring.learn_spring_framework;

import com.first.spring.learn_spring_framework.game.GameRunner;
import com.first.spring.learn_spring_framework.game.MarioGame;
import com.first.spring.learn_spring_framework.game.SuperContraGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//		MarioGame game = new MarioGame();
		SuperContraGame game = new SuperContraGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
