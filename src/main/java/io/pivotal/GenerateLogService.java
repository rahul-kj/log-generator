package io.pivotal;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class GenerateLogService {

	@Scheduled(fixedDelay = 1000)
	public void execute() {
		ExecutorService executor = Executors.newFixedThreadPool(100000);
		for (int i = 0; i < 1000; i++) {
			System.out.println("Loop count - " + i);
			Runnable runnable = new Runnable() {

				@Override
				public void run() {
					while (true) {
						UUID uuid = UUID.randomUUID();
						System.out.println("AUDIT Event - ID " + uuid.toString() + " generated at " + new Date());
					}
				}
			};
			executor.execute(runnable);
		}
		executor.shutdown();

		while (!executor.isTerminated()) {
		}

		System.out.println("\nFinished all threads");
	}
}
