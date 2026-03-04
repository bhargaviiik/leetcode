class Solution {
    public int trailingZeroes(int n) {
        // time complexity: log5(n)
        // 10=(5x2), so we gotta calculate total number of times this pair occurs in the sequence of 1 to n
        // but the total no. of 5's are always gonna be less than total no. of 2's..
        // so we dont have to worry about counting total no. of 2's, just count total no. of 5's..
        // count total number of 5's that will come in the series from 1 to n
        // that we can do using n/5.. in other words, every fifth number in the sequence will contribute a five, i.e five and every  
        // multiple of five is gonna contribute a 5..
        // but there are some numbers which may contribute more that a single five, such as 25 which is gonna contribute two fives..
        // and then 125 which is gonna contribute three fives
        // so for that we keep adding counts of every 25th, 125th...so on number
        // hence the formula becomes n/5+n/25+n/125...so on until the denominator becomes greater than the number itself..
        
        int count=0;
        for(int i=5;i<=n;i*=5){
            count+=n/i;
        }
        return count;
    }
}