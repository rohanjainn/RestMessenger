package org.Rohan.JaxRS.Messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.Rohan.JaxRS.Messenger.database.InMemoryDatabase;
import org.Rohan.JaxRS.Messenger.model.Message;
import org.Rohan.JaxRS.Messenger.model.Profile;

public class MessageService {

	private Map<Long,Message> messages=InMemoryDatabase.getMessages();
	private Map<Long,Profile> profiles=InMemoryDatabase.getProfile();
	
	
	
	public MessageService()
	{
		messages.put(1l, new Message(1,"Hello !!","rohan"));
		messages.put(2l, new Message(2,"How u doing?","ab"));
	}
	
	public List<Message> getAllMessages()
	{
		return new ArrayList<Message>(messages.values());
	}
	
	
	public Message getMessage(long id)
	{
		return messages.get(id);
	}
	
	public Message addMessage(Message message)
	{
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		
		return message;
	}
	
	public Message updateMessage(Message message)
	{
		if(message.getId()<=0)
		{
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id)
	{
		return messages.remove(id);
	}
}
