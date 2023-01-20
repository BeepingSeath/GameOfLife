package Model;
import java.util.ArrayList;
public class GameMaster {
    int height = 0;
    int width = 0;
    ArrayList<cell> cells = new ArrayList<>();

    public GameMaster(int width, int height){
        this.height = height;
        this.width = width;
    }

    public ArrayList GenerateCells() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++){
                cells.add(new cell(i,j, false));
            }
        }
        return cells;
    }
}