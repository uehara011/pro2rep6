package jp.ac.uryukyu.ie.e215747;
import java.util.Scanner;

public class player {
    public String playerH(){
        System.out.println("グーかチョキかパーかどれを出すか選んでね");
        Scanner s = new Scanner(System.in);
        Judge judge = new Judge();
        String playerhand = s.next();
        return playerhand;
    }
    
}
