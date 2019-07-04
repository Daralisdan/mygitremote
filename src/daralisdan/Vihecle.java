package daralisdan;

public abstract class Vihecle {
  public abstract void go(Address dest); //不需要实现，没有任何的实现，这个方法就可以为抽象方法
    //这个类只要包含了抽象方法,这个类就必须为抽象类,反之则不一定
    //这个go方法Vihecle不知道怎么实现，但是Car知道怎么实现，传Car类方法的参数 ，重写父类的方法
   //相当于Car类中重写了这个父类的方法
}
