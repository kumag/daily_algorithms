//Happy Number
//https://leetcode.com/problems/happy-number/
class Solution {
    public Map<Integer, Integer> map = new HashMap<>();
        
    public boolean isHappy(int n) {
        if(map.get(n) != null) {
            if(map.get(n) == 1) {
                return true;
            }
            else if(map.get(n) == 2) {
                return false;
            }
        }
        
        int sum = digitSquareSum(n);
        
        while(sum != 1) {
            if(map.get(n) != null) {
                if(map.get(n) == 2) {
                    return false;
                }
            }
            
            map.put(n, 2);
            n = sum;
            sum = digitSquareSum(n);
        }
        
        map.put(n, 1);
        
        return true;
    }
    
    public int digitSquareSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += (n % 10)*(n % 10);
            n /= 10;
        }
        return sum;
    }
}
