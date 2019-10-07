class Main {
    public static void main(String[] args) {
        int first = 1;
        int second = 2;
        int counter = 0;

        while (first <= 4000000) {
            if (first % 2 == 0) {
                counter += first;
            }
            int temp = first + second;
            first = second;
            second = temp;

        }
        System.out.println(counter);
    }
}