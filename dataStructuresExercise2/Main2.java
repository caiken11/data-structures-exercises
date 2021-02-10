package dataStructuresExercise2;

import java.util.Arrays;

public class Main2 {

	public static double[] toPower(Integer size, Integer power) {
		double [] result = new double[size];
		
		for(int i=0; i<result.length; i++) {
			result[i] = Math.pow(i, power);
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(toPower(4,2)));
	}
}
