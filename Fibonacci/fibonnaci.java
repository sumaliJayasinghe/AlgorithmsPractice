class Fibonnaci {
    public static void main(String args[]){
        int n0 = 0;
        int n1 = 1;
        int n2;
        int count = 10;

        // fist two fibinacci numbers
:
        System.out.print(n0 + " " + n1);


        for(int i = 0; i < count; i++){
            n2 = n0 + n1;
            System.out.print(" "+ n2);

            n0 = n1;
            n1 = n2;
        }
    }
}