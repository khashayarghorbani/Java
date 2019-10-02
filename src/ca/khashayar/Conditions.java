package ca.khashayar;

public class Conditions {
    static void condition(){
        int year = 2019;
        //year = year + 1;
        // year ++;
        //year += 1;
        //System.out.println(year); ? 2020

        // pre increment
        System.out.println("++ year = " + ++year);// ? 2020
        // post increment
        System.out.println("year ++ = " + year++);// ? 2020
        //here the year value is 2021
        System.out.println(year);// ? 2021
        year %= 2;
        System.out.println(year);// ? 1
        //Conditions
        //if blocks
        int age = 36;
        if (age > 18) {
            System.out.println("you are adult");
        } else {
            System.out.println("you are NOT adult!");
        }
        int age2 = 200;
        if (age2 >= 120) {
            System.out.println("sorry you're dead :(");
        } else if (age2 >= 18) {
            System.out.println("you are adult");
        } else {
            System.out.println("you are not adult");
        }


        boolean isLightsOn = true;
        if (isLightsOn) {
            System.out.println("turn off the lights!");
        } else {
            System.out.println("turn on the lights!");
        }

        //ternary operator
        int studentMark = 70;
        double gpa;
        //mark > 80 gpa = 4.0 otherwise gpa = 3.0
        if (studentMark >= 80) {
            gpa = 4.0;
        } else {
            gpa = 3.0;
        }
        System.out.println("Student gpa is " + gpa);
        //or
        // ternary operator
        /*gpa = (studentMark>=80) ? 4.0 :3.0;
        System.out.println("student gpa is " + gpa);
         */
        int light = 1;
        boolean go;
        go = light == 1 ? true : false;
        System.out.println( "Should I pass if the light is green? : " + go);
        System.out.println( "Should I pass if the light is red? : " + !go);
        // && AND
        // || OR
        age = 18;
        boolean parentPermission = false;
        if (age >= 18 || parentPermission){
            System.out.println("you are allowed to do stuff");
        } else{
            System.out.println("you need to grow up or you need permission");
        }
        if (age<18 && parentPermission){
            System.out.println("you need to grow up or you need permission");
        }else {
            System.out.println("you are allowed to do stuff");
        }
        // switch statement
        int dayOFWeek = 3; // 0.....6
        //0 - sunday
        //1 - monday
        // ... so on
        switch (dayOFWeek){
            case 0:
                System.out.println("its sunday");
                break;
            case 1:
                System.out.println("its monday");
                break;
            case 2:
                System.out.println("its tuesday");
                break;
            case 3:
                System.out.println("its wednesday");
                break;
            case 4:
                System.out.println("its thursday");
            case 5:
                System.out.println("its friday");
                break;
            case 6:
                System.out.println("its saturday");
                break;
            default:
                System.out.println("ops there is no such thing!");

        }
    }
}
