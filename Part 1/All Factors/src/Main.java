public static void printFactors (int number){
    int x = 1;
    if (number < 1){
        System.out.println("Invalid Value");
    }
    else{
        while(x <= number ){
            if (number % x == 0){
                System.out.println(x);
            }
            x++;
        }
    }


}