package com.github.hcsp.inheritance;

public class Sub  {
    private final Base base;

    public Sub(Base base) {
        this.base = base;
    }
    public void sayHello() {
        System.out.println("我是子类！");
    }
    public void delegateSayHello() {
        base.sayHello();
    }
}
