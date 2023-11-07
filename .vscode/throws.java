import java.io.IOException;
class throws
{
    void m()throws IOException
    {
        throw new IOExeption("device error");
    }
    void n()throws IOException
    {
        m();
    }
    void p()
    {
        try
        {
            n();
        }
        catch(Exception e){System.out.println("Exception Handled");}
    }
    public static void main(Sring args[])
    {
        throws obj=new throws();
        obj.p();
        Sop("Normal Flow");
    }
}
