class Spiral 
{ 

static void spiralPrint(int m, int n, int a[][],int kk)
{
    int i, k = 0, l = 0;
    int count=1;
 
 
    while (k < m && l < n)
    {
        
        for (i = l; i < n; ++i,count++)
        {   
             if(count==kk)
             {
             System.out.printf("%d ", a[k][i]);
             System.exit(1);
             }
        }
        k++;
 
        
        for (i = k; i < m; ++i,count++)
        {
             if(count==kk)
             {
             System.out.printf("%d ", a[i][n-1]);
             System.exit(1);
             }
        }
        n--;
 
        
        if ( k < m)
        {
            for (i = n-1; i >= l; --i,count++)
            {
             if(count==kk)                
            {
	     System.out.printf("%d ", a[m-1][i]);
             System.exit(1);
            }
           }
            m--;
        }
 
       
        if (l < n)
        {
            for (i = m-1; i >= k; --i,count++)
            {
               if(count == kk) { System.out.printf("%d ", a[i][l]);System.exit(1); }
            }
            l++;    
        }        
    }
}
 

public static void main(String [] args)
{
    int a[][] = {
                 {1,  2,  3},
                 {7,  8,  9}, 
                {13, 14, 15} 
             };
    int k = 8;
    spiralPrint(3,3,a,k);
}
}
/*
public static void main(String[] args)
 {

    int[][] values = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
      
    int count = 1,kk=5;
    for (int i = (values.length * values[0].length)-1, j = 0; i > 0; i--, j++) 
       {
          for (int k = j; k < i; k++,count++) 
          { 
            if(count  ==kk)
	    {
            System.out.print(values[j][k]);
            System.exit(1);
          }
          }

          for (int k = j; k < i; k++,count++)
          {
            if(count  ==kk)
	    {
            System.out.print(values[k][i]);
            System.exit(1);
            } 
          }

          for (int k = i; k > j; k--,count++) 
          {
	    if(count  ==kk)
	    {
            System.out.print(values[i][k]);
            System.exit(1);
            }              
          }

          for (int k = i; k > j; k--,count++) 
          {
	   if(count  ==kk)
	    {
            System.out.print(values[k][j]);
            System.exit(1);
            }              
          }
     }
}
}*/
