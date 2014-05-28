package org.punnoose.springbatchdemo.listener;

import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.AfterRead;
import org.springframework.batch.core.annotation.BeforeStep;

public class StopListener {

	private StepExecution stepExecution;
	private int maxReadCount;

	@BeforeStep
	public void beforeStep(StepExecution stepExecution) {
		this.stepExecution = stepExecution;
	}

	@AfterRead
	public void afterRead() {
		if (stepExecution.getReadCount() >= getMaxReadCount()) {
			stepExecution.setTerminateOnly();
		}
	}

	public int getMaxReadCount() {
		return maxReadCount;
	}

	public void setMaxReadCount(int maxReadCount) {
		this.maxReadCount = maxReadCount;
	}
}
