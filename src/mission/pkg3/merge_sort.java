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
public class merge_sort {
	
	public static int[] sort(int[] B) {
    	if (B.length <= 1)
    		return B;
		int left[] = merge_array_class.left(B);
		int right[] = merge_array_class.rigth(B);
    	left = sort(left);
    	right = sort(right);
    	return merge(left, right);
    	
    }
    
    public static int[] merge(int[] left, int[] right) {
    	int lengthResult = left.length + right.length;
    	int[] result = new int [lengthResult];
    	int indexL = 0;
    	int indexR = 0;
    	int indexRes = 0;
    	
    	while (indexL < left.length || indexR < right.length) {
    		if (indexL < left.length && indexR < right.length) {
    			if (left[indexL] <= right[indexR]) { 
    				result[indexRes++] = left[indexL++];
    			} else {
    				result[indexRes++] = right[indexR++];
    			}
    		} else if (indexL < left.length) {
    			result [indexRes++] = left[indexL++];
    		} else if (indexR < right.length) {
    			result [indexRes++] = right[indexR++];
    		}
    	}
    	return result;
    }

}
