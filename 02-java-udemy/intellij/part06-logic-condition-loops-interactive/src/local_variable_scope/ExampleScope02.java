package local_variable_scope;

public class ExampleScope02
{
    public static void main(String[] args)
    {
        if (5 > 4)
        {
            int i = 2;
        }
        else
        {
            // System.out.println(i); // Error
        }
    }
}
