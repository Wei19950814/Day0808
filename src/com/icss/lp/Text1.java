package com.icss.lp;

public class Text1 {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		try {
			t.jk();
		} catch (NojikException e) {
			System.out.println(e.getMessage());
			System.out.println("·Å¼Ù¡£¡£¡£¡£");
		}
	}

}
