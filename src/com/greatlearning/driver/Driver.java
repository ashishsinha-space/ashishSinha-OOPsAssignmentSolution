package com.greatlearning.driver;

import com.greatlearning.department.AdminDepartment;
import com.greatlearning.department.HRDepartment;
import com.greatlearning.department.TechDepartment;

public class Driver {

	public static void main(String[] args) {

		// Creating objects of Each Department

		AdminDepartment adminDepartment = new AdminDepartment();
		HRDepartment hRDepartment = new HRDepartment();
		TechDepartment techDepartment = new TechDepartment();

		// Display functionality of Each Department

		adminDepartment.display();
		System.out.print("\n");
		hRDepartment.display();
		System.out.println("\n");
		techDepartment.display();

	}

}
