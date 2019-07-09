package com.casaone.demo;

import java.util.ArrayList;

import javax.management.OperationsException;

import com.amazonaws.services.simpleworkflow.flow.annotations.Asynchronous;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;

public class GreeterWorkflowImpl implements GreeterWorkflow{
	
	//private GreeterActivitiesClient operations = new GreeterActivitiesClientImpl();
	
	//private NotifierActivitiesClient operations  = new NotifierActivitiesClientImpl();
	private NotifierActivities operations = new NotifierActivitiesImpl();

	/*
	 * @Override public void greet() { // TODO Auto-generated method stub
	 * Promise<ArrayList<User>> users = operations.getUsers(); for (User user :
	 * users.get()) { notifyUser(user); } System.out.println("A"); }
	 */

	@Override
	public void sendReminder() {
		ArrayList<User> users = operations.getUsers();
		for (User user : users) {
			notifyUser(user);
		}
		System.out.println("B");
	}
	
	
	public void notifyUser(User who) {
		ArrayList<Product> products = who.getProducts();
		long currentTime = System.currentTimeMillis();
		for (Product p : products) {
			int diffInDays = (int) ((p.getEndDate().getSeconds() - currentTime) / (1000 * 60 * 60 * 24));
	        if(diffInDays<=(15*(1000 * 60 * 60 * 24))) {
	        	System.out.println("C");
	        	System.out.println(sendNotification(who, p).get());
			}
		}
        
	}

	
	  @Asynchronous
	   private Promise<String> sendNotification(User user, Product p) {
	      String returnString = "Hello " + user.getUsername() + "!!\n"
	    		  + "Please consider paying your "+p.getName()+" bill on Time.";
	      return Promise.asPromise(returnString);
	   }
	  
	 
		
		
	/*
	 * private void sendEmail(User user, Product p) { // send reminder email about
	 * product p }
	 * 
	 * 
	 * private void sendSMS(User user, Product p) { // send reminder sms about
	 * product p }
	 */

}
