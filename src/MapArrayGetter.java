import java.util.Scanner;
import java.io.*;
public class MapArrayGetter {
    private String[] MapArray = new String[23];
    private File file = new File("array.txt");

    public void getMapFromString(){
        try(Scanner sc = new Scanner(file)){
            System.out.println("accessed File");
            for(int i = 0;i<23;i++){
                MapArray[i] = sc.nextLine();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public String[] getMapArray(){
        getMapFromString();
        return this.MapArray;
    }
}
