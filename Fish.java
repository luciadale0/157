import objectdraw.*;
import java.awt.Color;
public class Fish{
  private FilledOval body;
  public Fish(Location p, DrawingCanvas dc){
    body = new FilledOval(p, 100,100, dc);
    body.setColor(Color.GREEN);
  }
}
