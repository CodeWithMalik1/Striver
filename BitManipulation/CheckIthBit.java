// Input: n = 5, i = 0
// Output: true
// Explanation: Binary representation of 5 is 101. The 0-th bit from LSB is set (1).


public class Main
{
    public static boolean checkIthBit(int n, int i) {
       return (n & (1<<i))!=0;
    }
	public static void main(String[] args) {
		int n1 = 5, i1 = 0;
        System.out.println( checkIthBit(n1, i1)); // true

        int n2 = 10, i2 = 1;
        System.out.println( checkIthBit(n2, i2)); // true

        int n3 = 10, i3 = 2;
        System.out.println( checkIthBit(n3, i3)); // false
	}
}