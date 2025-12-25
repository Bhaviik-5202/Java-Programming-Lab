/*
*  Create interface EventListener with performEvent() method. Create MouseListener 
*  interface which inherits EventListener along with mouseClicked(), mousePressed(), 
*  mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener 
*  interface which inherits EventListener along with keyPressed(), keyReleased() methods. 
*  WAP to create EventDemo class which implements MouseListener and KeyListener and 
* demonstrate all the methods of the interfaces.
*/

interface EventListener {
  void performEvent();
}

interface MouseListener extends EventListener {
  void mouseClicked();
  void mousePressed();
  void mouseReleased();
  void mouseMoved();
  void mouseDragged();
}

interface KeyListener extends EventListener {
  void keyPressed();
  void keyReleased();
}

public class EventDemo implements MouseListener, KeyListener {

  @Override
  public void mouseClicked() {
      System.out.println("Mouse clicked.");
  }

  @Override
  public void mousePressed() {
      System.out.println("Mouse pressed.");
  }

  @Override
  public void mouseReleased() {
      System.out.println("Mouse released.");
  }

  @Override
  public void mouseMoved() {
      System.out.println("Mouse moved.");
  }

  @Override
  public void mouseDragged() {
      System.out.println("Mouse dragged.");
  }

  @Override
  public void keyPressed() {
      System.out.println("Key pressed.");
  }

  @Override
  public void keyReleased() {
      System.out.println("Key released.");
  }

  @Override
  public void performEvent() {
      System.out.println("Performing a generic event.");
  }

  public class  {
      public void mouseClicked() {
          System.out.println("Mouse clicked.");
      }

      public void mousePressed() {
          System.out.println("Mouse pressed.");
      }

      public void mouseReleased() {
          System.out.println("Mouse released.");
      }

      public void mouseMoved() {
          System.out.println("Mouse moved.");
      }

      public void mouseDragged() {
          System.out.println("Mouse dragged.");
      }

      public void keyPressed() {
          System.out.println("Key pressed.");
      }

      public void keyReleased() {
          System.out.println("Key released.");
      }

      public void performEvent() {
          System.out.println("Performing a generic event.");
      }

      public static void main(String[] args) {
        EventDemo demo = new EventDemo();
  
        demo.mouseClicked();
        demo.mousePressed();
        demo.mouseReleased();
        demo.mouseMoved();
        demo.mouseDragged();
  
        demo.keyPressed();
        demo.keyReleased();
  
        demo.performEvent();
    }
  }
  
}