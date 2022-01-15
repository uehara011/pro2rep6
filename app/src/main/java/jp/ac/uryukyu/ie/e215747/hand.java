package jp.ac.uryukyu.ie.e215747;

public class hand {
    public void playerhand(String playerhand){
        System.out.println("あなたの手は「" + playerhand + "。");
    }

    
    public void enemyH(String enemyhand){
        System.out.println("相手は「" + enemyhand + "。");
    }

   
    public void ruleExplanation(){
        System.out.printf("「グー」or「チョキ」or「パー」or「終了」を出せるよ!\n「終了」を入力するとジャンケンが終了するよ!\n");
    }

    
}
    

