package com.jatoo.api.server;

import java.net.ServerSocket;
import java.net.Socket;

import com.jatoo.api.client.JatooClient;

public class JatooServer implements Runnable {

	private ServerSocket serverSocket;
	private boolean isRunning = false;
	private Thread thread;
	private int port;
	private ServerState serverState;
	
	public JatooServer() {
		this.port = 9999;
		this.serverState = ServerState.INACTIVE;
	}
	
	public JatooServer(int port) {
		this();
		this.port = port;
	}
	
	
	public void start() {
		if(this.thread == null) {
			this.thread = new Thread(this);
			this.isRunning = true;
			this.thread.start();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			this.serverSocket = new ServerSocket(this.port);
			this.serverState = ServerState.ACTIVE;
			
			while(this.isRunning) {
				try {
					Socket socket = this.serverSocket.accept();
					ClientHandler.handle(new JatooClient(socket));
				}catch(Exception e) {
					
				}	
			}
		}catch(Exception e) {
			
		}
		
		this.serverState = ServerState.INACTIVE;
	}
	
	public ServerState getState() {
		return this.serverState;
	}
	
	public void stop() {
		this.isRunning = false;
		this.thread = null;
	}
	
	
}
