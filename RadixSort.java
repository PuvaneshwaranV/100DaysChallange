import java.util.Arrays;
public class RadixSort 
{
    static int getMax(int arr[])
  {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    static void countSort(int arr[], int exp)
  {
        int n = arr.length;
        int output[] = new int[n];
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Store the count of occurrences in count[]
        for (int i = 0; i < n; i++) 
        {
            count[(arr[i] / exp) % 10]++;
        }

        // Change count[i] so that count[i] contains the actual
        // position of this digit in output[]
        for (int i = 1; i < 10; i++) 
        {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--)
          {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[], so that arr[] now contains sorted numbers
        System.arraycopy(output, 0, arr, 0, n);
    }

    // Main function to perform Radix Sort
    static void radixSort(int arr[]) 
  {
        int max = getMax(arr);

        for (int exp = 1; max / exp > 0; exp *= 10) 
        {
            countSort(arr, exp);
        }
    }

    // A utility function to print an array
    static void printArray(int arr[])
  {
        for (int value : arr) 
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
  {
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Original array: ");
        printArray(arr);

        radixSort(arr);

        System.out.println("Sorted array: ");
        printArray(arr);
    }
}