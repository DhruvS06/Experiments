import java.lang.* ; import java.io.* ;
import java.util.Scanner;


class sa
{
public static int showresult( int aa ,int z)	throws ArithmeticException
{
int result = z / aa; return result;
}

public static void setdata( String input, String are )
{
int value = 0,z=0;

try
{
value = Integer.parseInt( input );
z= Integer.parseInt( are);

}
catch ( NumberFormatException aaaaaa )
{
System.out.println( "Bad Input Data!!" ); return;
}

try
{
System.out.println( "Result is: " + showresult( value ,z) );
}
catch ( ArithmeticException aaaaaa )
{
System.out.println( "Division by zero!!" );
}

}

public static void main ( String[] a )
{
Scanner scan = new Scanner( System.in ); String inData,nn;

System.out.print("Enter the divisor: "); inData = scan.next();

System.out.print("Enter the divi: ");nn= scan.next();
setdata( inData,nn );
}
}
