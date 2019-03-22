package thirtyDay;

class Student extends Person1 {
	private int[] testScores;

	/*
	 * Class Constructor
	 * 
	 * @param firstName - A string denoting the Person's first name.
	 * 
	 * @param lastName - A string denoting the Person's last name.
	 * 
	 * @param id - An integer denoting the Person's ID number.
	 * 
	 * @param scores - An array of integers denoting the Person's test scores.
	 */
	// Write your constructor here
	public Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
		this.testScores = testScores;

	}

	/*
	 * Method Name: calculate
	 * 
	 * @return A character denoting the grade.
	 */
	// Write your method here

	public char calculate() {

		char grade = 'a';
		int sum = 0;
		int avg = 0;
		double average = 0.0;

		for (int i = 0; i < testScores.length; i++) {
			sum = sum + testScores[i];

			// calculate average value

		}
		average = sum / testScores.length;
		avg = (int) average;

		System.out.println("Average value of array elements is : " + avg);
		if (100 >= avg && avg >= 90) {
			grade = 'O';

		} else if (90 > avg && avg >= 80) {
			grade = 'E';
		} else if (80 > avg && avg >= 70) {
			grade = 'A';
		} else if (70 > avg && avg >= 55) {
			grade = 'P';
		} else if (55 > avg && avg >= 40) {
			grade = 'D';
		} else {
			grade = 'T';
		}
		return grade;
	}

}