package com.example;

public class hardControl {
	static {
		try {
			System.loadLibrary("hardControl");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static native int led_ctrl(int which, int status);
	public static native int led_open();
	public static native void led_close();

	public static void main(String args[]) {
		
	}

}












