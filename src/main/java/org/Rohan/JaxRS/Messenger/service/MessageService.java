package org.Rohan.JaxRS.Messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.Rohan.JaxRS.Messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages()
	{
		Message m1=new Message(1,"Hello !!","rohan");
		Message m2=new Message(2,"How u doing?","ab");
		
		List<Message> messages=new ArrayList<>();
		
		messages.add(m1);
		messages.add(m2);
		
		return messages;
	}
}
