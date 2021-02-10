package dataStructuresExercise1;

public class Main {

	public static void main(String[] args) {
		Integer[] array = new Integer[] {1,2,3,4,5,6,7,8,9};
		Integer sum = 0;
		for (Integer num: array) {
			sum += num;
		}
		System.out.println(sum);
	}

}
