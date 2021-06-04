package com.bridgelabz.generics;

    public class MaximumProblem <E extends Comparable>{
        E xElement;
        E yElement;
        E zElement;
        public MaximumProblem(E xElement, E yElement, E zElement) {
            this.xElement = xElement;
            this.yElement = yElement;
            this.zElement = zElement;
        }

        public E testMaximum(){
        return maximumNumber(xElement,yElement,zElement);
    }

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
