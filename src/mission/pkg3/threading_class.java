/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * merge_thread.java
 */
package mission.pkg3;

/**
 *
 * @author Abdelfattah Mohamed
 */
public class threading_class implements Runnable {
	private int[] arr;
	
	public threading_class(final int[] array) {
		this.arr = array;
	}
	
	public int[] arr_get() {
		return this.arr;
	}

	@Override
	public void run() {
		this.arr = merge_sort.sort(arr);
	}
	
}