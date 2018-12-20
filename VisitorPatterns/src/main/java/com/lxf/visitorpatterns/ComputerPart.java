package com.lxf.visitorpatterns;

public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);
}
