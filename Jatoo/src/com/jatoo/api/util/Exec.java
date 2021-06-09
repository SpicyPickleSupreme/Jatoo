package com.jatoo.api.util;

public class Exec {

	public static int command(String command) {
		int result = -1;
		try {
			Process process = Runtime.getRuntime().exec(command);
			result = process.onExit().get().exitValue();
		}catch(Exception e) { 
			
		}
		return result;
	}
	
	
}
