class overloading
  {
  int sum (int a , int b)
   {
   return (a+b);
   }
  int sum (int a, int b, int c)
   {
   return (a+b+c);
   }
  double sum (double a, double b)
   {
   return (a+b);
   }
public static void main (String[]args)
 {
 overloading obj=new overloading();
 System.out.println(obj.sum(10,20));
 System.out.println(obj.sum(10,20,30));
 System.out.println(obj.sum(10.5,6.8));
 }}

 
