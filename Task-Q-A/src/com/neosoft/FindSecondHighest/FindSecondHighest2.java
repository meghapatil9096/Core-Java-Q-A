package com.neosoft.FindSecondHighest;

import java.util.Arrays;
import java.util.List;

//Find the second highest number present in the list
public class FindSecondHighest2 {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(3,8,6,9,2,1);
/*      (i1,i2) -> i1<i2 ? 1: i1>i2? -1: 0
        Comparator --> compare(obj1, obj2)
            return -ve iff obj1 has to come before obj2
            return +ve iff obj1 has to come after obj2
            return 0 iff obj1 and obj2 are equal
 */

        List<Integer> descendingSort = num.stream().sorted((i1,i2)->i2.compareTo(i1)).toList();

        System.out.println("Descending Order : "+descendingSort);
        System.out.println("Second Highest : "+descendingSort.get(1));
    }


}
