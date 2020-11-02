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
public class merge_main_class {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = merge_array_class.fill();
		/*
                // to see the unsorted and sorted arrays
                System.out.print("UNSORTED ARRAY: ");
		merge_array_class.print(arr);
		
                */
		
		long start = System.currentTimeMillis();
		arr = merge_sort.sort(arr);
		/*
                // to see the unsorted and sorted arrays
		System.out.print("SORTED ARRAY: ");
		merge_array_class.print(arr);
		*/
		long timeSpent = System.currentTimeMillis() - start;
		System.out.println("SORTING TIME: " + timeSpent + " ms.");
	}

}