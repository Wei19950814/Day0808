package com.icss;

public class Text3 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int a;
		try {
			// ע�⣺һ������£��쳣Ҫ��ֹ��main��
			a = m1(arr, -3);
		} catch (FuShuException e) {// e�����쳣����
			// e.printStackTrace();//��ӡ������Ϣ
			System.out.println(e.getMessage());
			return;
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("�ͷŲ��ر���Դ������");
		}
		System.out.println("����رա�������");

	}

	private static int m1(int[] arr, int i) throws FuShuException {// �׳������쳣��
		if (arr == null) {
			throw new NullPointerException("��ָ���쳣��");
		}
		if (i >= arr.length) {
			throw new ArrayIndexOutOfBoundsException("�����±�Խ���쳣��");
		}
		if (i < 0) {
			throw new FuShuException("�±�Ϊ����");
		}
		return arr[i];
	}

}
