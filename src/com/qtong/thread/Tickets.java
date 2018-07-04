package com.qtong.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 资源类
 * @author Duchong
 *
 */
public class Tickets {
	private int total = 100;
	Lock lock = new ReentrantLock();
	public void saleTickets(){
		lock.lock();
		if(total > 0){
			total--;
			System.out.println(Thread.currentThread().getName()+"---卖出了第 "+(100-total)+" 张票，还剩 "+total+" 张票");
		}else{
			System.out.println(Thread.currentThread().getName()+"---票卖完啦!");
		}
		lock.unlock();
	}
}

// //synchronized 重锁
//	public class Tickets {
//		private int total = 100;
//		public synchronized void saleTickets(){
//			if(total > 0){
//				total--;
//				System.out.println(Thread.currentThread().getName()+"---卖出了第 "+(100-total)+" 张票，还剩 "+total+" 张票");
//			}else{
//				System.out.println(Thread.currentThread().getName()+"---票卖完啦!");
//			}
//		}
//	}


