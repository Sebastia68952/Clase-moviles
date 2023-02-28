public class Poten 
{
    private int exp;
    private int bas;
    Poten(int a, int b)
    {
        bas =a;
        exp = b;      
    }
    public int getRes()
    {
        return calcularPoten(bas,exp);
    }
    private int calcularPoten(int a, int b)
    {
        if (b == 0) 
        {
            return 1;
        } 
        else if (b == 1) 
        {
            return a;
        } 
        else 
        {
            return a * calcularPoten(a, b-1);
        }
    }
}