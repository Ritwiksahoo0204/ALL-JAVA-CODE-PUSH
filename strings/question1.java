/*  Find Majority Element: Write a function to find the majority element in an array,
 which occurs more than n/2 times where n is the size of the array. */


import java.util.*;
public class question1 {
    public static void mejorityElement(int numbers[]){
        int mejorityElement=numbers[0];
        int count=1;
        for (int i=1;i<numbers.length;i++){
            if (count==0){
                mejorityElement=numbers[i];
                count=1;
            } else if (numbers[i]=mejorityElement){
                count++;
            } else{
                count--;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size=obj.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print(i+1 +" number is : ");
            numbers[i]=obj.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println(findMaximum(numbers));

    }
    
}
