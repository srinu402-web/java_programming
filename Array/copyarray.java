package Array;

public class copyarray {
    public static void main(String[] args) {
        int [] arr={10,20,30};
        int copyarray[]=new int[arr.length];
        System.out.println("array elements are=");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            copyarray[i]=arr[i];
        }
        System.out.println();
        System.out.println("copy array=");
        for(int i=0;i<copyarray.length;i++){
            System.out.print(copyarray[i]+" ");
        }
    }
    
}
