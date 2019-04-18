package SecondTry.Victor_Kuryshev_Bouble_Shooter_2D_FUN;

import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        JFrame myFrame=new JFrame("bubble shooter");
        GamePanel panel=new GamePanel(200,300);
        //myFrame.setLayout();
        myFrame.setContentPane(panel);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
