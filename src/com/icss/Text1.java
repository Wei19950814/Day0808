package com.icss;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class Text1 {

	public static void main(String[] args) {
		// //�����±�Խ���쳣��java.lang.ArrayIndexOutOfBoundsException
		// int[] arr = new int[3];
		// System.out.println(arr[3]);

		// //��ָ���쳣��java.lang.NullPointerException
		// int[] arr1= null;
		// System.out.println(arr1[5]);

		// ���������쳣��java.lang.ArithmeticException
		// int a= 6;
		// int b=a/0;
		// System.out.println(b);

		// //�����Infinity
		// double d=1;
		// double d2=d/0;
		// System.out.println(d2);

		// //����ת���쳣��java.lang.ClassCastException
		// String s = "abc";
		// Object obj = s;
		// Date d = (Date) obj;
		// System.out.println(d);

		// �����쳣��java.text.ParseException
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String str = "2019/8/9";
		try {
			Date d = df.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
