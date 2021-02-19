public class Main {
    public static void main(String[] args) {
        sumFirstAndLastDigit(252);
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        } else {
            int last = number % 10;
            int first = number;
            while (first >= 10){
               first = first/10;
            }
            return first + last;
        }
    }
}
