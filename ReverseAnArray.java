import java.util.*;
public class ReverseAnArray {
    public static void main(String[]args){
   
          Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          int []ab =new int[n];
  
  
       //Time complexity Ordo(N)
          for(int i=0;i<ab.length;i++){
                ab[i]=s.nextInt();
          }
        int it=n/2;
        int neg=ab.length-1;
          for(int i=0;i<it;i++){
              int temp=ab[i];
              ab[i]=ab[neg];
              ab[neg]=temp;
              neg--;
          }
          System.out.println(Arrays.toString(ab));
           
      }
    }
