package jp.ac.uryukyu.ie.e215747;

public class Judge{
    String str;
    public String judge(String playerhand, String enemyhand){
        if(playerhand.equals("グー") && enemyhand.equals("グー")){
            
            str = "引き分け";
        }
        else if(playerhand.equals("グー") && enemyhand.equals("チョキ")){
            
            str = "勝ち";
        }
        else if(playerhand.equals("グー") && enemyhand.equals("パー")){
            
            str = "負け";
        }
        else if(playerhand.equals("チョキ") && enemyhand.equals("グー")){
            
            str = "負け";
        }
        else if(playerhand.equals("チョキ") && enemyhand.equals("チョキ")){
            
            str = "引き分け";
        }
        else if(playerhand.equals("チョキ") && enemyhand.equals("パー")){
            
            str = "勝ち";
        }
        else if(playerhand.equals("パー") && enemyhand.equals("グー")){
            
            str = "勝ち";
        }
        else if(playerhand.equals("パー") && enemyhand.equals("チョキ")){
            
            str = "負け";
        }
        else if(playerhand.equals("パー") && enemyhand.equals("パー")){
            
            str = "引き分け";
        }
        return str;
    }
}
    

