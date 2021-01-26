public class MegaBytesConverter {


//    // 1 MB = 1024 KB

//    int kiloBytes;
//
//    public static long toMegaBytes(int kiloBytes) {
//        if (kiloBytes < 0) {
//            return -1;
//        }
//        return Math.round(kiloBytes / 1024 );
//    }
//
//
//
//    public static void printMegaBytesAndKiloBytes(int kiloBytes){
//
//        int megaB = 1024;
//        int remainder = kiloBytes % megaB;
//
//        if(kiloBytes < 0){
//            System.out.println("Invalid Value");
//        } else  {
//            long megaBytes = toMegaBytes(kiloBytes);
//            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
//        }
//
//
//    }

    int kiloBytes;

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int remainder = kiloBytes % 1024;
        int quotient = kiloBytes / 1024;

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else  {
            System.out.println(kiloBytes + " KB = " + quotient + " MB and " + remainder + " KB");
        }


    }


}
