package Model;
import View.*;

import java.util.ArrayList;

public class Model {
    ArrayList<cell> cells;

    public Model(int width, int height) {
        GameMaster test = new GameMaster();
        cells = new ArrayList<cell>();


    }

    public void update() {

    }

    public Shape[] getShapes() {
        ArrayList<Point> points = new ArrayList<Point>();
        for (int i = 0 ; i < cells.size() ; i++) {
            if (cells.get(i).state == true) {
                points.add(new Point(cells.get(i).x, cells.get(i).y));
            }
        }
        Point[] pixelsToDisplay = new Point[points.size()];
        points.toArray(pixelsToDisplay);
        return (Shape[])points;
    }
}
