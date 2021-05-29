import java.util.*;
public class DuplicatesInArray{
    public static void main(String[]args){
      HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []ab =new int[n];


     //Time complexity Ordo(N)
        for(int i=0;i<ab.length;i++){
              ab[i]=s.nextInt();
        }
        System.out.println("The duplicates are ");
        for(int j=0;j<ab.length;j++){
            if(a.containsKey(ab[j])){
                System.out.print(ab[j]+" ");
            }
            else{
                a.put(ab[j], 1);
            }
        }
         
    }
}