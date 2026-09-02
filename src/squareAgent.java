public class squareAgent {
    Square[][] sqmap;
    public squareAgent(Square[][] squaremap){
        this.sqmap = squaremap;
    }
    public Square getTop(Square sq, int x){
        if(sq.getYcoord()-x>0 && sq.getYcoord() - x < 23)
        return sqmap[sq.getXcoord()][sq.getYcoord()-x];
        else
            return new Square(0,0,0);
    }

    public Square getBottom(Square sq, int x){
        if(sq.getYcoord() + x < 23 && sq.getYcoord()+x>0)
        return sqmap[sq.getXcoord()][sq.getYcoord()+x];
        else
            return new Square(0,0,0);
    }

    public Square getRight(Square sq, int x){
        if(sq.getXcoord()+x<23 && sq.getXcoord()+x>0)
        return sqmap[sq.getXcoord()+x][sq.getYcoord()];
        else
            return new Square(0,0,0);
    }

    public Square getLeft(Square sq, int x){
        if(sq.getXcoord()-x>0 && sq.getXcoord() - x < 23)
        return sqmap[sq.getXcoord()-x][sq.getYcoord()];
        else
            return new Square(0,0,0);
    }

    public Square getBottomRight(Square sq,int x){
        if(sq.getXcoord()+x>0 && sq.getXcoord() + x < 23 && sq.getYcoord() + x < 23 && sq.getYcoord()+x>0)
            return sqmap[sq.getXcoord()+x][sq.getYcoord()+x];
        else
            return new Square(0,0,0);
    }

    public Square getBottomLeft(Square sq,int x){
        if(sq.getXcoord()-x>0 && sq.getXcoord() - x < 23 && sq.getYcoord() + x < 23 && sq.getYcoord()+x>0)
            return sqmap[sq.getXcoord()-x][sq.getYcoord()+x];
        else
            return new Square(0,0,0);
    }

    public Square getTopRight(Square sq,int x){
        if(sq.getXcoord()+x>0 && sq.getXcoord() + x < 23 && sq.getYcoord() - x < 23 && sq.getYcoord()-x>0)
            return sqmap[sq.getXcoord()+x][sq.getYcoord()-x];
        else
            return new Square(0,0,0);
    }

    public Square getTopLeft(Square sq,int x){
        if(sq.getXcoord()-x>0 && sq.getXcoord() - x < 23 && sq.getYcoord() - x < 23 && sq.getYcoord()-x>0)
            return sqmap[sq.getXcoord()-x][sq.getYcoord()-x];
        else
            return new Square(0,0,0);
    }

    public boolean checkForWayOut(Square sq){
        if(getLeft(sq,sq.getNumber()).getNumber() == 0){
            if(getLeft(sq,sq.getNumber()-1).getNumber() != 0 && getLeft(sq,sq.getNumber()-1).getNumber() != -1){
                System.out.println("left  ");
                System.out.println(getLeft(sq,sq.getNumber()-1).getNumber()+ " " + getLeft(sq,sq.getNumber()-1) );
                return true;
            }
        }
        if(getRight(sq,sq.getNumber()).getNumber() == 0){
            if(getRight(sq,sq.getNumber()-1).getNumber() != 0 && getRight(sq,sq.getNumber()-1).getNumber() != -1){
                System.out.print("right");
                System.out.println(getRight(sq,sq.getNumber()-1));
                return true;
            }
        }
        if(getTop(sq,sq.getNumber()).getNumber() == 0){
            if(getTop(sq,sq.getNumber()-1).getNumber() != 0 && getTop(sq,sq.getNumber()-1).getNumber() != -1){
                System.out.println("top");
                System.out.println(getTop(sq,sq.getNumber()-1));
                return true;
            }
        }
        if(getBottom(sq,sq.getNumber()).getNumber() == 0){
            if(getBottom(sq,sq.getNumber()-1).getNumber() != 0 && getBottom(sq,sq.getNumber()-1).getNumber() != -1){
                System.out.print("bottom");
                System.out.println(getBottom(sq,sq.getNumber()-1));
                return true;
            }
        }

        if(getTopRight(sq,sq.getNumber()).getNumber() == 0){
            if(getTopRight(sq,sq.getNumber()-1).getNumber() != 0 && getLeft(sq,sq.getNumber()-1).getNumber() != -1){
                System.out.println("left  ");
                System.out.println(getLeft(sq,sq.getNumber()-1).getNumber()+ " " + getLeft(sq,sq.getNumber()-1) );
                return true;
            }
        }
        if(getBottomRight(sq,sq.getNumber()).getNumber() == 0){
            if(getBottomRight(sq,sq.getNumber()-1).getNumber() != 0 && getRight(sq,sq.getNumber()-1).getNumber() != -1){
                System.out.print("right");
                System.out.println(getRight(sq,sq.getNumber()-1));
                return true;
            }
        }
        if(getTopLeft(sq,sq.getNumber()).getNumber() == 0){
            if(getTopLeft(sq,sq.getNumber()-1).getNumber() != 0 && getTop(sq,sq.getNumber()-1).getNumber() != -1){
                System.out.println("top");
                System.out.println(getTop(sq,sq.getNumber()-1));
                return true;
            }
        }
        if(getBottomLeft(sq,sq.getNumber()).getNumber() == 0){
            if(getBottomLeft(sq,sq.getNumber()-1).getNumber() != 0 && getBottom(sq,sq.getNumber()-1).getNumber() != -1){
                System.out.print("bottom");
                System.out.println(getBottom(sq,sq.getNumber()-1));
                return true;
            }
        }
        return false;
    }
}
