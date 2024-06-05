package org.example.lambda;

import java.util.Comparator;

public class LambdaComparator {
    public static void main(String[] args) {
        /* prior java 8*/

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); //0 - equal ; 1 - o1>o2 ; -1  = o1<o2
            }
        };

        System.out.println("Comparator result ::: "+comparator.compare(3,2));

        /* java 8 */

        //Comparator<Integer> lambdaComparator = (Integer a, Integer b)->{return a.compareTo(b);};
        Comparator<Integer> lambdaComparator = (Integer a, Integer b)->a.compareTo(b);

        System.out.println("Lambda Comparator result ::: "+lambdaComparator.compare(3,2));

        Comparator<Integer> lambdaComparator1 = ( a,  b)->a.compareTo(b);

        System.out.println("Lambda Comparator  1 result ::: "+lambdaComparator1.compare(3,2));


    }
}
