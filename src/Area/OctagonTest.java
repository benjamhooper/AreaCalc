package Area;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OctagonTest {
    public static void main(String[] args) throws FileNotFoundException, IOException{
       // try{
        Scanner input = new Scanner(new File("input.txt"));
        FileWriter output = new FileWriter(new File("report.txt"));
        System.out.println("Benjamin Hooper || Area Calculator");
        ArrayList<Octagon> list;
        list = new ArrayList();
        
        
        
        double cvalue = 0; 
        String svalue = null;
        while(input.hasNext()){
            try{
                svalue = input.next();
                svalue = svalue.replaceAll(",", "");
                cvalue = Double.parseDouble(svalue);
                Octagon o; 
                o = new Octagon(cvalue);
                list.add(o);
                double p = o.getSideLength() * 8;
                System.out.print("The perimeter is: " + p + "\n");
                System.out.print("Side length is: " + o.getSideLength() + "\n");
                System.out.print("The area is: " + o.getArea() + "\n");
                System.out.println("----------------------------");
                
                
            }catch(NumberFormatException ex){
               output.append(svalue);

            }           
        } 
            output.close();
            input.close();
    }
}
