package daralisdan;

public class Test {
  public static void main(String[] args) {
    Driver d = new Driver();
    // d.dname 封装的名字，最好不要直接去访问一个类里面的属性
    // 在java中有一个特定的方法去访问一个类里面的属性，就是在类里面封装为私有的属性（不让别人直接访问）调用get/set 方法
    /**
     * 不加private直接访问，相当于是无条件对外开放，想怎么修改就怎么修改，get/set方法相当于的访问属性设置的权限，只看就设置get方法，只改就设置set方法，
     * 都需要就设置get、set方法，还可以在get/set里面加逻辑判断
     */
 d.setDname("老张");  //1.对司机属性的封装
 //d.diver(new Car()); //2.老张与开车之间的封装？
 //d.diver(new Plane());
 d.diver(new Boom());
  }
}
