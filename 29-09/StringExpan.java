/*given an array of string of size 5  expand it  

note :- in the range a..b  assume a <= b 
for all boundary conditions print -1


input = 
1
2
4..10
15..21
25
output  =
1 
2 
4 
5
6
7
8
9
10
15
21 
22
23 
24
25


input = 
1..8
4..9
10
11
2..4

output =
1
2
3
4
5
6
7
8
4
5
6
7
8
9
10
11
2
3
4
*/
import java.util.*;
class StringExpan{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String s[] = new String[5];
        for(int i=0;i<5;i++){
            s[i] = sc.next();
        }
        for(int i=0;i<5;i++){
            String parts[] = s[i].split("..");
            System.out.println(i);
            for(String str:parts){System.out.println(5);}
        }
          
    }
}
