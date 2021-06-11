package com.javainuse.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Account;
import com.javainuse.model.Employee;

@RestController
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstService(@RequestParam int id) {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId(id);
		emp.setSalary(3000);

		return emp;
	}

	@RequestMapping(value = "/account", method = RequestMethod.POST)
	public Account secondService(@RequestBody Account account) {

		System.out.println("Inside POST Method");
		Account acc = new Account();
		acc.setK_number(account.getK_number());
		acc.setAgent_number(account.getAgent_number());
		acc.setCustomer_number(account.getCustomer_number());
		acc.setCaller_id(account.getCaller_id());

		return acc;
	}

}
