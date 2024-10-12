class Solution {
    static long MOD = 1000000007; // Given constraint for modulo

    public long multiplyTwoLists(Node first, Node second) {
        long num1 = 0;
        long num2 = 0;

        // Traverse the first linked list and convert it to a number
        while (first != null) {
            num1 = (num1 * 10 + first.data) % MOD;
            first = first.next;
        }

        // Traverse the second linked list and convert it to a number
        while (second != null) {
            num2 = (num2 * 10 + second.data) % MOD;
            second = second.next;
        }

        // Return the product of the two numbers modulo 10^9 + 7
        return (num1 * num2) % MOD;
    }
}