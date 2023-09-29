public class Point {
  //instance variables
  private int x;
  private int y;

  //constructors
  public Point(int xcoord, int ycoord){
      x = xcoord;
      y = ycoord;
  }
  public Point(int coord){
      x = coord;
      y = coord;
  }
  public Point(){
      x = 0;
      y = 0;
  }

  //getters
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }

  //setters
  public void setX(int newX){
    x = newX;
  }
  public void setY(int newY){
    y = newY;
  }

  public String coordinate(){
    return "(" + x + ", " + y + ")";
  }

  public String quadrant(){
    String quad = ".";
    if (x > 0 && y > 0){
      quad = "I";
    }else if (x < 0 && y > 0){
      quad = "II";
    }else if (x < 0 && y < 0){
      quad = "III";
    }else if (x > 0 && y < 0){
      quad =  "IV";
    }else if (x == 0 && y == 0){
      quad = "origin";
    }else if (x == 0){
      quad = "on an axis";
    }else if (y == 0){
      quad = "on an axis";
    }
    return quad;
  }
}
