package challenge;

public class SecondsAndMinutes03 {

    public static void main(String[] args)
    {
        // Gọi phương thức 2 tham số (minutes, seconds)
        System.out.println(getDurationString(65, 45));   // 01h 05m 45s
        System.out.println(getDurationString(120, 0));   // 02h 00m 00s
        System.out.println(getDurationString(-10, 20));  // Invalid input

        // Gọi phương thức 1 tham số (seconds) - Chuyển tiếp sang phương thức 2 tham số
        System.out.println(getDurationString(3945));     // 01h 05m 45s
        System.out.println(getDurationString(65));       // 00h 01m 05s
        System.out.println(getDurationString(-3945));    // Invalid input
    }

    // Phương thức 1 tham số (seconds)
    public static String getDurationString(int seconds) {
        // Validation: Kiểm tra số giây hợp lệ
        if (seconds < 0) {
            return "Invalid value for seconds (" + seconds + "), must be >= 0";
        }

        // Quy đổi ra phút và số giây còn dư
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        // Gọi lại phương thức overloaded thứ 2 (Chuyển tiếp xử lý)
        return getDurationString(minutes, remainingSeconds);
    }

    // Phương thức 2 tham số (minutes, seconds)
    public static String getDurationString(int minutes, int seconds) {
        // Validation: Kiểm tra phút và giây trong khoảng hợp lệ
        if (minutes < 0) {
            return "Invalid value for minutes (" + minutes + "), must be >= 0";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid value for seconds (" + seconds + "), must be between 0 and 59";
        }

        // Tính toán giờ và phút
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        // Trả về chuỗi định dạng XXh YYm ZZs (Luôn có 2 chữ số)
        return String.format("%02dh %02dm %02ds", hours, remainingMinutes, seconds);
    }
}
