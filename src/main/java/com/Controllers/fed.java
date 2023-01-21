package com.Controllers;

public class fed {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            int count = 0;
            for(int j = 1; j <= i; i++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(i);
            }
        }
    }
}
