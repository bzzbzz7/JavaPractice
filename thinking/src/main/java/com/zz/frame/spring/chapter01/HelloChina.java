package com.zz.frame.spring.chapter01;

public class HelloChina implements IHelloMessage {

	
	//继承和实现了IHelloMessage接口中的sayHello方法，
	//向大家输出了Hello China的信息
	@Override
	public String sayHello() {

		return "大家好!";
	}
}
