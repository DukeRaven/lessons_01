import java.util.Arrays;

/**
 * Created by Kirill on 22.03.2016.
 */
public class FirstPart {

    private final static int minValue = -10, maxValue = 10;

    private static int getRandomInt() {
        return minValue + (int)(Math.random() * ((maxValue - minValue) + 1));
    }
    public static void main(String[] args) {
        int[] a = new int[10];
        int[][] b = new int[10][10];

        // Filling arrays with random value between -10 and 10
        int i = 0, j;
        do {
            a[i] = getRandomInt();
            j = 0;
            while (j < 10) {
                b[i][j] = getRandomInt();
                j++;
            }
            i++;
        } while (i < 10);

        //Printing both arrays
        System.out.println("a = " + Arrays.toString(a));

        System.out.print("b = [");
        for(i = 0; i < 10; i++) {
            System.out.print(Arrays.toString(b[i]));
            if (i != 9 )
                System.out.print(", ");
        }
        System.out.println("]");

        // Calculating Sum and Avg for first array
        float sum = 0;
        float avg;

        for(int val : a) {
            sum += val;
        }

        avg = sum / a.length;

        System.out.printf("Sum(a) = %.0f\n", sum);
        System.out.printf("Avg(a) = %.2f\n", avg);

        /*
        Calculating Sum and Avg for second array with following conditions
            if current value in (2, 4, 8) not doing anything
            if current value less than zero then multiplying sum by 2
            if current value more than zero then dividing sum by 2
        */

        int[] exclude = {2, 4, 8};
        float totalSum = 0;

        for (i = 0; i < 10; i++) {
            sum = 0;

            for (j = 0; j < 10; j++) {
                sum += b[i][j];

                if (Arrays.binarySearch(exclude, b[i][j]) < 0) {
                    if (b[i][j] < 0) {
                        sum *= 2;
                    } else {
                        sum /= 3;
                    }
                }

            }

            avg = sum / b[i].length;
            totalSum += sum;

            System.out.printf("Sum(b[%d]) = %.0f\n", i, sum );
            System.out.printf("Avg(b[%d]) = %.2f\n", i, avg );
        }

        System.out.println("TotalSum(b) = " + totalSum);
        System.out.printf("TotalAvg(b) = %.2f\n",  totalSum / (b.length * b[1].length) );
    }
}
