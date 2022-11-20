package com.test.solidprinciple;

//Robert C. Martin
//Single Respoonsibility Principle
//A class should have one and only one reason to change
class AccountService{

	AccountRepository accountRepo = new AccountRepository();
	NotificationService notifyCust = new NotificationService();
	
	public void openAccount(){
		
		System.out.println("fill account internal details....");
		accountRepo.createAccount();
		notifyCust.notificationSend();
		
	}
	
}

class AccountRepository {
	
public void createAccount(){
		
		System.out.println("Store account data into the database....");
	}

}

class NotificationService {

	public void notificationSend() {

		System.out.println("welcome notification send....");
	}

}

public class SRPDemo {
	public static void main(String[] args) {
		
		AccountService accountService = new AccountService();
		accountService.openAccount();
	}

}
