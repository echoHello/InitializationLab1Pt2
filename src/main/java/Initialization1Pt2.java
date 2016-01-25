/**
 * Created by Taylor on 1/20/16.
 */

class BoringThing {
}

class ColorfulThing {

    public enum Color{
        RED, BLUE, YELLOW
    }
    String color;

    public ColorfulThing(Color theColor) { // pass in an enum Color object called theColor.
        color = String.valueOf(theColor); //store what is passed in as color. Make that a global variable.
//get the string value of the enum ^reference that is passed in, so again, color = theColor
    }

    public String getColor() {

        return color;
    }


}

public class Initialization1Pt2 {
    public static void main(String[] args) {
        // call object type.enumname.enumvalue inside the constructor
        ColorfulThing colorThing = new ColorfulThing(ColorfulThing.Color.RED);
        System.out.println(colorThing.getColor()); //call getColor method on colorThing object
    }
}
