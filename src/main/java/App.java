package main.java;

import view.MainView;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class App {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override public void run() {
        final JFrame mainWindow = new MainView();
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
      }
    });
  }

}
