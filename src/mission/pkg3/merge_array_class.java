/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mission.pkg3;

/**
 *
 * @author Abdelfattah Mohamed
 */
public class merge_array_class {
	public static final int CNT_ELEMENTS = 10000000;
	
	public static int[] left(int[] array) {
		int midpoint = array.length / 2;
    	int left[] = new int [midpoint];
    	for (int i=0;i<midpoint;i++)
    		left[i] = array[i];
    	return left;
	}
	
	public static int[] rigth(int[] array) {
		int midpoint = array.length / 2;
    	int right[];
    	if (array.length % 2 ==0) 
    		right = new int [midpoint];
    	else
    		right = new int [midpoint+1];
  
    	int x = 0;
    	for (int j= midpoint;j<array.length;j++)
    		
    			right[x++] = array[j];
    	return right;
	}
	
	public static void print(int[] array) {
		for (int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.print("\n");
	}
	
	public static int[] fill() {
		int[] temp = new int[CNT_ELEMENTS];
		for (int i=0;i<temp.length;i++)
			temp[i] = (int)(Math.random()*100);
		return temp;
	}
}
