package Model;
import java.util.ArrayList;
public class GameMaster {
    ArrayList<cell> cells = new ArrayList<>();
    
    public void GenerateCells(int Width, int Height) {
        for (int i = 0; i < Width; i++) {
            for (int j = 0; j < Height; j++){
                cells.add(new cell(i,j, true));
            }
        }
    }
}
