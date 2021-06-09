package com.jatoo.api.objects;

public class RuntimeAttributes {

	private long maxRuntime;
	private long runtime;
	private long minRuntime;
	
	public RuntimeAttributes() {
		
	}
	
	public void setMinRuntime(long minRuntime) {
		this.minRuntime = minRuntime;
	}
	
	public void setMaxRuntime(long maxRuntime) {
		this.maxRuntime = maxRuntime;
	}
	
	public long getRuntime() {
		return runtime;
	}
	
	
	
	
}
