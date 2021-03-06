//Power of Two
//https://leetcode.com/problems/power-of-two/

// bit manipulation
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}

// recursive

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        else if(n == 1) {
            return true;
        }
        else if(n % 2 == 1) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }
}
// iterative
class Solution {
    
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        
        while(n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
}
// another bit manipulation

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        
        int count = 0;
        for(int i = 0; i < 32; i++) {
            if((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count == 1;
    }
}

// dp and binarySearch

class Solution {
    static int[] arr = new int[32];
    
    static {
        arr[0] = 1;
        for(int i = 1; i < 32; i++) {
            arr[i] = arr[i - 1] * 2;
        }
    }
    
    public boolean isPowerOfTwo(int n) {
        int index = Arrays.binarySearch(arr, n);
        if(index >= 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
