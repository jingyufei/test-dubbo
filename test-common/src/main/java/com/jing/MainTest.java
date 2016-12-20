package com.jing;

import com.jing.entity.User;


public class MainTest {

	public static void main(String[] args) {
		
		User user1 = new User("小明",20);
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				user1.userInfo(user1);
			}
		},"t1");
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				user1.userInfo(user1);
			}
		},"t2");
		
		thread1.start();
		thread2.start();
	}
}
