package binary;

/*A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones
at both ends in the binary representation of N.
For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
 The number 20 has binary representation 10100 and contains one binary gap of length 1.
The number 15 has binary representation 1111 and has no binary gaps.
Write a function:
class Solution { public int solution(int N); }
that, given a positive integer N, returns the length of its longest binary gap.
The function should return 0 if N doesn't contain a binary gap.
For example, given N = 1041 the function should return 5, because N has binary representation 10000010001
and so its longest binary gap is of length 5.
Assume that:
N is an integer within the range [1..2,147,483,647].
Complexity:
expected worst-case time complexity is O(log(N));
expected worst-case space complexity is O(1).*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Binary {
    List<Integer> list = new ArrayList<Integer>();
    List<Integer> list1 = new ArrayList<Integer>();
    Map<Integer, Integer> map = new HashMap<>();

    int reszta;
    int roznica;
    int wynik;
    int max = Integer.MIN_VALUE;

    int solution(int N) {

        while (N != 0) {
            reszta = N % 2;
            list.add(reszta);
            N /= 2;
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                list1.add(i);
            }
        }
        if (list1.size() > 1) {
            for (int i = list1.size() - 1; i > 0; i--) {
                roznica = list1.get(i) - list1.get(i - 1);
                if (roznica > max) {
                    max = roznica;
                    wynik = roznica - 1;
                }
            }
            return wynik;
        } else {
            wynik = 0;
            return wynik;
        }
    }

    public static void main(String[] args) {
        Binary im1 = new Binary();
        System.out.println(im1.solution(11));
    }
}
