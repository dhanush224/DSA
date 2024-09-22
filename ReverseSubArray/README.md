Reverse sub array
Difficulty: BasicAccuracy: 31.78%Submissions: 26K+Points: 1

Given an array arr, you need to reverse a subarray of that array. The range of this subarray is given by indices L and R (1-based indexing).

Examples:

Input: arr[] = [1, 2, 3, 4, 5, 6, 7] and L = 2 and R = 4
Output: [1, 4, 3, 2, 5, 6, 7]
Explanation: After reversing the elements in range 2 to 4 (2, 3, 4), modified array is 1, 4, 3, 2, 5, 6, 7.
Input: arr[] = [1, 6, 7, 4] and L = 1 and R = 4
Output: [4, 7, 6, 1]
Explanation: After reversing the elements in range 1 to 4 (1, 6, 7, 4), modified array is 4, 7, 6, 1.


Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 106
1 ≤ L ≤ R ≤ arr.size()
