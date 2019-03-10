public class PositiveNegativeZero {
    public static void main(String[] args) {

        checkNumber(9);
        checkNumber(0);
        checkNumber(-19);
    }
    public static void checkNumber(int number){
        String result = (number == 0) ? "zero" : ((number > 0) ? "positive" : "negative");
        System.out.println(result);
    }
}
