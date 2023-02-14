import java.util.*;
class selection{
    public static void main(String args[]){
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the array:");
        int a[]=new int[5];
        for(int i=0;i<5;i++){
            a[i]=SC.nextInt();
        }
        for(int i=0;i<4;i++){
            int smallest=i;
            for(int j=i+1;j<5;j++){
                if(a[smallest]>a[j]){
                    smallest=j;
                }
            }

                int temp=a[smallest];
                a[smallest]=a[i];
                a[i]=temp;
            
        }
        System.out.println("After sorting the array:");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}