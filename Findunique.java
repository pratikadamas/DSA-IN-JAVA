public class Findunique {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,3,2};
        System.out.println("The unique value is "+unique(arr));
    }

    static  int unique(int arr[]){
        int val=0;
        for (int i:arr){
            val^=i;
        }

        return val;
    }
}
