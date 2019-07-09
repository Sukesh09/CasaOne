package com.casaone.demo;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClient;
import com.amazonaws.services.simpleworkflow.flow.ActivityWorker;
import com.amazonaws.services.simpleworkflow.flow.WorkflowWorker;

public class NotifierWorker {
	public static void main(String[] args) {
		ClientConfiguration config = new ClientConfiguration().withSocketTimeout(70*1000);

	     String swfAccessId = "AKIAIRTO5C3OJPQ2I3VQ";
	     String swfSecretKey = "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";
	     AWSCredentials awsCredentials = new BasicAWSCredentials(swfAccessId, swfSecretKey);

	     AmazonSimpleWorkflow service = new AmazonSimpleWorkflowClient(awsCredentials, config);
	     service.setEndpoint("https://swf.us-west-2.amazonaws.com");

	     String domain = "CasaOne";
	     String taskListToPoll = "EndDateReminder";

	     ActivityWorker aw = new ActivityWorker(service, domain, taskListToPoll);
	     
			try {
				aw.addActivitiesImplementation(new NotifierActivitiesImpl());
			    aw.start();
			} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (NoSuchMethodException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		

	     WorkflowWorker wfw = new WorkflowWorker(service, domain, taskListToPoll);
	     try {
			wfw.addWorkflowImplementationType(GreeterWorkflowImpl.class);
		    wfw.start();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
