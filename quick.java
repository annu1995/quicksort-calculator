import java.util.Scanner;
public class quick
{
int i,j;
int arr[]=new int[100];
String a;
Scanner sc =new Scanner(System.in);
void input() 
{
	   
	   System.out.println("enter the array :-");
	   //taken a whole line as a input  \s to remve blank space
	   a = sc.nextLine().replaceAll("\\s{2,}", " ").trim();
	   //split string into array of string on the basis of blank space 
	   String[] aa = a.split(" ");
	   //convert array of string into array of integer 
	   try {
	    for (i = 0; i < aa.length; i++) {
	     arr[i] = Integer.parseInt(aa[i]);
	     j++; //j++ is used to store the length of  array 
	    }
	   } catch (Exception e) {
	    System.out.println("enter integer only like 1 2 3 4 ");
	   }
	  
	   System.out.println("-------------------------------------------------------");
}
 void sort() 
 {
  quicksort(0,j-1);
 }

 void quicksort(int low, int high) 
 {
	 int i = low;
	  int j = high;

  int pivot = arr[low + (high - low) / 2];
  while (i <= j) 
  {
   while (arr[i] < pivot)
  {
    i++;
  }
   while (arr[j] > pivot) 
  {
    j--;
  }
   if (i <= j)
  {
    swap(i, j);
    i++;
    j--;
  }
  }
  if (low < j) 
  {
   quicksort(low, j);
  }
  if (i < high) 
  {
   quicksort(i, high);
  }
 }
 
 void swap(int i, int j) 
 {
  int temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
 }
 
 void printsortedarray() 
     {
	  
	   System.out.println("Printing the sorted array ");
	   for (i = 0; i < j; i++)
	    System.out.print(arr[i]+" ");
	 }
public static void main(String args[]) 
 {
   quick algorithm = new quick();
   algorithm.input();
   algorithm.sort();
   algorithm.printsortedarray();

  }
}