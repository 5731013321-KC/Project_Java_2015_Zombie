package gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SpriteSheet {
	public String path;
	public int width;
	public int height;
	public int[] pixels;

	public SpriteSheet(String path) {
		BufferedImage image;
		try {
			ClassLoader loader = SpriteSheet.class.getClassLoader();
			image = ImageIO.read(loader.getResource(path));
		} catch (IOException e) {
			image = null;
		}
		this.path = path;
		this.width = image.getWidth();
		this.height = image.getHeight();

		pixels = image.getRGB(0, 0, width, height, null, 0, width);

		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = (pixels[i] & 0xff) / 64;
		}
	}
}
