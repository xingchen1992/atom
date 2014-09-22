package com.max.helloworld;

public class HelloWorld2 implements HelloApi {
	
	private String msg;
	
	public HelloWorld2(){
		msg = "hello max";
	}

	public HelloWorld2(String msg){
		this.msg = msg;
	}

	public void sayHello() {
		System.out.println(msg);

	}

}
