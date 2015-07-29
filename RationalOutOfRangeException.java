package apcs;
public class RationalOutOfRangeException extends Exception
{
    String  str;
    public RationalOutOfRangeException(String report)
    {
        str = report;
    }
    public RationalOutOfRangeException()
    {
    }
    public String report()
    {
        return str;
    }
}