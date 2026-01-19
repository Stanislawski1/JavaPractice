package utils;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class DrawImage {

    public static void drawImageAsAscii(String path) {
        try {
            BufferedImage image = ImageIO.read(new File(path));

            int scaledWidth = 100;
            int scaledHeight = (int) (image.getHeight() * ((double) scaledWidth / image.getWidth()) / 2);

            String asciiSymbols = " .:-=+*#%@";

            for (int y = 0; y < scaledHeight; y++) {
                for (int x = 0; x < scaledWidth; x++) {
                    int origX = x * image.getWidth() / scaledWidth;
                    int origY = y * image.getHeight() / scaledHeight;

                    int pixel = image.getRGB(origX, origY);
                    int r = (pixel >> 16) & 0xff;
                    int g = (pixel >> 8) & 0xff;
                    int b = pixel & 0xff;

                    int brightness = (r + g + b) / 3;
                    int index = (brightness * (asciiSymbols.length() - 1)) / 255;
                    System.out.print(asciiSymbols.charAt(index));
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
    }
}