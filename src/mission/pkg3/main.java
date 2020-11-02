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
public class main {
	
	public static void main(String[] args) throws InterruptedException {
		int arr[] = merge_array_class.fill();
		int left[] = merge_array_class.left(arr);
		int right[] = merge_array_class.rigth(arr);
                /*
                // to see the unsorted and sorted arrays
		System.out.print("UNSORTED ARRAY: ");
		merge_array_class.print(arr);
		*/
		long start = System.currentTimeMillis();
		
		threading_class lmt = new threading_class(left);
		threading_class rmt = new threading_class(right);
		
		Thread lthread = new Thread(lmt);
		Thread rthread = new Thread(rmt);
		
		lthread.start();
		rthread.start();
		
		lthread.join();
		rthread.join();
		
		arr = merge_sort.merge(lmt.arr_get(), rmt.arr_get());
		/*
                // to see the unsorted and sorted arrays
		System.out.print("SORTED ARRAY: ");
		merge_array_class.print(arr);
		*/
                
		long timeSpent = System.currentTimeMillis() - start;
		System.out.println("SORTING TIME: " + timeSpent + " ms.");
	}
	


}