package packageForGame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class classForCreatingTheMap {
	protected JFrame frame;
	private classForEntity entity; // Reference to the entity to move

	public classForCreatingTheMap(float number) {
		frame = new JFrame("CS 2D [" + number + "]");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setupFrame();
	}

	protected void setupFrame() {
		frame.setLayout(null); // Set null layout for precise positioning
		frame.setVisible(true);

		// Add KeyListener for controlling movement
		frame.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (entity != null) { // Ensure there's an entity to move
					int deltaX = 0;
					int deltaY = 0;

					// Check which key is pressed and set delta values
					switch (e.getKeyCode()) {
					case KeyEvent.VK_W: // Move up
						deltaY = -5;
						break;
					case KeyEvent.VK_S: // Move down
						deltaY = 5;
						break;
					case KeyEvent.VK_A: // Move left
						deltaX = -5;
						break;
					case KeyEvent.VK_D: // Move right
						deltaX = 5;
						break;
					}

					// Move the entity by deltaX, deltaY
					entity.moveEntity(deltaX, deltaY);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyTyped(KeyEvent e) {
			}
		});

		frame.setFocusable(true); // Make sure frame is focusable to capture key events
		frame.requestFocusInWindow(); // Request focus for the frame to capture key events

	}

	// Add entity to the map using its sprite
	public void addEntityToMap(classForEntity entity) {
		JLabel textLabel = new JLabel(entity.nameEntity);
		textLabel.setBounds(entity.position.getX() + 180, entity.position.getY() - 45, entity.sprite.getIconWidth(),
				entity.sprite.getIconHeight());
		this.entity = entity; // Store reference to the entity for movement
		JLabel entityLabel = entity.getEntityLabel(); // Retrieve the entity label
		// JLabel entityLabel = new JLabel(entity.sprite); // Use the sprite as label
		// icon
		entityLabel.setBounds(entity.position.getX(), entity.position.getY(), entity.sprite.getIconWidth(),
				entity.sprite.getIconHeight());
		frame.add(entityLabel);
		frame.add(textLabel);

		frame.revalidate();
		frame.repaint();
	}
}
