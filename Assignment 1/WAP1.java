public class WAP1 {
    public static void main(String[] args) {

//            01234567890123456789012345678901234567890123456789
//            :   :   :   :::::   :   :   :::::   :::::   :   :
//            :   ::  :   :       :   :   :   :   :   :   ::  :
//            :   : : :   :::::   :   :   :  :    :   :   : : :
//            :   :  ::   :       :   :   : : :   :   :   :  ::
//            :   :   :   :::::   :::::   :   :   :::::   :   :

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 50; y++) {
                if (x == 0 && (y % 4 == 0 || y > 12 && y < 16 || y > 28 && y < 32 || y > 36 && y < 40))
                    System.out.print(":");
                else if (x == 1 && y != 16 && ((y % 4 == 0) || y == 5 || y == 45))
                    System.out.print(":");
                else if (x == 2 && y != 32 && (y % 4 == 0 || y == 6 || y > 12 && y < 16 || y == 31 || y == 46))
                    System.out.print(":");
                else if (x == 3 && y != 16 && (y % 4 == 0 || y == 7 || y == 30 || y == 47))
                    System.out.print(":");
                else if (x == 4 && (y % 4 == 0 || y > 12 && y < 16 || y > 20 && y < 24 || y > 36 && y < 40))
                    System.out.print(":");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}