package io.pivotal;

import java.util.Date;
import java.util.UUID;

public class GenerateLogService implements Runnable {
	public void run() {
		while (true) {
			UUID uuid = UUID.randomUUID();
			System.out.println("AUDIT Event - ID " + uuid.toString() + " generated at " + new Date());
		}
	}
}
