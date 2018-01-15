package net.evaroo.java.util.app;

import java.util.Random;

import net.evaroo.java.util.constants.Constants;

public class AuthKeyGenerator {

	private static final int AUTH_KEY_LENGTH = 16;
	
	public static void main(String[] args) {

		final String saltChars = new String(Constants.SALT_CHARS);
		final Random random = new Random();

		StringBuilder authkey = new StringBuilder();

		for (int i = 0; i < AUTH_KEY_LENGTH; i++) {

			int index = random.nextInt(saltChars.length());
			authkey.append(saltChars.charAt(index));

		}
		
		System.out.println(authkey.toString());

	}

}
