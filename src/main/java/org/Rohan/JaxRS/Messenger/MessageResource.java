package org.Rohan.JaxRS.Messenger;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.Rohan.JaxRS.Messenger.model.Message;
import org.Rohan.JaxRS.Messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService MessageService =new MessageService();
	@GET
	//@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages()
	{
		return MessageService.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
	//@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long id)
	{
			return MessageService.getMessage(id);	
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public String addMessage(Message message)
	{
		MessageService.addMessage(message);
		return "Message -"+ message.toString();
	}
	
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{messageId}") 
	public String updateMessage(@PathParam("messageId")long id,Message message)
	{
		message.setId(id);
		MessageService.updateMessage(message);
		return "Message updated-"+ message.toString();
	}
	
	
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{messageId}")
	public String deleteMessage(@PathParam("messageId")long id)
	{
		MessageService.removeMessage(id);
		return "Message - deleted "; 
	}
}
