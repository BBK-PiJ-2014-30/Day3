/**
 * Created by devon on 07/11/2014.
 */
public class Rect {

    int upLeft;
    int downRight;

    public Rect (int num1, int num2){
        this.upLeft = num1;
        this.downRight = num2;

    }

    int getArea ( ){

        return upLeft* downRight;
    }
    int getPerimeter (){

        return upLeft + downRight * 2;

    }

}

