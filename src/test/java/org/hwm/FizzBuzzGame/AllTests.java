package org.hwm.FizzBuzzGame;

import org.hwm.FizzBuzzGame.core.IsBothMulitplesTest;
import org.hwm.FizzBuzzGame.core.IsMulitplesTest;
import org.hwm.FizzBuzzGame.core.NumberBothInTest;
import org.hwm.FizzBuzzGame.core.NumberIsInTest;
import org.hwm.FizzBuzzGame.core.UnpackNumberTest;
import org.hwm.FizzBuzzGame.service.FizzBuzzServiceStage1Test;
import org.hwm.FizzBuzzGame.service.FizzBuzzServiceStage2Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ IsBothMulitplesTest.class, IsMulitplesTest.class, NumberBothInTest.class, NumberIsInTest.class,
		UnpackNumberTest.class, FizzBuzzServiceStage1Test.class, FizzBuzzServiceStage2Test.class })
public class AllTests {

}
