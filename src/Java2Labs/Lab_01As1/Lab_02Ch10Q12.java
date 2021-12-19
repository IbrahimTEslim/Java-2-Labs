package Java2Labs.Lab_01As1;

import java.awt.geom.Line2D;

public class Lab_02Ch10Q12 {
    public static void main(String[] args) {

    }

    class Triangle2D {
        private MyPoint p1,p2,p3;

        public MyPoint getP1() {return p1; }
        public void setP1(MyPoint p1) {this.p1 = p1; }
        public MyPoint getP2() { return p2; }
        public void setP2(MyPoint p2) { this.p2 = p2; }
        public MyPoint getP3() { return p3; }
        public void setP3(MyPoint p3) { this.p3 = p3; }
        public Triangle2D() {
            setP1(new MyPoint(0,0));
            setP2(new MyPoint(1,1));
            setP3(new MyPoint(2,5));
        }
        public Triangle2D(MyPoint p1,MyPoint p2,MyPoint p3) {setP1(p1); setP2(p2); setP3(p3); }
        public double getArea() {
            double area = (p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y)) / 2.0f;
            return Math.abs(area);
        }
        public double getPerimeter() {return p1.distance(p2)+p1.distance(p3)+p2.distance(p3);}
        public boolean contains(MyPoint p){
            int minX=Math.min(p1.x,Math.min(p2.x,p3.x)); int maxX=Math.max(p1.x,Math.max(p2.x,p3.x));
            int minY=Math.min(p1.y,Math.min(p2.y,p3.y)); int maxY=Math.max(p1.y,Math.max(p2.y,p3.y));
            return (p.x > minX && p.x<maxX) && (p.y > minY && p.y<maxY);
        }
        public boolean contains(Triangle2D t) { return contains(t.p1) && contains(t.p2) && contains(t.p3); }
        public boolean overlaps(Triangle2D t) {
            Line2D oldL1=new Line2D.Double(this.p1.x,this.p1.y,this.p2.x,this.p2.y);
            Line2D oldL2=new Line2D.Double(this.p1.x,this.p1.y,this.p3.x,this.p3.y);
            Line2D oldL3=new Line2D.Double(this.p2.x,this.p2.y,this.p3.x,this.p3.y);

            Line2D l1=new Line2D.Double(t.p1.x,t.p1.y,t.p2.x,t.p2.y);
            Line2D l2=new Line2D.Double(t.p1.x,t.p1.y,t.p3.x,t.p3.y);
            Line2D l3=new Line2D.Double(t.p2.x,t.p2.y,t.p3.x,t.p3.y);

            if(oldL1.intersectsLine(l1) ||  oldL1.intersectsLine(l2) || oldL1.intersectsLine(l3) ) return true;
            if(oldL2.intersectsLine(l1) ||  oldL2.intersectsLine(l2) || oldL2.intersectsLine(l3) ) return true;
            if(oldL3.intersectsLine(l1) ||  oldL3.intersectsLine(l2) || oldL3.intersectsLine(l3) ) return true;
            return false;
        }
    }
    static class MyPoint {
        int x,y;
        public MyPoint() { this.x = 0;this.y=0;}
        public MyPoint(int x,int y) { this.x = x;this.y=y;}
        public double distance(MyPoint p){ return Math.pow(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2),0.5); }
        public static double distance(MyPoint a,MyPoint p) { return Math.pow(Math.pow(a.x-p.x,2)+Math.pow(a.y-p.y,2),0.5); }
    }
}
