package org.hwm.FizzBuzzGame.service;

import static java.lang.System.out;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

import org.hwm.FizzBuzzGame.entity.PrintFizzBuzz;

/**
 * a number is Fizz if it is divisible by 3 or if it has a 3 in it, a number is
 * Buzz if it is divisible by 5 or if it has a 5 in it, a number is FizzBuzz if
 * it satisfy above 2 criterias together
 * 
 * 实现能被3整除或者包含数字3的数打印"Fizz" 实现能被5整除或包含数字5的数打印"Buzz" 同时满足以上两个条件的打印 "FizzBuzz"
 * 
 * @author @author Weiming Hu
 *
 */
public class FizzBuzzServiceStage2 implements Service {

	public static void start() {
		//build stream what used rang stream from 1 to 100. 使用范围流从1到100构建流
		IntStream is = IntStream.rangeClosed(OFFSET_MIN, OFFSET_MAX);

		IntConsumer consumer = (offNumber -> {
			// check mulitples of  both 3 and 5,判断是否为3和5的倍数
			if (IS_BOTH_MULITPLES.isBothMulitples(offNumber)) {
				out.println(PrintFizzBuzz.FIZZ_BUZZ);

			} else if (IS_MULTIPLES.isMulitples(offNumber, OFF_NUMBER_THREE)
					&& HAS_SELF.isHasSelf(offNumber, OFF_NUMBER_FIVE)) {
				//check mulitples of 3 and it has a 5 in it ,判断是否为3的倍数并且包含数字5
				out.println(PrintFizzBuzz.FIZZ_BUZZ);
			} else if (IS_MULTIPLES.isMulitples(offNumber, OFF_NUMBER_FIVE)
					&& HAS_SELF.isHasSelf(offNumber, OFF_NUMBER_THREE)) {
				//check mulitples of 5 and it has a 3 in it ,判断是否为5的倍数并且包含数字3
				out.println(PrintFizzBuzz.FIZZ_BUZZ);
			} else if (bothIn.isBothIn(offNumber, OFF_NUMBER_THREE, OFF_NUMBER_FIVE)) {
				//check a numbers has 5 and 3 in it ,判断是否包含数字5和数字3
				out.println(PrintFizzBuzz.FIZZ_BUZZ);
			} else if (IS_MULTIPLES.isMulitples(offNumber, OFF_NUMBER_THREE)) {
				//check mulitples of 3 ,判断是否为3的倍数
				out.println(PrintFizzBuzz.FIZZ);
			} else if (IS_MULTIPLES.isMulitples(offNumber, OFF_NUMBER_FIVE)) {
				//check mulitples of 5 ,判断是否为5的倍数
				out.println(PrintFizzBuzz.BUZZ);
			} else if (HAS_SELF.isHasSelf(offNumber, OFF_NUMBER_THREE)) {
				//check a numbers has 3 in it，,判断是否包含数字3
				out.println(PrintFizzBuzz.FIZZ);
			} else if (HAS_SELF.isHasSelf(offNumber, OFF_NUMBER_FIVE)) {
				//check a numbers has 5 in it，,判断是否包含数字5
				out.println(PrintFizzBuzz.BUZZ);
			} else {
				//not satisfy condition,不满足以上条件，输出数字
				out.println(offNumber);
			}
		});
		//iterator stream print result, ,迭代流并打印结果
		is.iterator().forEachRemaining(consumer);
	}

}
