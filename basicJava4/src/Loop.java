public class Loop {
    public static void main(String[] args) {
        int a[] = new int[(50 / 2) + 1];
        int count = 0;

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                a[count] = i;
                System.out.print(i + ", ");
                count++;
            }
        }
        System.out.println();
        
        for (int i : a) {
            System.out.print(i + ", ");
        }
    }
}
