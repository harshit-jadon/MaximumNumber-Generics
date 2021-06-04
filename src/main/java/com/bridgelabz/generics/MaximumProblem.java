package com.bridgelabz.generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        @SafeVarargs
        public static <E extends Comparable> E maxParameters(E... elements){
            List<E> sortElements = Arrays.stream(elements).sorted().collect(Collectors.toList());
            return sortElements.get(sortElements.size()-1);
        }

    public static void main(String[] args) {
        System.out.println("Welcome to Find Maximum problem using Generics");


    }
}
