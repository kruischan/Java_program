


/*
public class excep {
    public static void main(String args[]) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int ret = div(m, n);
        System.out.println("m + n = " + ret);
    }

    public static int div(int m, int n) {
        int r = 0;
        try {
            r = m/n;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
			System.out.println("this is finally.");
		}

        
        return r;
    }
}
*/



public class excep {
    public static void main(String args[]) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
		int ret = 0;

		try {
			ret = div(m, n);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
        System.out.println("m + n = " + ret);
    }

    public static int div(int m, int n) throws ArithmeticException {
        int r = 0;
        r = m/n;
        
        return r;
    }
}






























