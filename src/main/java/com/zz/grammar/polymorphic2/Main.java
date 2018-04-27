package com.zz.grammar.polymorphic2;

import com.zz.grammar.polymorphic2.Shape.Circle;
import com.zz.grammar.polymorphic2.Shape.Rectangle;
import com.zz.grammar.polymorphic2.Shape.Shape;
import com.zz.grammar.polymorphic2.Printer.NewPrinter;
import com.zz.grammar.polymorphic2.Printer.Printer;

public class Main {

    public static void main(String[] args){
        Shape s = new Rectangle(10,20);
        Shape c = new Circle(1);
        Printer printer = new NewPrinter();

        printer.doPrint(s);
        printer.doPrint(c);
    }

}
