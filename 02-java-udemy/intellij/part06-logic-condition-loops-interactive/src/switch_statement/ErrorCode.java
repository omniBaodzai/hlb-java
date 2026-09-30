package switch_statement;

public class ErrorCode
{
    public static void main(String[] args)
    {
        int errorCode = 400;

        String messageError = switch (errorCode)
        {
            case 400 -> "Bad Request - Yêu cầu không hợp lệ";
            case 401 -> "Unauthorized - Chưa xác thực";
            case 403 -> "Forbidden - Không có quyền truy cập";
            case 404 -> "Not Found - Không tìm thấy tài nguyên";
            case 500 -> "Internal Server Error - Lỗi máy chủ";
            default -> "Mã lỗi không xác định";

        };

        System.out.println(messageError);

    }
}
