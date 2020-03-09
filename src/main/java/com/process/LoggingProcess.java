package com.process;
import com.schema.*;

import javax.jms.ConnectionFactory;

import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.Component;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;
//import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.log4j.*;


public class LoggingProcess {
	static Logger logger= Logger.getLogger(LoggingProcess.class.getName());
	public static void main(String arge[])throws Exception
	{
		LogDetails logDetails=new LogDetails();
		logDetails.setLogLevel(0);
		logDetails.setMessage("Hello");
		logDetails.setMsgCode("msgCode-100");
		logDetails.setMsgTime("10min");
		logDetails.setProcessName("ProcessNAme");
		logDetails.setStepName("step2");
		loggerMethod(logDetails);
		
	}
	public static void loggerMethod(LogDetails logDetails)throws Exception
	{
		//logger.debug(logDetails);
		CamelContext context=new DefaultCamelContext();
		ConnectionFactory connectionFactory=new ActiveMQConnectionFactory();
		context.addComponent("jms", (Component) JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
		//logger.info(a);
		//logger.error("Please:Error");
		//logger.warn("Please:Warn");
		//logger.debug("Please:Debug");
		//logger.fatal("Please:Fatal");
		context.addRoutes(new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				// TODO Auto-generated method stub
				
				from("direct:start")
				.process(new Processor() {
					
					public void process(Exchange exchange) throws Exception {
						// TODO Auto-generated method stub
						LogDetails l=exchange.getIn().getBody(LogDetails.class);
						if(l.getLogLevel()==0)
							logger.warn("HEllo");
						exchange.getOut().setBody(l.toString());
						
					}
				})
				//.log((LoggingLevel)header("ll"), message)
				.to("log:?level=INFO")
				.to("jms:infoqueue")
				.setHeader("ena", constant("yes"))
				.choice()
				.when(header("ena").isEqualTo("yes"))
				.process(new Processor() {
					
					public void process(Exchange exchange) throws Exception {
						// TODO Auto-generated method stub
						ApplicationDetails a=new ApplicationDetails();
						a.setApplicationName("ApplicationNAme");
						a.setApplicationVersion("1.0");
						a.setInstanceId("101");
						a.setOperationName("Operation Name");
						a.setServiceName("serviceName");
						a.setServiceVersion("2.0");
						TransactionDetails t=new TransactionDetails();
						Key k=new Key();
						BusinessRefrenceId b =new BusinessRefrenceId();
						b.setName("BidName");
						b.setValue("BSetValues");
						k.setName("Key Namr");
						k.setValue("ket Value");
						t.setGtId("1");
						t.setMessageId("MId1");
						t.setKey(k);
						t.setBusinessRefrenceId(b);
						logger.info(t);
						logger.info(a);
						
					}
				})
				//.to("seda:end")
				.setHeader("bunch",constant("yes"))
				.choice()
				.when(header("bunch").isEqualTo("yes"))
				.process(new Processor() {
					
					public void process(Exchange exchange) throws Exception {
						// TODO Auto-generated method stub
						String l=exchange.getIn().getBody(String.class);
						ApplicationDetails a=new ApplicationDetails();
						a.setApplicationName("ApplicationNAme");
						a.setApplicationVersion("1.0");
						a.setInstanceId("101");
						a.setOperationName("Operation Name");
						a.setServiceName("serviceName");
						a.setServiceVersion("2.0");
						TransactionDetails t=new TransactionDetails();
						Key k=new Key();
						BusinessRefrenceId b =new BusinessRefrenceId();
						b.setName("BidName");
						b.setValue("BSetValues");
						k.setName("Key Namr");
						k.setValue("ket Value");
						t.setGtId("1");
						t.setMessageId("MId1");
						t.setKey(k);
						t.setBusinessRefrenceId(b);
						exchange.getOut().setBody(l+"\n"+t+"\n"+a);
						//System.out.println("hello------"+exchange.getIn().getBody(String.class));
					}
				})
				.to("jms:tranqueue")
				//.log(LoggingLevel.INFO,"Bunch")
				.to("log:?level=error")
				.otherwise()
				.log(LoggingLevel.INFO,"Single")
				.endChoice()
				.otherwise()
				.process(new Processor() {
					
					public void process(Exchange exchange) throws Exception {
						// TODO Auto-generated method stub
						//LogDetails h=exchange.getIn().getBody(LogDetails.class);
						System.out.println("End Process");
					}
				})
				.to("mock:result");
				
				from("jms:tranqueue").to("seda:end");
				
			}
		});
		context.start();
		ProducerTemplate producerTemplate=context.createProducerTemplate();
		producerTemplate.sendBody("direct:start", logDetails);
		ConsumerTemplate consumerTemplate=context.createConsumerTemplate();
		String m=consumerTemplate.receiveBody("seda:end", String.class);
		System.out.print("m-------"+m);
	}
	
}
