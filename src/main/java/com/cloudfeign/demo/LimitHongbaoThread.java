package com.cloudfeign.demo;

public class LimitHongbaoThread extends Thread {

	public LimitHongbaoThread() {
		// TODO Auto-generated constructor stub
	}

	public LimitHongbaoThread(String name) {
		this.setName(name);
	}

	public int sleep = 100;

	private static int i = 0;

	@Override
	public void run() {
		int k=0;
		while (true) {
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized ("") {
				int j = i;
				String name=j+Thread.currentThread().getName();
				HttpUtil2.getRequest("http://localhost:8769/api-b/weather/register?name="+name+"&pass=123456&token=111", "utf-8");
				System.out.println(System.currentTimeMillis() + "----" + j  + "----" + k + "----" + Thread.currentThread().getName());
				i++;
				k++;
			}
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			new LimitHongbaoThread("T" + i).start();
		}
	}

}
