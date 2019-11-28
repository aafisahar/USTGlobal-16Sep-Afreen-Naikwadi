package com.ustglobal.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class XmlComponentScanApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanscomponent.xml");
		
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("I love my parents");
		System.out.println(hello.getMsg());
		
		System.out.println("***************");
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("Minnu");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}

}
