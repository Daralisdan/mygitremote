package daralisdan;

public class Driver {
  // 在java中有一个特定的方法去访问一个类里面的属性，就是在类里面封装为私有的属性（不让别人直接访问）调用get/set 方法
  /**
   * 不加private直接访问，相当于是无条件对外开放，想怎么修改就怎么修改，get/set方法相当于的访问属性设置的权限，只看就设置get方法，只改就设置set方法，
   * 都需要就设置get、set方法，还可以在get/set里面加逻辑判断
   */
  private String dname; // 加上private的作用

  public String getDname() {
    return dname;
  }

  public void setDname(String dname) {
    this.dname = dname;
  }

  // public void driver(Car c) {
  // c.go(new Address("东北")); //3.为了支持这种直接告诉车目的地的写法,需要在封装目的地类中加一个构造方法,而封装车的类中也需要传入封装目的地参数
  // //1.调用对车封装的对象方法
  // //2.隐藏目的地对象的封装直接告诉这个车去哪里
  // }
  // //一般能添加扩展就不修改的原则
  // //同类中方法名相同参数不同,叫方法的重载
  // public void driver(Car c,Address dest) {
  // c.go(dest);
  // }
  // public void diver(Plane p) {
  // p.go(new Address("东北"));
  // }
  // public void diver(Plane p,Address dest) {
  // p.go(dest);
  // }

  public void diver(Vihecle v) {
    // 只要从Vihecle 类继承出来的任何内容，任何类的对象都可以往里面传
    // 假如想传入Plane类，则需要在封装Plane类中继承Vihecle类，同理想传car,封装Car的类继承Vihecle类（extends Vihecle）
    // 这种方式叫父类的引用指向子类的对象
    v.go(new Address("东北")); // 需要在Vihecle类中新建一个go方法
  }

  public void driver(Car c, Address dest) {
    c.go(dest);
  }
}
