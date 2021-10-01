package vilt.print.numbers;

public class PrintNumbers {

    public static void main(String[] args) {

        for(int i =1; i<200; i++){
            if(!(i % 3 == 0 || i % 5 == 0)){
                System.out.println(i);
            }
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("M35");
            }
            if(i % 3 == 0 && !(i % 5 ==0)){
                System.out.println("M3");
            }
            if(i % 5 == 0 && !(i % 3 ==0)){
                System.out.println("M5");
            }
        }
    }
}


