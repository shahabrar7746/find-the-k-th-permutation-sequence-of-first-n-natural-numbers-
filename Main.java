import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Length for array?");
	    int length = s.nextInt();//This will take length of array
	    int array[] = new int[length];
	    //This loop will get input for array
	    for(int i = 0;i<array.length;i++){
	        array[i] = i+1;
	    }
	    int temp = 0;//temp variable will be used to temp values of array while shifting the values
	    int kth = 0;
	    System.out.println("Permutation number?");
	    int kthip = s.nextInt();//This will take our permutation input
	    //This loop will shuffle elements values of array
	    for(int i = 0;i<array.length;i++){
	        for(int j = 1;j+1<array.length;j++){
	            temp = array[j];
	            array[j] = array[j+1];
	            array[j+1] = temp;
	            kth++;
	             if(kthip == kth){
	                 System.out.print("Permutation for number is ");
	                 for(int k = 0;k<length;k++){
	            System.out.print(array[k] + " ");
	        }
	        System.out.println();
	             }
	           
	        }
	                
	            
	           
	        
	         temp = array[0];
	        array[0] = array[1];
	        array[1] = temp;
	        
	        kth++;
	         if(kthip == kth){
	              System.out.print("Permutation for number is ");
	                 for(int k = 0;k<length;k++){
	            System.out.print(array[k] + " ");
	        }
	        System.out.println();
	       
	         }
	            }
	}
}
