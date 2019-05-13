package org.hwm.FizzBuzzGame.core;

import static org.junit.Assert.*;

import org.hwm.FizzBuzzGame.service.Service;
import org.junit.Test;

public class UnpackNumberTest {

	@Test
	public void testUnPack() {
		NumberWrap nw=Service.unpackNumber.unPack(39);
		assertNotNull(nw);
		assertEquals(3,nw.getTenValue());
		assertEquals(9,nw.getSingleValue());
	}

}
