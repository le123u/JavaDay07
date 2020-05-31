package com.neusoft;

public interface A  {
    // 抽象方法 特点:抽象方法使用abstract修饰 可以省略，没有方法体，该方法共子类实现使用
    //public abstract void method();

    // 默认方法 使用default修饰 不可以省略  功能：供子类调用或者子类重写
    //public default void method(){
        // 执行语句
    //}

    //静态方法 使用static 修饰 供接口调用
    public static void method2(){
        //执行语句
    }
    // 私有方法
    // private void method(){

    //}


}
