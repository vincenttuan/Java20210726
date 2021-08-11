package com.study.day33;

import java.util.concurrent.Executor;

public class MyExecutor implements Executor {

	@Override
	public void execute(Runnable command) {
		
		Thread t = new Thread(command);
		t.start();
		
	}
	
}
