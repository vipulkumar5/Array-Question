 import java.util.*;
    public class Arrays{
    public static void main(String[]args){
        //number of size
        
        System.out.println("Enter a number of size= ");
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int[]nums = new int[size];
       // input number
       
        for(int i=0;i<size;i++){
           System.out.println("Enter a numbers :");
            nums[i]=sc.nextInt();
        }
        //max and min value;
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("largest number is " +max+"\n");
        System.out.println("smallest number is "+min);
    }
} 