/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Solution {
    public int[] getConcatenation(int[] nums) {
        
           int n =nums.length;
           int[] ans=new  int[n*2];
           for(int i=0; i < n ;i++){
               ans[i]=nums[i];
               ans[i+n]=nums[i];


           }
           return ans;
            
        
    }
}