package net.devwiki.main;

import net.devwiki.gson.GsonClient;

public class Client {
	
	public static void main(String[] args) {
		
		GsonClient gsonClient = new GsonClient();
		gsonClient.objectToJson();
		gsonClient.jsonToObject();
	}
}
