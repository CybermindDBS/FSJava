public class WAP4 {
    public static void main(String[] args) {
        for (int x = 0; x < 14; x++) {
            for (int y = 0; y < 14; y++) {
                if (x == 6 && (y < (14 / 2) - 6 || y > (14 / 2) + 5))
                    System.out.print("*");
                else if (x == 7 && (y < (14 / 2) - 5 || y > (14 / 2) + 4))
                    System.out.print("*");
                else if (x == 8 && (y < (14 / 2) - 4 || y > (14 / 2) + 3))
                    System.out.print("*");
                else if (x == 9 && (y < (14 / 2) - 3 || y > (14 / 2) + 2))
                    System.out.print("*");
                else if (x == 10 && (y < (14 / 2) - 2 || y > (14 / 2) + 1))
                    System.out.print("*");
                else if (x == 11 && (y < (14 / 2) - 1 || y > (14 / 2)))
                    System.out.print("*");
                else if (x == 12 || x == 13)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}