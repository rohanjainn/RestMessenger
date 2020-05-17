package org.Rohan.JaxRS.Messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.Rohan.JaxRS.Messenger.model.Message;
import org.Rohan.JaxRS.Messenger.model.Profile;

public class InMemoryDatabase {

	private static Map<Long,Message> message=new HashMap<>();
	private static Map<Long,Profile> profile=new HashMap<>();
	
	public static Map<Long,Message>getMessages()
	{
		return message;
	}
	
	public static Map<Long,Profile> getProfile()
	{
		return profile;
	}
}
