package com.jatoo.api.objects;

public class ScheduleTask implements Task {

	private Job job;
	private long scheduledTime;
	
	public ScheduleTask(Job job, long scheduledTime) {
		this.job = job;
		this.scheduledTime = scheduledTime;
	}
	
	
}
