import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception {
//        System.out.println("Введите число");
//        int moneyAmound;
//        String[] drinkName = {"Capuchino", "Espresso", "Milk", "Water"};
//        int[] drinkPrice = {150, 100, 80,30};
//
//        Scanner in = new Scanner(System.in);
//        moneyAmound = in.nextInt();
//
//        for(int i = 0; i<drinkPrice.length; i++){
//            if(moneyAmound < drinkPrice[i]) {
//                System.out.println("Вы не можете позволить " + drinkName[i] + " - " + drinkPrice[i]);
//            }else {
//                System.out.println("Вы можете позволить " + drinkName[i] + " - " + drinkPrice[i]);
//            }
//        }

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date now = new Date();
        String screenName = formatter.format(now) + ".png";
        System.out.println(screenName);

        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, "png", new File(screenName));
        System.out.println(image.getWidth() + "X" + image.getHeight());
    }
}
