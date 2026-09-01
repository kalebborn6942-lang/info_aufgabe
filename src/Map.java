public class Map {
    private static MapArrayGetter arraygetter = new MapArrayGetter();
    private static Square[][] squareMap = new Square[23][23];
    private static String[] map = arraygetter.getMapArray();
    public String[] makeArrayDisplayable(String[] array){
        for(int i = 0;i < array.length;i++){
            array[i] = array[i].replace(",","");
            array[i] = array[i].replace("[","");
            array[i] = array[i].replace("]","");
            array[i] = array[i].replace("0"," ");
        }
        return array;
    }

    public void displayMap(){
        String[] cutDownArr = makeArrayDisplayable(map);
        for(int i = 0;i < 23;i++){
            System.out.println(cutDownArr[i]);
        }
    }

    public String[] formatMap(String[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i].substring(9,arr[i].length()-3);
            arr[i] = arr[i].replace(" ","");
        }
        return arr;
    }

    public void makeSquareMap(){
        Square sq;
        String[] subArray;
        map = formatMap(map);
        for(int i = 0; i < 23; i++){
            subArray = map[i].split(",");
            for(int o = 0;o < subArray.length;o++){
                squareMap[o][i] = new Square(o,i,Integer.parseInt(subArray[o]));

            }
        }
    }

    public Square[][] getSquareMap(){
        makeSquareMap();
        return this.squareMap;
    }
}
