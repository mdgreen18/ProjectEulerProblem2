package com.matthew;

public class Main {

    public static void main(String[] args) {
        fibonacciEvenSum();
    }

    public static void fibonacciEvenSum() {
        int sum = 0;
        int sequence = 0;
        int count = 0;

        while(sequence < 4000000) {

            sequence = fibonacciSequence(count);

            if(sequence % 2 == 0) {
                sum += sequence;
            }

            count++;
        }
        System.out.println(sum);
    }

    public static int fibonacciSequence(int number) {
        if(number == 0) {
            return 0;
        } else if(number == 1) {
            return 1;
        } else {
            return fibonacciSequence(number - 1) + fibonacciSequence(number - 2);
        }
    }
}
