package org.hwm.FizzBuzzGame.core;

/**
 * 
 * wrap value is what {@link}unpackNumber 包装被分解的值
 * 
 * @author Weiming Hu
 *
 */
public class NumberWrap {
	
	int tenValue;
	int singleValue;

	public NumberWrap(int leftValue, int rightValue) {
		this.tenValue = leftValue;
		this.singleValue = rightValue;
	}

	public int getTenValue() {
		return tenValue;
	}

	public void setTenValue(int tenValue) {
		this.tenValue = tenValue;
	}

	public int getSingleValue() {
		return singleValue;
	}

	public void setSingleValue(int singleValue) {
		this.singleValue = singleValue;
	}

	
}
