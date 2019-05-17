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

         */

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



    }
}
