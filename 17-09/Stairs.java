/*
Count ways to reach the n’th stair

There are n stairs, a person standing at the bottom wants to reach the top.
The person can climb either 1 stair or 2 stairs at a time. 
Count the number of ways, the person can reach the top.

If the value of n is 3. There are 3 ways to reach the top. 

 More Examples:

Input: n = 1
Output: 1
There is only one way to climb 1 stair

Input: n = 2
Output: 2
There are two ways: (1, 1) and (2)

Input: n = 4
Output: 5
(1, 1, 1, 1), (1, 1, 2), (2, 1, 1), (1, 2, 1), (2, 2)
*/
class Stairs
{
    // A simple recursive program to find n'th fibonacci number
    static int fib(int n)
    {
       if (n <= 1)
          return n;
       return fib(n-1) + fib(n-2);
    }
     
    // Returns number of ways to reach s'th stair
    static int countWays(int s)
    {
        return fib(s + 1);
    }
 
      public static void main (String args[])
    {
          int s = 8;
          System.out.println("Number of ways = "+ countWays(s));
    }
}

/*
Solution -2 (Using Recursion)

class stairs
{
    // A recursive function used by countWays
    static int countWaysUtil(int n, int m)
    {
        if (n <= 1)
            return n;
        int res = 0;
        for (int i = 1; i<=m && i<=n; i++)
            res += countWaysUtil(n-i, m);
        return res;
    }
  
    // Returns number of ways to reach s'th stair
    static int countWays(int s, int m)
    {
        return countWaysUtil(s+1, m);
    }
 
 

    public static void main (String args[])
    {
          int s = 4,m = 2;
          System.out.println("Number of ways = "+ countWays(s,m));
    }
} */