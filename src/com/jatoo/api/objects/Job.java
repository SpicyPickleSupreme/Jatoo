package com.jatoo.api.objects;

public class Job {
	
	private JHeader jHeader;
	private JobAttributes jobAttributes;
	private HostAttributes hostAttributes;
	private JobProcess process;
	
	
	public Job() {
		
	}
	
	public JobAttributes attributes() {
		return jobAttributes;
	}
	
	public HostAttributes hostAttributes() {
		return hostAttributes;
	}
	
	public JHeader header() {
		return jHeader;
	}
	
	public JobProcess getProcess() {
		return process;
	}
	
	
	
	

}
