package day2.dq3;

import java.util.*;

import Main.begin;

public class d2q3 implements begin {

	public void beginn() {
		manager m = new manager();
		m.name = "mokshith";
		m.age = 21;
		m.pho_num = "9949941712";
		m.address = "london";
		m.salary = 78746;
		m.depar = "development";
		m.printSalary();

		employee e = new employee();
		e.name = "nagi";
		e.age = 20;
		e.pho_num = "8849474399";
		e.address = "tokyo";
		e.salary = 7878309;
		e.Spec = "director";
		e.printSalary();
	}
	
	
	
}
