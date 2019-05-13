package org.hwm.FizzBuzzGame.core;

/**
 * check number of both in it,验证数字是否都包含 markThree和 markFive
 * 
 * @author @author Weiming Hu
 *
 */

@FunctionalInterface
public interface NumberBothIn {

	boolean isBothIn(int offNumber, int markThree, int markFive);

}
