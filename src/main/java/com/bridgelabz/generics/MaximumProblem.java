package com.bridgelabz.generics;

public class MaximumProblem <X,Y,Z extends Comparable>{
    X xElement;
    Y yElement;
    Z zElement;

    public MaximumProblem(X xElement, Y yElement, Z zElement) {
        this.xElement = xElement;
        this.yElement = yElement;
        this.zElement = zElement;
    }
//    public void maximumNumber(X xElement, Y yElement, Z zElement){
//        maximumNumber(xElement);
//        maximumNumber(yElement);
//        maximumNumber(zElement);
//    }


    public static <E extends Comparable> E maximumNumber (E x, E y, E z){
        E max =x;
        if(y.compareTo(max)>0)
            max = y;
        if(z.compareTo(max)>0)
            max =z;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Find Maximum problem using Generics");

    }
}
