package com.mph.model;



public class Employee {
		 private String ename;
		 @Override
		public String toString() {
			return "Employee [ename=" + ename + ", salary=" + salary + "]";
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		public Employee(String ename, String salary) {
			super();
			this.ename = ename;
			this.salary = salary;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		private String salary;
}
