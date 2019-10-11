


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
        int m = 0;
        int n = 0;
        int ret = 0;

        try {
            m = Integer.parseInt(args[0]);
            n = Integer.parseInt(args[1]);
            ret = div(m, n);
        } catch(ArithmeticException e) {
            System.out.println("main: " + e);
        } catch (RuntimeException e) { 
            System.out.println(e);
        }
        System.out.println("m + n = " + ret);
    }

    public static int div(int m, int n) {
        int r = 0;

        try {
            r = m/n;
        } catch (ArithmeticException e) {
            System.out.println("div: " + e);
            throw new Exception("m_error");
        } finally {
            System.out.println("finally of div");
        }
        
        return r;
    }
}


