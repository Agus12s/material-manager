import view.MainView;
import view.NewIngredientView;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override public void run() {
        final JFrame mainWindow = new MainView();
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
      }
    });
  }

}
