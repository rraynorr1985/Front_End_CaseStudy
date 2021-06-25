package com.springdatajpa.boot.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

//Class for implementing File Upload feature determining Directory for uploading files storing
@ConfigurationProperties("storage")
public class StorageProperties {
	/**
	 * Folder location for storing files
	 */
	private String location = "src/main/webapp/resources/uploaded_files";

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
