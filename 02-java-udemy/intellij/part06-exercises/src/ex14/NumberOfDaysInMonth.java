package ex14;

public class NumberOfDaysInMonth
{
    public static void main(String[] args)
    {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));


    }

    // Hàm isLeapYear: Kiểm tra năm nhuận
    public static boolean isLeapYear(int year)
    {
        if (year < 1 || year > 9999)
        {
            return false;
        }

        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    // Hàm getDaysInMonth: Lấy ra số ngày trong tháng
    public static int getDaysInMonth(int month, int year)
    {
        if (month < 1 || month > 12)
        {
            return -1;
        }

        if (year < 1 || year > 9999)
        {
            return -1;
        }

        return switch (month)
        {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            default -> {
                if (isLeapYear(year))
                {
                    yield 29;
                }

                yield 28;
            }
        };
    }

    /*
    - Cách viết khác
    public static int getDaysInMonth(int month, int year) {

    if (year < 1 || year > 9_999) {
        return -1;
    }

    return switch (month) {
        case 1, 3, 5, 7, 8, 10, 12 -> 31;
        case 2 -> isLeapYear(year) ? 29 : 28;
        case 4, 6, 9, 11 -> 30;
        default -> -1;
    };
}

public static boolean isLeapYear(int year) {

    if (year < 1 || year > 9_999) {
        return false;
    }

    if (year % 4 != 0) {
        return false;
    }

    if (year % 100 != 0) {
        return true;
    }

    return year % 400 == 0;
}
     */
}
