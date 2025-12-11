package SearchAndSorting;

public class TernarySearch {

    // Example unimodal function: -x^2 + 10x + 3  (peak at x = 5)
    static double f(double x) {
        return -x * x + 10 * x + 3;
    }

    static double ternarySearch(double left, double right) {
        double eps = 1e-9; // precision

        while (right - left > eps) {
            double mid1 = left + (right - left) / 3;
            double mid2 = right - (right - left) / 3;

            if (f(mid1) < f(mid2)) {
                left = mid1;   // maximum lies on right side
            } else {
                right = mid2;  // maximum lies on left side
            }
        }
        return left;  // or right, both are same within eps
    }

    public static void main(String[] args) {
        double peak = ternarySearch(0, 10);
        System.out.println("Maximum at x = " + peak);
        System.out.println("Maximum value = " + f(peak));
    }
}

