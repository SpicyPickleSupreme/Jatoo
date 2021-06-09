package com.jatoo.api.objects;

public class Schedule {

	
	private Queue queue;
	
	public Schedule(Queue queue) {
		this.queue = queue;
	}
	
	public void scheduleTask(ScheduleTask task) {
		queue.addTask(task);
	}
	
	public void unscheduleTask(ScheduleTask task) {
		queue.removeTask(task);
	}
	
	
}
