package ARRAY_STRING;

public class TriangularSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
//        int arr[]={5,3,2,6,0};
        int size=arr.length;
        while(size!=1){
            for (int i=0;i<size;i++){
                arr[i]=(arr[i]+arr[i+1])%10;
                size--;
            }
        }
        System.out.println("The Sum value is "+arr[0]);
    }
}

// Triangular Sum
//        1 2 3 4 5
//        \/\/\/\/
//         3 5 7 9
//         \/\/ \/
//          8 2 6
//          \/\/
//           0 8
//           \/
//            8
