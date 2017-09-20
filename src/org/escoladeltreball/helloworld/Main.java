/**
 * 
 */
package org.escoladeltreball.helloworld;

/**
 * @author iaw21752927
 *
 */
public final class Main implements Utils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println("Hello World");
//		int[] array = {5,4,9,2,-6,85,2,6,2};
//		Main m = new Main();
//		System.out.println("Número más pequeño: "  + m.findSmallest(array));
//		System.out.println("Suma de todos los números: " + m.sum(array));
//		System.out.println("Repeticiones del número 2 en el array: " + m.frequency(array, 2));
//		System.out.println("Porcentaje de repeticiones del número 2 en el array: " + m.frequencyPercentage(array, 2) + "%");
	}

	/*
	 * (non-Javadoc)
	 * This method returns the smallest number of an integer array
	 * @see org.escoladeltreball.helloworld.Utils#findSmallest(int[])
	 */
	@Override
	public int findSmallest(int[] values) {
		int small = values[0];
		for (int i = 1; i < values.length; i++) {
			if (values[i] < small) {
				small = values[i];				
			}
		}
		return small;
	}

	/*
	 * (non-Javadoc)
	 * This method returns the sum of an integer array
	 * @see org.escoladeltreball.helloworld.Utils#findSmallest(int[])
	 */
	@Override
	public int sum(int[] values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		return sum;
	}

	@Override
	public int frequency(int[] values, int n) {
		int counter = 0;
		for (int value : values) {
			if (value == n) {		
				counter++;
			}
		}
		return counter;
	}
	
	@Override
	public double frequencyPercentage(int[] values, int n) {
		Main m = new Main();
		return m.frequency(values, n) * 100 / values.length;
	}
	
	

}
