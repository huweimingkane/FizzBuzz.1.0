package org.hwm.FizzBuzzGame.core;

/**
 * unpack number what to ten value and to right value 分解数字为十位和个位
 * 
 * @author Weiming Hu
 *
 */
@FunctionalInterface
public interface UnpackNumber {

	NumberWrap unPack(int offNumber);

}
