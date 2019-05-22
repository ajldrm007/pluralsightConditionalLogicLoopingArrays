package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /*
        int v1 = 7;
        int v2 = 5;
        int vMax = v1 > v2 ? v1 : v2;
        System.out.println("vMax: " + vMax);

        float students = 30;
        float rooms = 4;

        float studentsPerRoom = rooms == 0.0f ? 0.0f : students/rooms;
        System.out.println("Students Per Room: " + studentsPerRoom);


        v1 = 4;
        v2 = 40;
        if(v1>v2){System.out.println("v1 is bigger");}
        else System.out.println("v1 is not bigger");

        v1 = 10;
        v2 = 40;

        if(v1 > v2)
            System.out.println("v1 is bigger");
        else if (v1 < v2)
            System.out.println("v2 is bigger");
        else
            System.out.println("v1 and v2 are equal");



        int v1 = 10, v2 = 4, diff;
        if(v1>v2){
            diff = v1-v2;
            System.out.println("v1 is bigger");
            System.out.println(diff);
        }
        else if (v2>v1){
            diff = v2 - v1;
            System.out.println("v2 is bigger");
            System.out.println(diff);
        }
        else
            System.out.println("v1 and v2 are equal");



        int students = 150;
        int rooms = 0;

        if(rooms>0 && students/rooms>30){System.out.println("Crowded!!");}

        System.out.println();
        System.out.println("** end program **");



        double val1 = 100.0d;
        double val2 = 0.0d;
        double result = 0.0d;
        char opCode = 'd';

        if(opCode == 'a')
            result = val1 + val2;
        else if(opCode == 's')
            result = val1 - val2;
        else if (opCode == 'd')
            result = val2 != 0.0d ? val1 / val2:0.0d;
        else if (opCode == 'm')
            result = val1 * val2;
        else
            System.out.println("Error - invalid opCode");
            result = 0.0d;
        System.out.println(result);
*/
        int kVal = 5;
        int factorial = 1;
        /*
        while(kVal > 1){
            factorial *= kVal;
            kVal -= 1;
            System.out.println(factorial);
        }

        while(kVal > 1){
            factorial *= kVal--;
            System.out.println(factorial);
        }
*/
        /*
        int iVal = 5;
        do{
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);

        }while(iVal < 100);

         */
/*
        for(int iVal = 1; iVal < 100; iVal *= 2){
            System.out.println(iVal);
        }

 */
        //arrays
        /*
        float[] theVals = new float[3];
        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 15.0f;

        float sum = 0.0f;
        for (int i = 0; i < theVals.length; i++)
        {
            sum+=theVals[i];
            System.out.println(sum);

        }
        System.out.println(sum);

         */

        float[] theVals = {10.0f, 20.0f, 15.0f};
        float sum = 0.0f;
        for(int i = 0; i < theVals.length; i++){
            sum+=theVals[i];
            System.out.println(sum);
        }
        System.out.println(sum);

    }
}
