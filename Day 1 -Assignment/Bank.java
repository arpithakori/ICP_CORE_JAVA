import java.util.*;
public class Bank{
	 static int sumPrimeArray(int array[],int size)
     {
         int sum=0;
          for (int i = 0; i < size; i++) {
          int x = 2;
          int flag = 1;
          if(array[i]==1) {
        	  flag = 0;
        	  x++;
        	  continue;
          }
          while (x < array[i]) {
              if (array[i] % x == 0) {
                  flag = 0;
                  break;
              }
              x++;
          }
          if (flag == 1) {
              sum = sum + array[i];
          }
       
     }
      return sum;
   }
	 
    public static void main(String[] args) {
    	 int i, number;
         int arr[] = new int[100];
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the size of array:");
         number = scan.nextInt();
         if (number < 0) {
        	 System.out.println("Invalid array size");
        	 System.exit(0);
         }
         System.out.println("Enter array elements:");
         for (i = 0; i < number; i++) {
             arr[i] = scan.nextInt();
             if (arr[i]<0) {
            	 System.out.println("Invalid input");
            	 System.exit(0);
             }
         }
         int sumPrime=sumPrimeArray(arr,number);
         System.out.println("Sum of all prime numbers:" + sumPrime);
     }
}
