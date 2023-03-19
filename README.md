# Java-For
Post Test Day 30 

a simple program using For

First Question

Series of numbers 1 - 100, with numbers in multiples of 3, 5 and multiples of 3 and 5 replaced with the words BIZZ, BUZZ and BIZZBUZZ

following is the output

![image](https://user-images.githubusercontent.com/126166455/226176989-d6c4702b-91d0-4548-abcd-f8e55ce373a1.png)

explanation

 for(int i = 1; i <= 100; i++) {  
 this is to display the sequence 1 to 100
 
  if (((i % 3) == 0) && ((i % 5) == 0))       //multiples of 3 and 5
  
  System.out.print("BIZZBUZZ");       // print multiples of 3 and 5 to "BIZZBUZZ"
  
  else if ((i % 3) == 0) System.out.print("BIZZ");       // multiples of 3 print "BIZZ"
  
  else if ((i % 5) == 0) System.out.print("BUZZ");       //multiples of 5 print "BIZZ" "BUZZ"
  

Second Question

Creates an inverted triangle with odd numbers and even numbers replaced by "_"

following is the output

![image](https://user-images.githubusercontent.com/126166455/226177770-8f8ee930-d0e2-460e-aa1c-11b3eeb7e2ed.png)

![image](https://user-images.githubusercontent.com/126166455/226177844-51d7b7bc-5c2e-49a6-8a1b-e1e48029ad81.png)

explanation

the above program displays a triangular output with odd and even numbers replaced with " _ "
the displayed output is the numbers 1 to 9

if (i % 2 == 0)    //condition to display an even number 

System.out.print(" _ ");   //print even number to " _ "
  
if (i % 2 != 0)   //condition to display an odd number

System.out.print(i + "");  print i in this case i is a series of numbers 1 to 9 but because the even numbers have been replaced by "_" the output is 1_3_5_7_9

then do the same thing, declare i to 2, 3 to 5 and reduce the series limit from 9 to 6 to produce output like the picture above.
