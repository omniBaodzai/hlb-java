public class Note02
{
    public static void main(String[] args) {
        long myValue1 = 2_147_483_647;

        // long myValue2 = 2_147_483_647_321;
        long myValue2 = 2_147_483_647_321L;
        /*
        - Nếu như mày gán một giá trị là số nguyên thuộc kiểu int quá lớn cho một biến kiểu long
        mà không thêm hậu tố 'L' vào sau giá trị đó, thì java vẫn sẽ thông báo lỗi, vì nó coi
        số int mà không có hậu tố, lại là số quá lớn, vượt kiểu int thì đương nhiên là nó báo
        lỗi, do đó phải thêm hậu tố 'L' vào để nó là một kiểu long
        */

        System.err.println("myValue1 = " + myValue1);
        System.err.println("myValue2 = " + myValue2);
    }
}
