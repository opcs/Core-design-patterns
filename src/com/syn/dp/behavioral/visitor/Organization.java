package com.syn.dp.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Organization {

	static List<Employee> empList;
	
	static {
		empList = new ArrayList<Employee>();
		
		Employee bob = new Employee("bob");
		Employee roney = new Employee("roney");
		Employee alex = new Employee("alex");
		Employee nick = new Employee("nick");
		Employee joe = new Employee("joe");
		empList.add(bob);
		empList.add(roney);
		empList.add(alex);
		empList.add(nick);
		empList.add(joe);
	}
	
	public static void ratings() {
		CEO ceo = new CEO("Mr.Jorge");
		for(Employee e: empList) {
			e.accept(ceo);
		}
	}
}
