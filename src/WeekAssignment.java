import java.util.*;

public class WeekAssignment {

    static void q1() {
        double[] fees = {10.5, 25.0, 5.0};

        for (int i = 0; i < fees.length - 1; i++) {
            for (int j = 0; j < fees.length - i - 1; j++) {
                if (fees[j] > fees[j + 1]) {
                    double temp = fees[j];
                    fees[j] = fees[j + 1];
                    fees[j + 1] = temp;
                }
            }
        }

        System.out.println("Q1 Sorted Fees: " + Arrays.toString(fees));
    }

    public static void main(String[] args) {
        q1();
    }
}