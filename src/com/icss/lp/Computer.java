package com.icss.lp;

public class Computer {
	// status=0���� 1���� 2ð��
	int status = 2;

	public void run() throws LanPingException, MaoYanException {
		if (status == 1) {
			throw new LanPingException("����ʱ�䷢���ˡ�������");
		}
		if (status == 2) {
			throw new MaoYanException("����ð���ˡ�����");
		}
		System.out.println("��������������");
	}

	public void restart() {
		status = 0;
	}
}
