package com.casaone.demo;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClient;
import com.amazonaws.services.simpleworkflow.flow.ActivityWorker;
import com.amazonaws.services.simpleworkflow.flow.WorkflowWorker;

public class NotifierMain {
	  
	 public static void main(String[] args) throws Exception {
	     ClientConfiguration config = new ClientConfiguration().withSocketTimeout(70*1000);

	     String swfAccessId = "AKIAIRTO5C3OJPQ2I3VQ";
	     String swfSecretKey = "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";
	     AWSCredentials awsCredentials = new BasicAWSCredentials(swfAccessId, swfSecretKey);

	     AmazonSimpleWorkflow service = new AmazonSimpleWorkflowClient(awsCredentials, config);
	     service.setEndpoint("https://swf.us-west-2.amazonaws.com");

	     String domain = "CasaOne";

	      GreeterWorkflowImpl gwip = new GreeterWorkflowImpl();
	      gwip.sendReminder();
	   }
	
}
