public class Challenge {
    public static void main(String[] args) {
        double firstValue = 20.00d;
        double secondValue = 80.00d;

        double valuesTotal = (firstValue + secondValue) * 100.00d;
        System.out.println("valuesTotal = " + valuesTotal);

        double theRemainder = valuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);

        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
