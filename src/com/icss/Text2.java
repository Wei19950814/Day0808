package com.icss;

public class Text2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int a = m1(arr, 3);
		System.out.println(a);
	}

	private static int m1(int[] arr, int i) {
		if (i >= arr.length) {
			// �׳������±�Խ���쳣
			throw new ArrayIndexOutOfBoundsException("�����±�Խ���쳣��");
		}
		return arr[i];
	}

}
