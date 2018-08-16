package com.test.duplicate;

/**
 * 
 * @author Kanhaiya
 *
 */
public class TestMain {
	
	public static void main(String[] args) {
		System.out.println("========= Start Main =============");
		int [] arry = {3,1,5,6,2};
		
		Integer duplicateNum =  DuplicateUtil.findDuplicate(arry);
		if(duplicateNum != null) {
			System.out.println("Duplicate number : = "+ duplicateNum);
		}
		
		System.out.println("========= End of Main =============");
		
	}

}
