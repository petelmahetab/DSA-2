package Array;

class Twelfth {

    static void rearrange(int arr[], int n)
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
//            /When ar ka first index less than 0 matlab negative
            if (arr[i] < 0) {
//   aur i aur next element not equal , agar equal honge toh return => false;
//swap and return New Array.
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }


    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(""+arr[i] + " ");
    }

//Complexity 0(n^2)
    public static void main(String args[])
    {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;

        rearrange(arr, n);
        printArray(arr, n);
    }
}


