package applyFactoryMethod;

import java.awt.*;

public class FactoryShape {
    public Shape createShape(ShapeType shapType){
        switch (shapType){
            case CIRCLE:
                return new Circle();
            case TRIAGLE:
                return new Triagle();
            case RECTANGEL:
                return new Rectagle();
            default:
                return null;
        }
    }
}
