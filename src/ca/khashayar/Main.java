package ca.khashayar;

public class Main {

    public static void main(String[] args) {
	// diffrent variables
   // byte short int long
        byte byteNumber = Byte.MAX_VALUE;
        short shortNumber = Short.MAX_VALUE;
        int intNumberMin = Integer.MIN_VALUE;
        int intNumberMax = Integer.MAX_VALUE;
        byte Bytenumbers=60;
        byte otherByte = (byte)(Bytenumbers/2);
        System.out.println("maximum number of integer is " + intNumberMax );
        System.out.println("minimum number of integer is " + intNumberMin );
        System.out.println("Byte number is " + byteNumber );
        System.out.println("Short number is " + shortNumber );
        System.out.println(otherByte);
   }
}
