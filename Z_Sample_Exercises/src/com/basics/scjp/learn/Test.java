package com.basics.scjp.learn;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress thisIp = InetAddress.getLocalHost();
		String ip = thisIp.getHostAddress();
		System.out.println(ip);
	}

}
