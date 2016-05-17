import objectdraw.*;
public class FishClient extends WindowController{   
  public static void main(String[] args) {
    new FishClient().startController(1000,1000);
  }
  public void onMousePress(Location p){
    new Fish(p, canvas);
  }
}

