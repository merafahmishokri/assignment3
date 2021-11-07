
package iinterface;

public class ball implements Tossable {

    String brandName;
    @Override
    public void toss() {}
    public ball(String name){
        this.brandName=name;
    }
    public String getBrandName(){
        return brandName;
    }
    public void bounce(){}
}
