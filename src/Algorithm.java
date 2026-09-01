import java.util.List;
public class Algorithm {
    static Map map = new Map();
    static Square[][] SquareMap = map.getSquareMap();
    static squareAgent sqagent = new squareAgent(SquareMap);
    static Square current;
    static Queue<Square> queue = new Queue<Square>();
    static Algorithm alg = new Algorithm();
    public static void main(String[] args){
        queue.enqueue(SquareMap[11][11]);
        while(!queue.isEmpty()){
            current = queue.front();
            queue.dequeue();
            if(sqagent.checkForWayOut(current)){
                System.out.println("Ausweg gefunden! "+ current);
                alg.printAusweg(current);
            }
            current.mark();
            alg.enqueueNeighbours(current);
        }
        System.out.println("schleife durch");
    }

    public void enqueueNeighbours(Square sq){
        Square newsq;
        newsq = sqagent.getRight(sq,sq.getNumber());
        enqueueSquare(newsq,sq,"right");
        newsq = sqagent.getLeft(sq,sq.getNumber());
        enqueueSquare(newsq,sq,"left");
        newsq = sqagent.getTop(sq,sq.getNumber());
        enqueueSquare(newsq,sq,"top");
        newsq = sqagent.getBottom(sq,sq.getNumber());
        enqueueSquare(newsq,sq,"bottom");
    }

    public void enqueueSquare(Square newsq,Square sq,String dir){
        if(newsq.getNumber() != 0 && !newsq.isMarked()) {
            queue.enqueue(newsq);
            newsq.setPrevious(sq);
            newsq.setPathfromprevious(sq.getNumber()+" "+dir);
        }
    }
    public static Square[] getListOfAllExits(){
        Square[] exits = new Square[10];
        for(int i = 0;i<SquareMap.length;i++){
            System.out.println("iteration "+i);
            for(int o = 0;o<SquareMap[0].length;o++){
                if(sqagent.checkForWayOut(SquareMap[i][o]) && SquareMap[i][o].getNumber() != 0){
                    exits = addontoarr(exits,SquareMap[i][o]);
                }
            }
        }
        return exits;
    }

    public static Square[] addontoarr(Square[] arr,Square sq){
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == null){
                arr[i] = sq;
                System.out.println(i);
                return arr;
            }
        }
        return arr;
    }

    public void printAusweg(Square sq){
        System.out.println("Ausweg von Nummer "+sq.getPrevious().getNumber());
        while(sq.getPrevious() != null){
            System.out.println(sq.getPrevious()+ " -> "+sq.getPathfromprevious());

            sq = sq.getPrevious();
        }
    }

}
