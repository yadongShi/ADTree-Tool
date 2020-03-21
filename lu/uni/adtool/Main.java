package lu.uni.adtool;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import lu.uni.adtool.ui.MainWindow;

public final class Main
{
  private Main()
  {
  }
  public static void main(final String[] args)
  {
      try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
			| UnsupportedLookAndFeelException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        new MainWindow(args);
      }
    });
  }
}
