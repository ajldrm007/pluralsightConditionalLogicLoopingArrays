package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int v1 = 7;
        int v2 = 5;
        int vMax = v1 > v2 ? v1 : v2;
        System.out.println("vMax: " + vMax);

        float students = 30;
        float rooms = 4;

        float studentsPerRoom = rooms == 0.0f ? 0.0f : students/rooms;
        System.out.println("Students Per Room: " + studentsPerRoom);
    }
}
