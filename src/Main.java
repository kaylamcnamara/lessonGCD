public class Main {

public static int gcd(int a,int b) {
    int c;
    while(b != 0) {
        c = a;
        a = b;
        b = c % b;
    }
    return a;
}

    public static void main(String[] args) {
	    // write your code here
	    System.out.println(gcd(21, 49));
    }
}
