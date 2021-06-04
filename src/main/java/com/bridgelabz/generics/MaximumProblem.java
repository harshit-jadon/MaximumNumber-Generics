package com.bridgelabz.generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumProblem <X extends Comparable>{
        X xElement;
        X yElement;
        X zElement;
        public MaximumProblem(X xElement, X yElement, X zElement) {
            this.xElement = xElement;
            this.yElement = yElement;
            this.zElement = zElement;
        }

        public X testMaximum(){
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
        @SafeVarargs
        public static <E extends Comparable> E maxParameters(E... elements){
            List<E> sortElements = Arrays.stream(elements).sorted().collect(Collectors.toList());
            return sortElements.get(sortElements.size()-1);
        }
        public static <T>void printmax(T x, T y, T z, T max){
            System.out.println(x +" "+y+" "+z+" "+ max);
        }

    public static void main(String[] args) {
        System.out.println("Welcome to Find Maximum problem using Generics");
        Integer xi=4, yi=9, zi=10;
        Float xf=4.4f, yf=9.9f, zf=10.2f;
        String xs="Apple",ys="Banana",zs="Peach";
        new MaximumProblem<>(xi,yi,zi).testMaximum();
        new MaximumProblem<>(xf,yf,zf).testMaximum();
        new MaximumProblem<>(xs,ys,zs).testMaximum();


    }
}
