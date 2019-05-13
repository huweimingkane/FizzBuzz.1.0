package org.hwm.FizzBuzzGame.core;

import static org.junit.Assert.*;

import org.hwm.FizzBuzzGame.service.Service;
import org.junit.Test;

public class IsMulitplesTest {

	@Test
	public void testIsMulitples() {
		boolean res=Service.IS_MULTIPLES.isMulitples(33,Service.OFF_NUMBER_THREE);
		assertEquals(true, res);
		
		res=Service.IS_MULTIPLES.isMulitples(55,Service.OFF_NUMBER_FIVE);
		assertEquals(true, res);
	}

}
