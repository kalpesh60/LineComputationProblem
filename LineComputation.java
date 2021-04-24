public class LineComputation
{
static boolean equals(double LengthOfLine,double LengthOfSecondLine)
{
if(LengthOfLine == LengthOfSecondLine)
{
return true;
}
return false;
}

public static void main(String[] args)
{
System.out.println("Welcome to the Comparison Computation Program");
int x1=2;
int x2=3;
int y1=2;
int y2=4;
int xaxis=(x2-x1)*(x2-x1);
int yaxis=(y2-y1)*(y2-y1);
double LengthOfLine = Math.sqrt((xaxis) + (yaxis));
System.out.println("Length of Line:"+"("+x1+","+y1+"),"+"("+x2+","+y2+")"+"is:"+LengthOfLine);
System.out.println("calculating the length of second line");
int x3=2;
int x4=3;
int y3=2;
int y4=5;
int xaxis1=(x4-x3)*(x4-x3);
int yaxis1=(y4-y3)*(y4-y3);
double LengthOfSecondLine = Math.sqrt((xaxis1) + (yaxis1));
System.out.println("Length of second Line:"+"("+x3+","+y3+"),"+"("+x4+","+y4+")"+"is:"+LengthOfSecondLine);

boolean Equality = equals(LengthOfLine,LengthOfSecondLine);
if(Equality)
System.out.println("both lines are equal");
else
{
System.out.println("both lines are not equal");
}
}}
