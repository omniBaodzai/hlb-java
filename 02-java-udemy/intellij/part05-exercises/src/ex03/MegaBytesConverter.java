package ex03;

public class MegaBytesConverter
{
    public static void main(String[] args)
    {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    // Hàm printMegaBytesAndKiloBytes: Từ KB đổi ra MB và KB dư
    public static void printMegaBytesAndKiloBytes (int kiloBytes)
    {
        if (kiloBytes < 0)
        {
            System.out.println("Invalid Value");
            return;
        }

        // 1 MB = 1024 KB
        int megaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024;
        System.out.printf("%d KB = %d MB and %d KB%n", kiloBytes, megaBytes, remainingKiloBytes);
        System.out.println(kiloBytes + " KB = "  + megaBytes + " MB and " +
                remainingKiloBytes + " KB");
    }
}


