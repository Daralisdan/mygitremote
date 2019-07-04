package daralisdan;

public class Address {
  private String aName;
  
public String getaName() {
    return aName;
  }

  public void setaName(String aName) {
    this.aName = aName;
  }

  //生成一个构造方法
  public Address(String aName) {
    super();  
    this.aName = aName; 
  }
  
}
