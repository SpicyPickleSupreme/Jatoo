package com.jatoo.api.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.jatoo.api.client.service.ClientService;

public class JatooClient {

	
	private Socket socket;
	private InputStream inputStream;
	private OutputStream outputStream;
	private ClientService service;

	public JatooClient() {
		
	}
	
	public JatooClient(Socket socket) throws IOException {
		this.socket = socket;
		this.inputStream = this.socket.getInputStream();
		this.outputStream = this.socket.getOutputStream();
	}
	
	
	public ClientService service() {
		return service;
	}
	
	public Object readObject() throws Exception {
		ObjectInputStream objectInputStream = new ObjectInputStream(this.inputStream);
		Object result = null;
		try { 
			result = objectInputStream.readObject();
		}catch(Exception e) {
			
		}
		
		return result;
	}
	
	public void writeObject(Object object) throws Exception {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(this.outputStream);
		objectOutputStream.writeObject(object);
	}
	
	public void closeConnection() throws IOException {
		this.socket.close();
	}
}
