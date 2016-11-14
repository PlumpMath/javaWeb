package com.xiechangqing;

/**
 * Created by amyqing719@gmail.com 2016/11/10.
 */
class CarMethod{
    String name;
    String color;
    int wheel;
    public void run(){
        if(wheel>=4){
            System.out.print(name+"是一辆汽车");
        }else{
            System.out.print(name+"不是汽车~~~");
        }

    }
}
class CarFactory{
    String name;
    String address;
    String tel;

    public CarMethod repair(CarMethod c){
        if(c.wheel>=4){
            System.out.println("其实车是好的");
        }else{
            System.out.println("车修好了，给钱");
        }
        return c;
    }
}
class Car{
    public static void main(String[] args){
        CarMethod c = new CarMethod();
        c.name = "宝马";
        c.color = "black";
        c.wheel= 4;
        c.run();
        CarFactory f = new CarFactory();
        f.name = "4S";
        f.address = "Chengdu";
        f.tel = "1000000000";
        c = f.repair(c);
        c.run();
    }
}
