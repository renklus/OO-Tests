package ch.renklus.java.i.unterricht;

public class TestClass implements Test2, Test1b {


    @Override
    public String MyMethod() {
        return Test1b.super.MyMethod();
        //return "TestClass";
    }

    public void MyMethod(float f)
    {
        return;
    }

    public void MyMethod(long l)
    {
        return;
    }

    public void MethodNr(int i, double d)
    {}
    public void MethodNr(double d, int i)
    {}
    public void MethodNr(double d, double e)
    {}
}
