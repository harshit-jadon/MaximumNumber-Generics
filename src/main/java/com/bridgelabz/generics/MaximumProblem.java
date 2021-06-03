package com.bridgelabz.generics;

public class MaximumProblem {
    public static Integer maximumNumber(Integer x, Integer y, Integer z) {
        Integer max =x;
        if(y.compareTo(max)>0)
            max =y;
        if(z.compareTo(max)>0)
            max =z;
        return max;
    }
    public static Float maximumNumber(Float x,Float y, Float z){
        Float max =x;
        if(y.compareTo(max)>0)
            max = y;
//        if(z.floatValue()>max.floatValue())
        if(y.compareTo(max)>0)
            max= z;
        return max;
    }
    public static String maximumNumber(String x, String y, String z){
        String max =x;
        if(y.compareTo(max)>0)
            max = y;
        if(z.compareTo(max)>0)
            max = z;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Find Maximum problem using Generics");
    }
}
