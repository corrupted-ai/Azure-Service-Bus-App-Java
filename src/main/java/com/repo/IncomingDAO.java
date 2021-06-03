package com.repo;

import com.models.Incoming;
import com.azure.messaging.servicebus.*;



import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;


public class IncomingDAO {
	static String connectionString = "Endpoint=sb://spinner1.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=FMPEx4x3kHQHj1MCamEdlwMH0jRvPxxKs3jA0VS8lS8=";
	
	public String callServiceBus(Incoming i) {
		 String message = "[" + i.getPipeline() + "," +i.getMessage()+"]";
		 ServiceBusSenderClient senderClient = new ServiceBusClientBuilder()
		            .connectionString(connectionString)
		            .sender()
		            .topicName(i.getTopicName())
		            .buildClient();
		    senderClient.sendMessage(new ServiceBusMessage(message));
		
		
		return "success";
	}

	
}
