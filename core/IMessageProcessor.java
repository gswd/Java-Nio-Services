package org.kaipan.www.socket.core;

public interface IMessageProcessor 
{
	public void process(Message message, WriteProxy writeProxy);
}
