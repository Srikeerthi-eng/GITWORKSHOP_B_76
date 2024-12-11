class Age Exception extends Exception
{
public string tostring()
{
return"Not Eligible";
}
}
class AgeExceptionDemo{
Static void verify(int age)throws AgeException
{
if(age>0&&age<=30)
  throw new ageException();
System.out.println("eligible");
}
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
try{
System.out.println("enter age");
int a=s.nextInt();
verify(a);
}
catch(AgeException e)
{
System.out.println("Age is not eligible:"e);
}
}
}