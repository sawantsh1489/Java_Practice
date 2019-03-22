package thirtyDay;

public class Difference {

	private int[] elements;
	public int maximumDifference;
	int difference;

	Difference(int[] elements) {

		this.elements = elements;

	}

	// Add your code here
	public void computeDifference() {
		for (int i = elements.length - 1; i > 0; i--) {
			for (int j = 0; j < elements.length; j++) {
				difference = Math.abs(elements[i] - elements[j]);
				System.out.println(difference);
				if (difference > maximumDifference) {
					maximumDifference = difference;
				}
			}
		}

	}

}
