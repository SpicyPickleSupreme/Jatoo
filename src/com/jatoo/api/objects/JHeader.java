package com.jatoo.api.objects;

/**
 * Class used to represent top level details of an object.
 * @author Caleb
 *
 */
public class JHeader {

	private String title;
	private String type;
	
	private long created;
	private long modified;
	
	public JHeader() {
		created = System.currentTimeMillis();
		modified = created;
	}
		
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public long getCreated() {
		return this.created;
	}
	
}
