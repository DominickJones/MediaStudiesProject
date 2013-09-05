/**
* @author Dominick Jones <DJ>
* GUI.java : 20:11PM - 05/09/13
*/

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.awt.GridLayout;

public class GUI extends Jframe {
  JFrame frame = new JFrame();
  public GUI(int width, length) {
    frame.setLayout(GridLayout(int width, length));
      grid = new JButton(width, length);
      for (int y=0; y<length; y++) {
        for (int x=0; x<width; x++) {
          grid[x][y] = new JButton("("+x+", "+y+")");
            frame.add(grid[x][y]);
        }
      }
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
  
  
  /**
  * @param args
  */
  public static void main(String[] args) {
  }
