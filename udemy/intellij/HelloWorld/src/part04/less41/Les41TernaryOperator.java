package part04.less41;

public class Les41TernaryOperator {
    public static void main(String[] args) {
        String makeOfCar = "Volvo";
        boolean isDomestic = (makeOfCar == "Volvo") ? false : true;

        if (isDomestic) { // false
            System.out.println("Không thực thi");
        }

    }
}
