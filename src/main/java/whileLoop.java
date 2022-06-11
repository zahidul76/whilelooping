public class whileLoop {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            System.out.println(i);
        }
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

        int i=1;
        while (i <=5) {
            System.out.println(i);
            i+=1;
        }

        // INTERVIEW QUESTION

//		WHAT IS the difference between while Loop and Do loop
        // ANS: If condition is false then: While loop run Zero time.
        // if condition is false then Do loop run 1 times .


        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

        // req print 1 2 3 4 5 using do loop

        int x=1;
        do {
            System.out.println(x);
            x++;
        }while(x<=5);
    }
}
