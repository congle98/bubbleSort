public class demo {
    public static void main(String[] args) {
        int [] arr = {4,2,4,6,9,8,2,7,5,10,1};
        bubbleSort(arr);
        showArray(arr);


    }
    static void bubbleSort(int [] array){
        boolean needNextPass = true;

        for (int k = 1; k < array.length && needNextPass; k++) {
            /* Array may be sorted and next pass not needed */
            needNextPass = false;
            for (int i = 0; i < array.length - k; i++) {
                if (array[i] > array[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
        }
    }
    static void showArray(int [ ] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
