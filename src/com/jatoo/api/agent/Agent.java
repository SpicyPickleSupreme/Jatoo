package com.jatoo.api.agent;

import java.net.InetAddress;
import java.net.Socket;

import com.jatoo.api.config.Config;
import com.jatoo.api.enums.ObjectType;

/**
 * Purpose of this class is to be used to run jobs on a remotely connected machine.
 * @author Caleb
 *
 */
public class Agent {
	
	private final ObjectType type = ObjectType.AGENT;
	private Socket socket;
	private String name;
	private InetAddress address;
	
	public Agent(String name, InetAddress address) {
		this.name = name;
		this.address = address;
		this.socket = null;
	}
	
	public Agent(String name, Socket socket) {
		this.name = name;
		this.socket = socket;
	}
	
	public String getName() {
		return name;
	}
	
	public void connect() {
		if(socket == null) {
			try {
				int idx = 1;
				long waitTime;
				while(true) {
					waitTime = (long)Math.min(60, Math.pow(2, idx)) * 1000;
					try {
						socket = new Socket(address,Config.PORT);	
						break;
					}catch(Exception e) {	
						
					}
					Thread.sleep(waitTime);
					idx++;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
