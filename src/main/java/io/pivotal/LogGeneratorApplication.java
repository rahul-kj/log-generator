package io.pivotal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogGeneratorApplication.class, args);
		
		ExecutorService executor = Executors.newFixedThreadPool(100000);
		for (int i = 0; i < 1000; i++) {
			System.out.println("Loop count - " + i);
			Runnable runnable = new GenerateLogService();
			executor.execute(runnable);
		}
		executor.shutdown();

		while (!executor.isTerminated()) {
		}

		System.out.println("\nFinished all threads");
		
		
	}

}
