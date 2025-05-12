package co.edu.unbosque.model.dto;

public class FuzzyDTO {
	private double average;
	private int attendance;
	private String monthlyIncome;
	private String monthlyExpense;
	private String monthlySavings;
	private int careerSatisfaction;
	private int careerMotivation;
	private int pensum;
	private int age;
	private int semester;
	private int teachers;
	private boolean dropOut;
		
	
	public FuzzyDTO(Double average) {
		this.average = average;
	}
	

	public FuzzyDTO(int attendance) {
		this.attendance = attendance;
	}
	
	



	public FuzzyDTO(String monthlyIncome, String monthlyExpense, String monthlySavings, int careerSatisfaction) {
		this.monthlyIncome = monthlyIncome;
		this.monthlyExpense = monthlyExpense;
		this.monthlySavings = monthlySavings;
		this.careerSatisfaction = careerSatisfaction;
	}
	
	

	

	public FuzzyDTO(int careerMotivation, int pensum, int age, int semester, int teachers, boolean dropOut) {
		this.careerMotivation = careerMotivation;
		this.pensum = pensum;
		this.age = age;
		this.semester = semester;
		this.teachers = teachers;
		this.dropOut = dropOut;
	}




	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}


	public String getMonthlyIncome() {
		return monthlyIncome;
	}


	public void setMonthlyIncome(String monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}


	public String getMonthlyExpense() {
		return monthlyExpense;
	}


	public void setMonthlyExpense(String monthlyExpense) {
		this.monthlyExpense = monthlyExpense;
	}


	public String getMonthlySavings() {
		return monthlySavings;
	}


	public void setMonthlySavings(String monthlySavings) {
		this.monthlySavings = monthlySavings;
	}


	public int getCareerSatisfaction() {
		return careerSatisfaction;
	}


	public void setCareerSatisfaction(int careerSatisfaction) {
		this.careerSatisfaction = careerSatisfaction;
	}


	public int getCareerMotivation() {
		return careerMotivation;
	}


	public void setCareerMotivation(int careerMotivation) {
		this.careerMotivation = careerMotivation;
	}


	public int getPensum() {
		return pensum;
	}


	public void setPensum(int pensum) {
		this.pensum = pensum;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSemester() {
		return semester;
	}


	public void setSemester(int semester) {
		this.semester = semester;
	}


	public int getTeachers() {
		return teachers;
	}


	public void setTeachers(int teachers) {
		this.teachers = teachers;
	}


	public boolean isDropOut() {
		return dropOut;
	}


	public void setDropOut(boolean dropOut) {
		this.dropOut = dropOut;
	}
	
	
	
	
	
}
