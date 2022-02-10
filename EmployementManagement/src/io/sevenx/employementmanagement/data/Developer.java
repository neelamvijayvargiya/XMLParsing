package io.sevenx.employementmanagement.data;

public class Developer extends Employee {
	
	private int bonus;

	public Developer() {
		 System.out.println("Default Emloyee Developer");
		
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
		
	}
	
	public int getBonus() {
		return this.bonus;
	}
	
	public int getSalary() {
		return getBaseSalary() + this.bonus;
	}

}
