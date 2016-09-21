/*
Left Rotation
A left rotation operation on an array of size n shifts each	of the array's elements unit to the left.
For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become 
[3,4,5,1,2].

Given an array of n integers and a number,d perform d left rotations on the array. 
Then print the updated array as a single line of space-separated integers.
Input Format 
 The first line contains the number of elements in the array denoting  n (the number of integers) 
 The second line contains d (the number of left rotations you must perform).
from the third line onwards we read the array elements 
Constraints
1 <= n <= 10^5 ( 10 to the power of 5)
1 <= d <= n
1 <= ai <= 10^6 ( 10 to the power of 6)

Note:-  For Boundary Conditions Print -1

Output	Format Print a single line of space-separated integers denoting the final state of the array after performing d left rotations.
Sample	Input
5 
4
1
2
3
4
5
Sample	Output
5
1
2
3
4
Explanation When we perform d=4 left rotations, the array undergoes the following sequence of changes:
Thus, we print the array's final state as a single line of space-separated values, which is 5 1 2 3 4
*/

import java.util.*;
class LeftRotation{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int d = sc.nextInt();
        int i=0;
        int a[] = new int[n];
        
        while(i<n){
            a[i] = sc.nextInt();
            i++;
        }
        
        int j=d;
        if( (d>=1 && d<=n) ){
        while(j!=(d-1)){
            
            if(j>=n){
                j=0;
                System.out.println(a[j]);
                j++;
            }else{
                System.out.println(a[j]);
                j++;
            }
        }
        if(j==(d-1)){System.out.println(a[j]);}
        }
        else{
            System.out.println(-1);
        }
        
    }
}