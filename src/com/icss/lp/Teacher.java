package com.icss.lp;

public class Teacher {
	Computer c;

	public Teacher() {
		c = new Computer();
	}

	public void jk() throws NojikException {
		try {
			c.run();
			System.out.println("��ʼ�ϿΡ�����");
		} catch (LanPingException e) {
			System.out.println(e.getMessage());
			c.restart();
			jk();
		} catch (MaoYanException e) {
			System.out.println(e.getMessage());
			LianXi();
			throw new NojikException("�����˿Ρ�����");
		}
	}

	public void LianXi() {
		System.out.println("����ϰ��������");
	}
}
