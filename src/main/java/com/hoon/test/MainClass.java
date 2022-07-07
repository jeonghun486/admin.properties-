package com.hoon.test;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
//		ConfigurableEnvironment env = ctx.getEnvironment();
//		MutablePropertySources propertySources = env.getPropertySources();
//		
//		try {
//			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//GenericXmlApplicationContext gctx = (GenericXmlApplicationContext)ctx;
		//gctx.load("applicationCTX.xml");
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		
		AdminConnection adminConnection = ctx.getBean("adminconnection", AdminConnection.class);
		
		String admin_id = adminConnection.getAdminId();
		String admin_pw = adminConnection.getAdminPw();
		
		System.out.println(admin_id);
		System.out.println(admin_pw);
		
		//gctx.close();
		ctx.close();
		
	}

}
