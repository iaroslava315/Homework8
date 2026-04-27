
void main() {

//  Task 1
    {
        System.out.println("Task 1");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] weights = {1.57, 7.654, 9.986};

        int bigBox[] = {1, 6, 15, 28, 69};


    }


//  Task 2
    {
        System.out.println("Task 2");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }

        double[] weights = {1.57, 7.654, 9.986};
        for (int j = 0; j < weights.length; j++) {
            if (j == weights.length - 1) {
                System.out.println(weights[j]);
                break;
            }
            System.out.print(weights[j] + ", ");
        }

        int bigBox[] = {1, 6, 15, 28, 69};
        for (int k = 0; k < bigBox.length; k++) {
            if (k == bigBox.length - 1) {
                System.out.println(bigBox[k]);
                break;
            }
            System.out.print(bigBox[k] + ", ");
        }

    }


//  Task 3

    {
        System.out.println("Task 3");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }

        double[] weights = {1.57, 7.654, 9.986};
        for (int j = 2; j >= 0; j--) {
            if (j == 0) {
                System.out.println(weights[j]);
                break;
            }
            System.out.print(weights[j] + ", ");
        }

        int bigBox[] = {1, 6, 15, 28, 69};
        for (int k = bigBox.length - 1; k >= 0; k--) {
            if (k == 0) {
                System.out.println(bigBox[k]);
                break;
            }
            System.out.print(bigBox[k] + ", ");
        }
    }


//  Task 4
    {
        System.out.println("Task 4");
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}



