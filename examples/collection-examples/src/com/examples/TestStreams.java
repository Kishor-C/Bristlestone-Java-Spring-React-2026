package com.examples;

import java.util.ArrayList;
import java.util.List;

public class TestStreams {
	public static void main(String[] args) {
		// assuming this list has some data related to student marks
		// you want to display those students who has got >= 35 & < 60 -> store them in another list in a sorting order
		// you want to display those students who has got >= 60 & < 70 -> store them in another list in a sorting order
		// you want to display those students who has got >= 70 -> store them in another list in a sorting order
		// you want to display those students who are < 35-> store them in another list in a sorting order
		 
		List<Integer> list = new ArrayList<Integer>();
		list.add(25);	list.add(18);	list.add(36);	list.add(38);	list.add(80);	list.add(30);
		list.add(85);	list.add(77);	list.add(71);	list.add(76);	list.add(64);	list.add(68);
		
		
		List<Integer> failedStudents = list.stream().filter(x -> x < 35).toList();
		List<Integer> passedStudents35To59 = list.stream().filter(x -> x >= 35 && x < 60).toList();
		List<Integer> passedStudents60To70 = list.stream().filter(x -> x >= 60 && x < 70).toList();
		List<Integer> passedStudents70AndAbove = list.stream().filter(x -> x >= 70).toList();
		System.out.println(failedStudents);
		System.out.println(passedStudents35To59);
		System.out.println(passedStudents60To70);
		System.out.println(passedStudents70AndAbove);
		System.out.println("_____________________filter and sort_________________________");
		List<Integer> passedStudentsAbove60Sort = list.stream().filter(x -> x >= 60).filter(x -> x >= 70)
				.sorted((a, b)->Integer.compare(a, b)).toList();
		// think that List has Products[price, rating, name], filter(price>6000).filter(rating>4).sort(priceInAsc).toList
		System.out.println(passedStudentsAbove60Sort);
		
	}
}	
