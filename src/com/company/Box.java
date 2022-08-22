package com.company;

public class Box<T> {
    int id;

    public Box(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id=" + id;
    }

    public static <T> void method(){
        Box box=new Box(12);
        System.out.println(box);

    }
}

