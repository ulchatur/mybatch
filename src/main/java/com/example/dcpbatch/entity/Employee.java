package com.example.dcpbatch.entity;

public class Employee {
		 
	    String id;
	    String age;
	    String firstName;
	    String lastName;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + "]";
		}
	    
	    
}