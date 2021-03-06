package impl1;

/*A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place.
For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
Write a function:
class Solution { public int[] solution(int[] A, int K); }
that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.
For example, given
    A = [3, 8, 9, 7, 6]
    K = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:
    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
For another example, given
    A = [0, 0, 0]
    K = 1
the function should return [0, 0, 0]
Given
    A = [1, 2, 3, 4]
    K = 4
the function should return [1, 2, 3, 4]
Assume that:
N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].*/
public class Rotate {

    public int[] solution(int[] A, int K) {
        if (A != null && A.length != 0) {
            for (int j = 1; j <= K; j++) {
                int temp = A[A.length - 1];
                for (int i = A.length - 2; i >= 0; i--) {
                    A[i + 1] = A[i];
                }
                A[0] = temp;
            }
            return A;
        } else return new int[]{};
    }

    public static void main(String[] args) {
        Rotate impl1 = new Rotate();
        int[] B = impl1.solution(new int[]{3, 8, 9, 7, 6}, 3);
        for (int a : B) {
            System.out.print(a + " ");
        }
    }
}
