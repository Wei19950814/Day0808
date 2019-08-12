package com.icss;

//自定义异常类：该类必须继承exception和RuntimeException
public class FuShuException extends Exception {
	public FuShuException(String msg) {
		super(msg);
	}
}
