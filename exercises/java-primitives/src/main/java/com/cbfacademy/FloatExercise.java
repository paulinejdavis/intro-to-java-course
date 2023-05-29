package com.cbfacademy;

public class FloatExercise {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        // Create an array to hold 12 float elements
        float[] floatArray = new float[12];

        // Initialize the array with float values
        for (int i = 0; i < floatArray.length; i++) {
            floatArray[i] = (float) (i + 1) * 1.2f;
        }

        // Print the elements of the float array
        for (float element : floatArray) {
            System.out.println(element);
        }
    }
}
