
package q2;

public class Mammal implements animal{
    private int numOfLegs;
    private String favFood;
    public void eat() {}
    public void travel(){}
    public void getNoOfLegs(int num){
        this.numOfLegs=num;
    }
    public int setNoOfLegs(){
        return numOfLegs;
    }
    public void setFavFood(String food){
        this.favFood=food;
    }
    public String getFavFood(){
        return favFood;
    }
}
