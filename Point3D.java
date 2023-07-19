//anas el malki 300248697
public class Point3D {

    private double X; 
    private double Y;  
    private double Z;  
    public int Clabel;    // Cluster counter                       // 0 means undefined 

    //constructor
    public Point3D(double X, double Y, double Z){
        this.X = X;
        this.Y = Y;
        this.Z = Z;
        Clabel=0;
    }
    //getters
    public int getcluster(){
        return Clabel;}
        
    public double getX(){
        return X;}

    public double getY(){
        return Y;}
    
    public double getZ(){
        return Z;}
 
  //a distance method that calculates the euclidean distance between two points
   public double distance(Point3D pt){    
    return Math.sqrt((Math.pow(getX() - pt.getX(), 2) + Math.pow(getY() - pt.getY() , 2)+Math.pow(getZ() - pt.getZ() , 2)));}
    @Override
    //ToString method to facilitate the representation
    public String toString() {
        return String.valueOf(getX())+","+String.valueOf(getY())+","+String.valueOf(getZ())+","+String.valueOf(getcluster());
    }
}
