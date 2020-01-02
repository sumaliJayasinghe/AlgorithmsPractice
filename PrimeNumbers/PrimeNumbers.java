class PrimeNumbers{
    public static void main(String args[]){
        int num = 3;
        int n = 0;
        boolean flag = true;

        n= num / 2;

        if(num == 0 || num == 1){
            System.out.println(num + " is not a prime number");
        }else{
            for(int i = 2; i < n; i++){
                if(num % i == 0){
                    System.out.println(num + " is 999 not a prime number");
                    flag = false;
                    break;
                }
            }

            if(flag)
            System.out.println(num + " is a prime number");

        }

    }
}