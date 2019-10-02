package ca.khashayar;

public class Loop {
    static void Loop(){
        System.out.println("test from loop method");
        //2 conditional loop
        // first one is counter loop - for
        // second one is conditional loop - while
        System.out.println("________");
        System.out.println("printing from 1 - 10 number");
        for (int i = 0; i < 10; i +=1){
            int Print = i + 1;
            System.out.println(Print);
        }

        System.out.println("________");
        System.out.println("printing the power of 2 starting from 10 to 0");
        for (int i = 10; i > 0 ; i-= 1) {
            System.out.println("2 ^ " + i + " = " + Math.pow(2,i));

        }
        for (char i ='A' ; i <= 'Z' ; i+=1) {
            System.out.println(i + " ");

        }
    }
}
