package com.jatoo.api.agent;

import java.io.IOException;
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
	
	public void connect() {
		if(socket == null) {
			try {
				socket = new Socket(address,Config.PORT);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
