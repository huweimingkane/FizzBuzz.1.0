package org.hwm.FizzBuzzGame.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.hwm.FizzBuzzGame.service.Service;
import org.junit.Test;

public class IsBothMulitplesTest {

	@Test
	public void testIsBothMulitples() {

		boolean res = Service.IS_BOTH_MULITPLES.isBothMulitples(30);
		assertEquals(true, res);

	}

}
