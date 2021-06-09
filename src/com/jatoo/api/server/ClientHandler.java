package com.jatoo.api.server;

import com.jatoo.api.client.JatooClient;

public class ClientHandler {
	
	private JatooClient client;
	
	private ClientHandler(JatooClient client){
		this.client = client;
	}
	
	
	
	
		
	public static void handle(JatooClient client) {
		
		Thread thread = new Thread(()->{
			try {
				
				ClientHandler handler = new ClientHandler(client);
				
				
			} catch (Exception e) {	
				e.printStackTrace();
			}	
		});
		thread.setDaemon(true);
		thread.start();
	}
}
