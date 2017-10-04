package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("write quantity of your elements: ");
        int amountElements = Integer.parseInt(bufferedReader.readLine());

        double[] array = new double[amountElements];
        System.out.println("write down elements (one by one)");
        for (int i = 0; i < array.length; i++) {

            System.out.println(i);
            array[i] =  Double.parseDouble(bufferedReader.readLine());
        }
        double k = 0.0;
        for (int i = 0; i < array.length; i++) {
            double a = array[i] + array[array.length -1 - i];
            if (k < a) k = a;

        }
        System.out.printf("max sum of element is: %.10f", k);

    }
}
