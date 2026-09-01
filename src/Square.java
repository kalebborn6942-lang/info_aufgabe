public class Square {
    private int ycoord;
    private int xcoord;
    private int number;
    private boolean marked;
    private Square previous;
    private String pathfromprevious;

    public Square(int x, int y, int num){
        this.ycoord = y;
        this.xcoord = x;
        this.number = num;
        this.previous = null;
        this.marked = false;
        this.pathfromprevious = "Anfang";
    }

    public int getNumber(){
        return this.number;
    }

    public boolean isMarked(){
        return marked;
    }

    public void mark(){
        this.marked = true;
    }

    public int getYcoord(){
        return this.ycoord;
    }

    public int getXcoord(){
        return this.xcoord;
    }

    public void setPrevious(Square sq){
        this.previous = sq;
    }

    public Square getPrevious(){
        return this.previous;
    }

    public void setPathfromprevious(String s){
        this.pathfromprevious = s;
    }

    public String getPathfromprevious(){
        return this.pathfromprevious;
    }

    @Override
    public String toString(){
        return this.getNumber() + "  x:" + this.getXcoord() + " y:" + this.getYcoord();
    }
}
