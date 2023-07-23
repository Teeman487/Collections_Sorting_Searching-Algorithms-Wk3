package Generics;

public class MYGenericClass <Thing , Thing2>{
    Thing x;  // Integer x;
    Thing2 y;
    MYGenericClass(Thing x, Thing2 y){
        this.x =x;
        this.y=y;
    }
    /*public Integer getValue(){
        return x;
    }*/


    /*public Thing getValue() {
        return x;
    }*/
    public Thing2 getValue() {
        return y;
    }
}
