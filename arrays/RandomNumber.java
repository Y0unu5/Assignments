package com.arrays;

import java.security.SecureRandom;

public class RandomNumber {
    private SecureRandom random = new SecureRandom();

    public String generateOtp() {
        int randomNum = this.random.nextInt(999999);
        return String.format("%06d", randomNum);
    }
    public static void main(String[] args) {
        RandomNumber nu=new RandomNumber();
        String res= nu.generateOtp();
        System.out.println(res);
    }
}
