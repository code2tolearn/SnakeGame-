import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){

         this.add(new GamePanel()) ; //   or  this.add(new GamePanel() ; )
         this.setTitle("Snake Game");
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
         this.setResizable(false) ;
         this.setVisible(true);
         this.pack(); ;
         this.setLocationRelativeTo(null); // set the frame in middle
    }
}
