package com.qtong.thread;

/**
 * 此类用于模拟 三个窗口随机卖100张票
 * 多线程编程方法:
 * 	1.线程 操作 资源类
 * 	2.高内聚、低耦合
 * @author Duchong
 *
 */
public class SaleTickets {

	public static void main(String[] args) {
		//jdk1.7  ts 需要final修饰  jdk1.8不需要
		final Tickets ts = new Tickets();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					ts.saleTickets();
				}
			}
		},"窗口-1").start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					ts.saleTickets();
				}
			}
		},"窗口-2").start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					ts.saleTickets();
				}
			}
		},"窗口-3").start();;
	}
}
