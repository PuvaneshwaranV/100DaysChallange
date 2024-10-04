import java.util.InputMismatchException;
import java.util.Scanner;

class Door {
    void logic() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Total number Doors: ");
        try {
            int n = s.nextInt();
            int a[] = new int[n];
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((j + 1) % i == 0) {
                        if (a[j] == 0)
                            a[j] = 1;
                        else
                            a[j] = 0;
                    }
                }
            }
            int j = 0, k = 0;
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
                if (a[i] == 0)
                    j++;
                else
                    k++;
            }
            if (j > k)
                System.out.println("Maximum Doors are Closed and the Count is " + j);
            else if (j < k)
                System.out.println("Maximum Doors are Opened and the count is " + k);
            else
                System.out.println("Even number of Doors are opened and closed and the count is " + j);
        } catch (InputMismatchException e) {
            System.out.println("Input Only be a Positive Integer");
        } catch (NegativeArraySizeException e) {
            System.out.println("Input Only be a Positive Integer");
        }
    }
}

class mainn {
    public static void main(String arg[]) throws Exception {
        Door d = new Door();
        d.logic();
    }
}