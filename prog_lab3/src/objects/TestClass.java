package objects;

import enums.Gender;

public abstract class TestClass extends Human{
    public TestClass(String name, Gender gender) {
        super(name, gender);
    }

    public int doSomething(int a, int b){
        return a+b;
    }

    public static int staticMethod(int a, int b){
        return a*b;
    }
}
