package com.zz.grammar.polymorphic3;

class A {
    public String show(D obj){
        return ("A and D");
    }
    public String show(A obj){
        return ("A and A");
    }
}
class B extends A{
    public String show(B obj){
        return ("B and B");
    }
    public String show(A obj){
        return ("B and A");
    }
}
class C extends B{}
class D extends B{}

public class ABCD {
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        System.out.println( " ①" + a1.show(b));
        System.out.println( " ②" + a1.show(c));
        System.out.println( " ③" + a1.show(d));
        System.out.println( " ④" + a2.show(b));
        System.out.println( " ⑤" + a2.show(c));
        System.out.println( " ⑥" + a2.show(d));
        System.out.println( " ⑦" + b.show(b));
        System.out.println( " ⑧" + b.show(c));
        System.out.println( " ⑨" + b.show(d));
    }
}
