package org.hwm.FizzBuzzGame.service;

import java.util.function.IntBinaryOperator;

import org.hwm.FizzBuzzGame.core.IsBothMulitples;
import org.hwm.FizzBuzzGame.core.IsMulitples;
import org.hwm.FizzBuzzGame.core.NumberBothIn;
import org.hwm.FizzBuzzGame.core.NumberIsIn;
import org.hwm.FizzBuzzGame.core.NumberWrap;
import org.hwm.FizzBuzzGame.core.UnpackNumber;

/**
 * Implementation of Main Algorithms 主要算法实现通过 is a关系调用
 * 
 * @author @author Weiming Hu
 *
 */
public interface Service {
	// it use to div Verify ,用于验证求余结果
	int ZERO = 0;
	// get Single digit ,获得个位数
	int SINGLE = 1;
	// get Ten digit,获得十位数
	int TENTH = 10;
	// int RUN_MARK = 2;
	// offset begin 最小的迭代偏移量
	int OFFSET_MIN = 1;
	// offset close 最大的迭代偏移量
	int OFFSET_MAX = 100;
	// divider 3 ,测试码被除数3
	int OFF_NUMBER_THREE = 3;
	// divider 5,测试码被除数5
	int OFF_NUMBER_FIVE = 5;

	/**
	 * get offNumber single digit or ten digit,divider is single or ten ,获得个位数或十位数
	 */
	IntBinaryOperator SINGLE_UNITS = ((offNumber, divider) -> (offNumber / divider) % TENTH);

	/**
	 * check offNumber can div with divider ,验证是否能被整除
	 */
	IsMulitples IS_MULTIPLES = ((offNumber, divider) -> (offNumber % divider) == ZERO);

	/**
	 * check offNumber is mulitples of both 3 and 5,判断是否为3和5的倍数
	 */
	IsBothMulitples IS_BOTH_MULITPLES = (offNumber) -> (IS_MULTIPLES.isMulitples(offNumber, OFF_NUMBER_THREE)
			&& IS_MULTIPLES.isMulitples(offNumber, OFF_NUMBER_FIVE)) ? true : false;

	/**
	 * uppack offNumber ,将数字分解为个位和十位
	 */
	UnpackNumber unpackNumber = ((offNumber) -> {
		int tenRes = SINGLE_UNITS.applyAsInt(offNumber, TENTH);
		int singleRes = SINGLE_UNITS.applyAsInt(offNumber, SINGLE);
		return new NumberWrap(tenRes, singleRes);
	});

	/**
	 * check offNumber has markNumber in it ,判断数字是否包含markNumber
	 */
	NumberIsIn HAS_SELF = ((offNumber, markNumber) -> {
		NumberWrap waper = unpackNumber.unPack(offNumber);
		if ((waper.getTenValue() == markNumber) || (waper.getSingleValue() == markNumber)) {
			return true;
		}
		return false;
	});

	/**
	 * check offNumber has makerThree in it and maker five in it ,判断offNumber是否都今含
	 * makerThree和makerFive
	 */
	NumberBothIn bothIn = ((offNumber, makerThree, makerFive) -> {
		NumberWrap wrap = unpackNumber.unPack(offNumber);
		int tenValue = wrap.getTenValue();
		int singletValue = wrap.getSingleValue();
		if (((tenValue == makerThree) || (tenValue == makerFive))
				&& ((singletValue == makerThree || singletValue == makerFive))) {
			return true;
		}
		return false;
	});

}
