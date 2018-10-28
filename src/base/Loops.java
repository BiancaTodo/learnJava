package base;

public class Loops
{
    public Loops ()
    {
        System.out.println("Loops consturctor");
    }
    public void printSimpleArray()
    {

        int [] intergerArray = new int [4];
        intergerArray [0] = 0;
        intergerArray [1] = 1;
        intergerArray [2] = 2;
        intergerArray [3] = 3;

        for(int i=0; i<intergerArray.length; i++)
        {
            System.out.println(intergerArray[i]);
        }

    }

    public static String message ()
    {
        return "loops message";
    }
}
