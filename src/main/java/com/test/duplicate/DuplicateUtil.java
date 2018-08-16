package com.test.duplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Kanhaiya
 *
 */
public class DuplicateUtil {

	public static Integer findDuplicate(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i<arr.length; i++) {
			if(!set.add(arr[i])) {
				//System.out.println("duplicate element = "+ arr[i]);
				return arr[i];
			}
		}
		return null;

	}

}
