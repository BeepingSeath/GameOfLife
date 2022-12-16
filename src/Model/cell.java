package Model;

public class cell {
    int x;
    int y;
    boolean state = false;
    int neighbours;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(int neighbours) {
        this.neighbours = neighbours;
    }

    public cell(int x, int y, boolean state) {
        this.x = x;
        this.y = y;
        this.state = state;
    }
    public void CheckNewState() {
        if (neighbours < 2) {
            state = false;
        }
        else if (neighbours == 3) {
            state = true;
        }
        else {
            state = false;
        }
    }
}
