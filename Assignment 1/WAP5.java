public class WAP5 {
    public static void main(String[] args) {
        boolean triggerSecondStage = false;
        int count = 14;
        while (true) {
            if (count == 0) {
                triggerSecondStage = true;
                count = 2;
            } else if (count == 15) {
                break;
            }
            if (!triggerSecondStage) {
                var tmp = count;
                while (--tmp >= 0) {
                    System.out.print("*");
                }
                if (count == 14)
                    count = 6;
                else
                    count--;
                System.out.println();
            } else {
                var tmp = count;
                while (--tmp >= 0) {
                    System.out.print("*");
                }
                if (count == 6)
                    count = 14;
                else
                    count++;
                System.out.println();
            }
        }
    }
}