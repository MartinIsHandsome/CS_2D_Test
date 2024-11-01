package packageForGame;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class classForEntity {

	
	public boolean playable;
	public String nameOfWeapon;
	public int ammoCapacity;
	public int ammoInReserve;
	public String nameEntity;
	public float walkSpeed;
	public int healthPoints;
	public pointOfWalkingEntity position; // Link to position object
	public ImageIcon sprite; // New field for the entity's sprite
	private JLabel entityLabel; // JLabel for the entity

	
	public void showWeapon(String nameOfGun,int ammoGun,int ammoBack) {
		
		
	}
	public void clickToPlay() {
		playable = true;
	}

	public void healEntity(int healing) {
		healthPoints += healing;
	}

	public void damageEntity(int damage) {
		healthPoints -= damage;
	}

	// Constructor to initialize name, position, etc.
	public classForEntity(String name, float speed, int health, pointOfWalkingEntity position, String spritePath) {
		this.nameEntity = name;
		this.walkSpeed = speed;
		this.healthPoints = health;
		this.position = position;
		this.sprite = new ImageIcon(spritePath); // Load the sprite from the provided path

		if (sprite.getIconWidth() == -1) {
			System.out.println("Image not found or failed to load.");
		}
		this.entityLabel = new JLabel(sprite);
		this.entityLabel.setBounds(position.getX(), position.getY(), sprite.getIconWidth(), sprite.getIconHeight());

	}

	public JLabel getEntityLabel() {
		return entityLabel;
	}

	// Optional: Method to move the entity
	public void moveEntity(int deltaX, int deltaY) {
		position.positionX += deltaX;
		position.positionY += deltaY;
		entityLabel.setLocation(position.positionX, position.positionY); // Update label position

	}
}
