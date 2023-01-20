package Model;
import View.*;

import java.util.ArrayList;

public class Model {
    ArrayList<cell> cells;

    public Model(int width, int height) {
        GameMaster test = new GameMaster(width,height);
        cells = test.GenerateCells();
        for (int i = 1; i < 40; i++) {
            cells.get(i*50+120).setState(true);

        }



    }

    public void update() {

    }
    public void CheckSurroundings() {
        for (int i = 0; i < cells.size(); i++){
            
        }
    }


    public Shape[] getShapes() {
        ArrayList<Point> points = new ArrayList<Point>();
        for (int i = 0 ; i < cells.size() ; i++) {
            if (cells.get(i).state == true) {
                points.add(new Point(cells.get(i).x, cells.get(i).y));
            }
        }
        Point[] pointsar = points.toArray(new Point[0]);
        return (Shape[])pointsar;
    }
}
