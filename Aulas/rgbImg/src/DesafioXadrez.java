import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DesafioXadrez {

    public static void main(String[] args) throws IOException
    {
        BufferedImage originalImg = ImageIO.read(new File("./src/recursos_img/xadrez.png"));
        BufferedImage targetImg = new BufferedImage(originalImg.getWidth(), originalImg.getHeight(), BufferedImage.TYPE_INT_ARGB);

        for (int x = 2300; x < 3500; x++)
        {
            for (int y = 1100; y < 2800; y++)
            {
                  int rgb = originalImg.getRGB(x, y);
//                int red = (rgb & 0x00FF0000) >> 16; // 2 bytes
//                int green = (rgb & 0x0000FF00) >> 8; // 1 byte
//                int blue = (rgb & 0x000000FF);
//                int transparency = (rgb & 0xFF000000) >> 24;

//                System.out.printf(" A cor %d ", y);
//                System.out.println();

                if((rgb & 0x00ff0000) >> 16 != 120 && (rgb & 0x0000ff00) >> 8 != 120 && (rgb & 0x000000ff) != 120)
                {
                    int newRgb = 0xff00ee33;
                    targetImg.getRaster().setDataElements(x, y, targetImg.getColorModel().getDataElements(newRgb, null));
                }
                else
                {
                    targetImg.getRaster().setDataElements(x, y, targetImg.getColorModel().getDataElements(rgb, null));
                }
            }
        }
        File outputFile = new File("./out/xadrez.png");
        ImageIO.write(targetImg, "png", outputFile);
    }
}
//2810 - Largura
//2185 - Altura