/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author User
 */
public class MyPoint {
    private int x;
    private int y;
    
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int getDistance(int x, int y) {
        return (int)Math.hypot((x - this.x), (y - this.y));
    }
    
    public int getDistance(MyPoint newPoint){
        return this.getDistance(newPoint.x, newPoint.y);
    }
    public int getDistance(){
        return this.getDistance(this.x, this.y);
    }
    
    public void displayPoint() {
        System.out.println(String.format("(%d, %d)", this.x, this.y));
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
    
    public int getQuadrant(int x, int y){
        if(x != 0){
            if(y == 0){         //(x , 0)
                return 5;
            } else if(x > 0){
                if(y > 0) {     //(x, y)
                    return 1;
                } else {        //(x, -y)
                    return 4;
                }
            } else {       //-x
                if(y > 0) {     //(-x, y)
                    return 2;
                } else {        //(-x, -y)
                    return 3;
                }
            }
        } else if(y != 0) { //x = 0
            return 6;
        } else {                //(0,0)
            return 0;
        }
    }
    
    public int getQuadrant(MyPoint newPoint){
        return this.getQuadrant(newPoint.x, newPoint.y);
    }
    
    public int getQuadrant(){
        return this.getQuadrant(this.x, this.y);
    }
    
    public int getAngle(int x, int y) {
        int quad = this.getQuadrant(x, y);
        
        if(quad == 1 || quad == 4){
            return (int)Math.toDegrees(Math.atan2(y, x));
        }
        
        return 0;
    }
    
    public int getAngle(MyPoint newPoint){
        return this.getAngle(newPoint.x, newPoint.y);
    }
    
    public int getAngle(){
        return this.getAngle(this.x, this.y);
    }
    
        public static void main(String[] args){
            MyPoint p1 = new MyPoint();
            MyPoint p2 = new MyPoint(5, -4);

            System.out.println("Hello World");

            p1.displayPoint();
            System.out.println(p2.toString());
            
            System.out.println(String.format("Quadrant %s: %d", p1.toString(), p1.getQuadrant()));
            System.out.println(String.format("Quadrant %s: %d", p2.toString(), p2.getQuadrant(p2)));
            
            System.out.println(String.format("Angle %s: %d\u00B0", p1.toString(), p1.getAngle()));
            System.out.println(String.format("Angle  %s: %d\u00B0", p2.toString(), p2.getAngle(p2)));

        }
}
