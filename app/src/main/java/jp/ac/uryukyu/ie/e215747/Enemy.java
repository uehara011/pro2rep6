package jp.ac.uryukyu.ie.e215747;
import java.util.Random;

public class Enemy {
    /*
     敵が出す手をランダムで決めるクラス
    */
    public String enemyH(){
        String[] hand = { "グー", "チョキ", "パー" };                                                                                                                                                                                                                                                              
        Random r = new Random();
        String enemyhand = hand[r.nextInt(3)];
        return enemyhand;
    }
}
    

