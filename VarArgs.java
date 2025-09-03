public class VarArgs {
    public static void main(String[] args) {
        String arr[]= new String[]{"pratik","giri"};

        System.out.println("sum value "+fun(2,3,45,5));


    }

   static  int fun(int ...v){
        int sum=0;
        for(int i=0;i<v.length;i++){            sum += v[i];
        }
        return sum;
    }
}

