package org.hwm.FizzBuzzGame.core;

/**
 * 
 * check a number has in it,验证数字是包含markNumber
 * 
 * @author @author Weiming Hu
 *
 */
@FunctionalInterface
public interface NumberIsIn {
	boolean isHasSelf(int offNumber, int markNumber);
}
