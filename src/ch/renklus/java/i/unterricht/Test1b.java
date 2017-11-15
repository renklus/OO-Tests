package ch.renklus.java.i.unterricht;

public interface Test1b extends Test1 {
    int MyConstant = 6;
    default String MyMethod()
    {
        return "Test1b";
    }
}
