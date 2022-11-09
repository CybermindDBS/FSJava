public class WAP3 {
    public static void main(String[] args) {
        for (int x = 0; x < 14; x++) {
            for (int y = 0; y < 14; y++) {
                if (x == 0 || x == 13)
                    System.out.print("*");
                else if (x == 1 && y != (14 / 2) - 1)
                    System.out.print("*");
                else if (x == 2 && (y < ((14 / 2) - 1) - 1 || y > ((14 / 2) - 1) + 1))
                    System.out.print("*");
                else if (x == 3 && (y < ((14 / 2) - 1) - 2 || y > ((14 / 2) - 1) + 2))
                    System.out.print("*");
                else if (x == 4 && (y < ((14 / 2) - 1) - 3 || y > ((14 / 2) - 1) + 3))
                    System.out.print("*");
                else if (x == 5 && (y < ((14 / 2) - 1) - 4 || y > ((14 / 2) - 1) + 4))
                    System.out.print("*");
                else if (x == 6 && (y < ((14 / 2) - 1) - 5 || y > ((14 / 2) - 1) + 5))
                    System.out.print("*");
                else if ((x == 7 || x == 8 || x == 9 || x == 10 || x == 11 || x == 12) && (y == 0 || y == 13))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}