package org.hwm.FizzBuzzGame.service;

import static java.lang.System.out;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

import org.hwm.FizzBuzzGame.entity.PrintFizzBuzz;

/**
 * for multiples of 3 print "Fizz" and for the multiples of 5 print "Buzz" for
 * numbers which are multiples of both 3 and 5 print "FizzBuzz"
 * 实现能被3整除的数打印"Fizz" 实现能被5整除的数打印"Buzz" 又是3又是5倍数的数打印 "FizzBuzz"
 * 
 * @author Weiming Hu
 *
 */

public class FizzBuzzServiceStage1 implements Service {

	public static void start() {
		// build stream what used rang stream from 1 to 100. 使用范围流从1到100构建流
		IntStream is = IntStream.rangeClosed(OFFSET_MIN, OFFSET_MAX);

		IntConsumer consumer = (offNumber -> {

			if (IS_BOTH_MULITPLES.isBothMulitples(offNumber)) {
				// check mulitples of both 3 and 5,判断是否为3和5的倍数
				out.println(PrintFizzBuzz.FIZZ_BUZZ);
			} else if (IS_MULTIPLES.isMulitples(offNumber, OFF_NUMBER_THREE)) {
				// check mulitples of 3 ,判断是否为3的倍数
				out.println(PrintFizzBuzz.FIZZ);
			} else if (IS_MULTIPLES.isMulitples(offNumber, OFF_NUMBER_FIVE)) {
				// check mulitples of 5 ,判断是否为5的倍数
				out.println(PrintFizzBuzz.BUZZ);
			} else {
				// not satisfy condition,不满足以上条件，输出数字
				out.println(offNumber);
			}

		});
		// iterator stream print result, ,迭代流并打印结果
		is.iterator().forEachRemaining(consumer);
	}

}
