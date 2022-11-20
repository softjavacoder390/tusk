package com.test.solidprinciple;

//Dependency Inversion Principle
//High Level module should not directly depends upon low level module instead they should depend on abstraction.

//application Layer high level module

class MyMessenger{
	ProtocolHandler toHandler ;
	
	public MyMessenger(String protocol){
		toHandler = ProtocolHandlerFactory.getProtocolHandler(protocol);
	}
	public void send(String to , String message){
		toHandler.sendMessage("message to "+ to +", message - " +message);
	}
}

//Transport Layer low level module
interface ProtocolHandler{
	
	public void sendMessage(String message);
	
}

class ProtocolHandlerFactory{
	
	public static ProtocolHandler getProtocolHandler(String protocol){
		
		if("TCP".equals(protocol)){
			return new TCPProtocolHandler();
		}
		
		if("UDP".equals(protocol)){
			return new UDPProtocolHandler();
		}
		
		return null;
	}
}

class TCPProtocolHandler implements ProtocolHandler{
	
	public void sendMessage(String message){
		System.out.println("TCP Protocol sending message - "+  message);
	}
	
}

class UDPProtocolHandler implements ProtocolHandler{
	
	public void sendMessage(String message){
		System.out.println("UDP Protocol sending message - "+  message);
	}
	
}

public class DIPDemo {

 public static void main(String[] args) {
	    MyMessenger myMessenger = new MyMessenger("UDP");
		myMessenger.send("a", "Solid is easy");
	
}
	
}
