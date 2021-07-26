package com.wolfman.visitor.visitor;

public class Client {

    public static void main(String[] args) {
        //创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        Success success = new Success();
        objectStructure.display(success);
        System.out.println("===============");
        Fail fail = new Fail();
        objectStructure.display(fail);
        System.out.println("=======给的是待定的测评========");
        Wait wait = new Wait();
        objectStructure.display(wait);
    }

}
