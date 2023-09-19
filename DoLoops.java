public class DoLoops 
{
    public void run() {
        int i = 0;
        do {
            System.out.println("i is " + i + " but is less than 15");
            i++;
        } while (i < 15);
        int k = 10;
        do {
            System.out.println("k is " + k + " but is less than 15");
            k--;   
        } while (k > 5);
        int a = 0;
        int b = 0;
        do {
            System.out.println("a and b");
            a++;
            b++;
        } while (a < 10 && b <= 20);
    }
}
