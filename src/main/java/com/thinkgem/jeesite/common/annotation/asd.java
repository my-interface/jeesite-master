package com.thinkgem.jeesite.common.annotation;

import com.thinkgem.jeesite.common.security.Digests;
import com.thinkgem.jeesite.common.utils.Encodes;

public class asd {
	public static void main(String[] args) {
		System.out.println(entryptPassword("admin"));
	}
	public static String entryptPassword(String plainPassword) {
		String plain = Encodes.unescapeHtml(plainPassword);
		byte[] salt = Digests.generateSalt(8);
		byte[] hashPassword = Digests.sha1(plain.getBytes(), salt, 1024);
		return Encodes.encodeHex(salt)+Encodes.encodeHex(hashPassword);
	}
}
