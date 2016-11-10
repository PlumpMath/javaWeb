package com.xiechangqing;

/**
 * Created by Administrator on 2016/11/10.
 */
class CarMethod{
    String name;
    String color;
    int wheel;
    public void run(){
        System.out.print(name+"是一辆汽车");
    }
}

class Car{
    public static void main(String[] args){
        CarMethod c1 = new CarMethod();
        c1.name="宝马";
        CarMethod c2 = new CarMethod();
        c2.name = "奔驰";
        c1 = c2;
        System.out.print(c1.name);
    }
}
