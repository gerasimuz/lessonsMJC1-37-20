package edu.academy;

public class Solution {

    public int solution(int number) {
        int sum = 0;
       for (int i=0; i<number;i++){
           if((i%3==0)||(i%5==0)){
               sum+=i;
           }
       }
       return sum;
    }

    public static void main(String[] args) {
        Solution reshenie = new Solution();
        System.out.println(reshenie.solution(13));
    }
}

