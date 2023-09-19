public class Sequence 
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run() {
        System.out.println("HelloWorld");
        if (a == 5) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
        if (b == 2) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
        if (c != 1) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
        if (d == -8 && d==4) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
        int i = 0;
        while (i < 15) {
            System.out.println("i is " + i + " but is less than 15");
            i++;
        }
        int k = 10;
        while (k > 5) {
            System.out.println("k is " + k + " but is less than 15");
            k--;   
        }
        int a = 0;
        int b = 0;
        while (a < 10 && b <= 20) {
            System.out.println("a and b");
            a++;
            b++;
        }
    }
}