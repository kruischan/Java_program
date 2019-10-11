
public class nativeTest {
	static {
		//System.load("/mnt/chenkaicong/java_file/Java_program/07_jni/libnativeTest.so");
		System.loadLibrary("nativeTest");
	}

	public static native void nativePrint();

	public static void main(String args[]) {
		nativePrint();
	}
}





