// anas el malki 300248697
import java.util.ArrayList;
import java.util.List;

public class NearestNeighbor{

    //public static List<Point3D> DB;
    private List<Point3D> L;

   //constructor
    public NearestNeighbor(List<Point3D> liste){
        this.L = liste;
    }

    public List<Point3D> rangeQuery(Point3D Q, double eps){
        
        List<Point3D> N = new ArrayList<>();

        for (Point3D p : L) { // Scan all points in DB 
            if(p.distance(Q) <= eps){ // Calculate distance 
                N.add(p); // Add to the arraylist 
            }
            
        }
        return N;
    }

}