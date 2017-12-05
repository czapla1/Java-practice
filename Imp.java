package importy;

import java.util.HashMap;
import java.util.Map;


//A non-empty zero-indexed array A consisting of N integers is given.
// The array contains an odd number of elements,
// and each element of the array can be paired with another element that has the same value,
// except for one element that is left unpaired.
//
//        For example, in array A such that:
//
//        A[0] = 9  A[1] = 3  A[2] = 9
//        A[3] = 3  A[4] = 9  A[5] = 7
//        A[6] = 9
//        the elements at indexes 0 and 2 have value 9,
//        the elements at indexes 1 and 3 have value 3,
//        the elements at indexes 4 and 6 have value 9,
//        the element at index 5 has value 7 and is unpaired.
//        Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
//
//        For example, given array A such that:
//
//        A[0] = 9  A[1] = 3  A[2] = 9
//        A[3] = 3  A[4] = 9  A[5] = 7
//        A[6] = 9
//        the function should return 7, as explained in the example above.

public class Imp {

    int solution(int A[]) {
        Integer licznik = 0;
        int wynik = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {

            licznik = map.get(A[i]);
            if (licznik == null) {
                map.put(A[i], 1);
            } else {
                map.put(A[i], licznik + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                wynik = entry.getKey();
            }
        }
        return wynik;
    }

    public static void main(String[] args) {

        Imp im = new Imp();
        System.out.println(im.solution(new int[]{9, 9, 9, 3, 7, 7, 9}));
    }
}
