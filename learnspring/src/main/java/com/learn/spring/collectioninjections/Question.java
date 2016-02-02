package com.learn.spring.collectioninjections;

import java.util.Iterator;
import java.util.List;

public class Question {
	
	public Question(int id, String name, List<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	private int id;
	private String name;
	private List<String> answers;
	
	public void displayInfo() {
		System.out.println("id =  " + id);
		System.out.println("name =  " + name);
		
		Iterator<String> itr = answers.iterator();
		
		while(itr.hasNext()){
			System.out.println("answer  " + itr.next());
		}
		
	}

}
