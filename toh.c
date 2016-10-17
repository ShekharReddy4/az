#include<stdio.h>
int count=0;
void toh(int n,char from, char to, char using){
if(n>=1)
{
toh(n-1, from, using, to);
printf("move %d from %c --> %c\n",n,from,to);
count++;
toh(n-1, using, to, from);
}
}
void main()
{
int n;
scanf("%d", &n);

toh(n,'x','y','z');
printf("Total %d moves\n",count);
}
