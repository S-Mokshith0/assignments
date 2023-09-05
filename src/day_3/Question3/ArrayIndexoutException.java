package day_3.Question3;

import Main.begin;

public class ArrayIndexoutException {
	public void Arrayexception() {
		int[] array = {1,2,3,4,5};
		try {
			for(int i=0;i<6;i++) {
				System.out.println(array[6]);
			}
		}catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("There is a array index out of bound exeception: "+exception);
		}
	}

}
