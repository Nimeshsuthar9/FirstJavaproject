public class Calculator
{
     static Calculator calculator = new Calculator(); //object creat

    // value declaration
    static int a=88;

    static int b=199;

    static int ans;

    
    static void add()
    {
        ans = a+b;
        System.out.println("Addition of " + a + " and " + b + " = " + ans);
    }

    static void sub()
    {
        ans = a-b;
        System.out.println("Subtraction of " + a + " and "+ b+ " = " + ans);

    }
    static  void multi(int a,int b)
    {
        ans = a*b;
        System.out.println("Multiplication of a and b = " + ans);
    }
    //
    void div(int a,int b)
    {

     ans = a / b;
     System.out.println("Division of a and b = " + ans);
    }
    //main method
    public static void main(String[] args)
    {
        add();
        sub();
        multi(5,5);
        calculator.div(10, 5); // call mthod using objct
    }
}
