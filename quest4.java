// Problem Statement
// You are developing a program that merges two sorted arrays of student IDs.
// The first array contains the student IDs of students who have successfully completed Course A, while the second array contains the student IDs of students who have successfully completed Course B. Your task is to merge these two arrays into a single array such that the second array should be merged with the first array.

// Input format :
// The first line of input consists of an integer n1, representing the size of Course A.
// The second line of input consists of n1 space-separated integers, representing the IDs of course A.
// The third line of input consists of an integer n2, representing the size of Course B.
// The fourth line of input consists of n2 space-separated integers, representing the IDs of course B.

// Output format :
// The output displays the merged array separated by space.
// Refer to the sample output for the formatting specifications.

// Code constraints :
// In this scenario, the test cases fall under the following constraints:
// 1 ≤ n1, n2 ≤ 10
// 1 ≤ array elements ≤ 25
// Sample test cases :
// Input 1 :
// 5
// 1 2 4 5 6
// 4
// 7 8 9 10
// Output 1 :                           
// 7 8 9 10 1 2 4 5 6 
// Input 2 :
// 3
// 1 2 3
// 2
// 4 5
// Output 2 :
// 4 5 1 2 3 


import java.util.*;
public class quest4{
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 1st the array");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        // display the array
        System.out.println("Enter the elements of  1st  the array");
        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of 2nd the array");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        
        // display the array
        System.out.println("Enter the elements of  2nd  the array");
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }

        // merging the two arrays
        int[] arr3 = new int[n2+n1];
        
        for(int i = 0; i < n2; i++){
            arr3[i] = arr2[i];
        }
        for(int i = 0; i < n1; i++){
            arr3[n2+i] = arr1[i];
        }
        // display the merged array
        System.out.println("The merged array is :");
        for(int i = 0; i < n1+n2; i++){
            System.out.print(arr3[i] + " ");
        }
    }
}