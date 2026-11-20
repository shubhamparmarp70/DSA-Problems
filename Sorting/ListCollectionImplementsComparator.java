package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListCollectionImplementsComparator {
    public static void main(String[] args){
    List<Point>list = new ArrayList<Point>();
    list.add(new Point(5,10));
    list.add(new Point(2,20));
    list.add(new Point(10,3));

    Collections.sort(list, new newListCmp());
    for(Point p : list){
        System.out.println(p.x+" "+p.y);
    }
    }
}

class Point {
    int x, y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}
    class newListCmp implements Comparator<Point> {
         public int compare(Point p1, Point p2){
            return p1.x-p2.x;
         }
    }

