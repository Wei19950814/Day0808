package com.icss;

public class Text3 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int a;
		try {
			// 注意：一般情况下，异常要终止在main中
			a = m1(arr, -3);
		} catch (FuShuException e) {// e接收异常对象
			// e.printStackTrace();//打印错误信息
			System.out.println(e.getMessage());
			return;
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("释放并关闭资源。。。");
		}
		System.out.println("程序关闭。。。。");

	}

	private static int m1(int[] arr, int i) throws FuShuException {// 抛出的是异常类
		if (arr == null) {
			throw new NullPointerException("空指针异常了");
		}
		if (i >= arr.length) {
			throw new ArrayIndexOutOfBoundsException("数组下标越界异常了");
		}
		if (i < 0) {
			throw new FuShuException("下标为负数");
		}
		return arr[i];
	}

}
