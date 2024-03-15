package sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class DesktopAutomation {
	Screen s = new Screen();
  @Test
  public void desktopautomation() throws FindFailed, InterruptedException {
//	  s.click("C:\\Users\\Admin\\Documents\\lib\\sikuli\\Window.PNG");
	  Thread.sleep(4000);
	  s.click("C:\\Users\\Admin\\Documents\\lib\\sikuli\\Wifi.PNG");
	  Thread.sleep(6000);
	  s.dragDrop("C:\\Users\\Admin\\Documents\\lib\\sikuli\\Epfo.PNG","C:\\Users\\Admin\\Documents\\lib\\sikuli\\Feb2024.PNG");
	  Thread.sleep(6000);
	  s.doubleClick("C:\\Users\\Admin\\Documents\\lib\\sikuli\\Feb2024.PNG");
  }
}
