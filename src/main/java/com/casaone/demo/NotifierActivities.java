package com.casaone.demo;

import java.util.ArrayList;

import com.amazonaws.services.simpleworkflow.flow.annotations.Activities;
import com.amazonaws.services.simpleworkflow.flow.annotations.ActivityRegistrationOptions;


@ActivityRegistrationOptions(defaultTaskScheduleToStartTimeoutSeconds = 300,
								defaultTaskStartToCloseTimeoutSeconds = 10)
@Activities(version="2.0")
public interface NotifierActivities {
	   public ArrayList<User> getUsers();
	   public ArrayList<Product> getProducts();
	//   public void notify(User who);
}
