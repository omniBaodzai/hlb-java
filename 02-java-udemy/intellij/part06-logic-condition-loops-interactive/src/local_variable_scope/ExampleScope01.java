package local_variable_scope;

public class ExampleScope01
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(i); // Ok
        }
        // System.out.println(i); // Error
    }
}
