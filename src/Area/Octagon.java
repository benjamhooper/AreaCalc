package Area;
import java.lang.Math;
        
public class Octagon 
    extends GeometricObject {
    private GeometricObject octagon;
    
    
    public Octagon(double sidelength){
        //octagon = new GeometricObject();
        this.setSideLength(sidelength);
    }
   
    public double getArea(){
        double a;
        a = 2 * (1+ Math.sqrt(2))* Math.pow(this.getSideLength(), 2);
        return a;
    }

    
}
