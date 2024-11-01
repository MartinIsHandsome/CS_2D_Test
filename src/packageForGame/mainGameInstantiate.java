package packageForGame;

public class mainGameInstantiate {

	public static void main(String[] args) {
		pointOfWalkingEntity pointOne = new pointOfWalkingEntity(70, 10);
		classForEntity martin = new classForEntity("Martin", 3.5f, 100, pointOne,"src/packageForGameArt/HumanPistol_CS.png");
		classForCreatingTheMap n = new classForCreatingTheMap(0.01f);
		n.addEntityToMap(martin);

        // Example movement: Move martin by 10 pixels right and 5 pixels down
       // martin.moveEntity(10, 5); // Update martin's position in the map
	}

}
