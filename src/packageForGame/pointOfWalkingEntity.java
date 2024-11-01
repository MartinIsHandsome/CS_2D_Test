package packageForGame;

public class pointOfWalkingEntity {

	int positionX;
	int positionY;

    public pointOfWalkingEntity(int x, int y) {
        this.positionX = x;
        this.positionY = y;
    }
    
    // Getters for X and Y coordinates
    public int getX() {
        return positionX;
    }

    public int getY() {
        return positionY;
    }
}
