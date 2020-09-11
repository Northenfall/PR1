package mirea.ru;

public class Main {

    public static void main(String[] args)
    {
        // TASK 1
forArray();
whileArray();
dowhileArray();
    }
    //TASK1
    public static void forArray()
    {
        int forArray[] = {1,2,3,4,5};
        int s = 0;
        for (int i = 0; i< forArray.length; ++i)
        {
            s = s + forArray[i];
        }
        System.out.println(s);
    }
    public static void whileArray()
    {
        int whileArray[] = {10,2,3,4,5};
        int s = 0, i = 0;
        while (i < whileArray.length)
        {
            s = s + whileArray[i];
            i++;
        }
        System.out.println(s);
    }
    public static void dowhileArray()
    {
        int dowhileArray[] = {20,2,3,4,5};
        int s = 0, i = 0;
        do
        {
            s = s + dowhileArray[i];
            i++;
        }
        while (i < dowhileArray.length);
        System.out.println(s);
    }
    
}
