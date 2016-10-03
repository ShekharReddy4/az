/*
Find all strings that match specific pattern in a array of size 4 
Given a array of words  find all strings that matches the given pattern where every character in the
pattern is uniquely mapped to a character in the array.

Note :- 

First read 4 strings each on a different line and a pattern string on 5th line then print the strings which match the pattern in the order they occur
input string may be a combination of upper and lower case letters 
 If no such pattern occurs print -1

Examples:

input = 
abb
abc
xyz
xyy  
foo 
output =  
abb
xyy

Explanation: 
xyy and abb have same character at index 1 and 2 like the pattern foo

input =   
abb
abc
xyz
xyy  
mnk 
output =
abc 
xyz 

Explanation: 
abc and xyz have all distinct characters  similar to the pattern mnk


input = 
abA
Fyf
eeD
wSS
zhZ
output =
abA

*/
