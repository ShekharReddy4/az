import java.util.*;

public class LeftRotation {
    
    public static int[] rotateArray(int[] arr, int d){

        int n = arr.length;
        
        int[] temp_arr = Arrays.copyOfRange(arr, 0, d);
        
        for(int i = d; i < n; i++) 
            arr[i - d] = arr[i];
        
        for(int i = n - d; i < n; i++) 
            arr[i] = temp_arr[i-n+d];
        
        return arr;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] numbers = new int[n];
        

        for(int i = 0; i < n; i++)
            numbers[i] = scanner.nextInt();
        
        
 
        numbers = rotateArray(numbers, d);
        
 
        for(int i : numbers) 
            System.out.print(i + " ");
        
    } 
 }