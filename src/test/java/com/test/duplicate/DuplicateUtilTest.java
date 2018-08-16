package com.test.duplicate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * @author Kanhaiya
 *
 */
public class DuplicateUtilTest {
	
	@Test
	public void testGetDuplicte() {
		int [] arry = {3,1,3,6,2};
		Integer duplicate =  DuplicateUtil.findDuplicate(arry);
		assertEquals(duplicate.intValue(), 3);
	}
	
	@Test
	public void testFailedDuplicte() {
		int [] arry = {3,1,4,6,2};
		Integer duplicate =  DuplicateUtil.findDuplicate(arry);
		assertNull(duplicate);
	}
	
	@Test
	public void testNotSameDuplicte() {
		int [] arry = {3,1,4,1,2};
		Integer duplicate =  DuplicateUtil.findDuplicate(arry);
		assertNotSame(duplicate.intValue(), 5);
	}
	
	@Test
	public void testNotNullDuplicte() {
		int [] arry = {3,1,4,3,2};
		Integer duplicate =  DuplicateUtil.findDuplicate(arry);
		assertNotNull(duplicate);
	}

}
