package com.icss.lp;

public class Computer {
	// status=0正常 1蓝屏 2冒烟
	int status = 2;

	public void run() throws LanPingException, MaoYanException {
		if (status == 1) {
			throw new LanPingException("蓝屏时间发生了。。。。");
		}
		if (status == 2) {
			throw new MaoYanException("电脑冒烟了。。。");
		}
		System.out.println("电脑启动啦。。");
	}

	public void restart() {
		status = 0;
	}
}
