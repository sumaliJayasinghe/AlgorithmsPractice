class PrimeNumbers{
    public static void main(String args[]){
        int num = 3;
        int n = num/2;
        boolean flag = true;

        if(n == 0 || n == 1){
            System.out.print(n + " is not a prime number");
        }else{
            for(int i = 0; i <= n; i++){
                if(num%i === 0){
                    System.out.print(n + " is not a prime number");
                    flag = false;
                    break;
                }
            }

            if(flag)
            System.out.print(n + " is a prime number");

        }

    }
}