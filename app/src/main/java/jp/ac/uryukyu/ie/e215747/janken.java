package jp.ac.uryukyu.ie.e215747;
/*
ジャンケンの大元の流れのクラス

*/

public class janken {
    public void Janken(){
        String playerhand;
        String enemyhand;
        String judgeResult;
        
        player play = new player();
        hand ha = new hand();
        Enemy enemy  = new Enemy();
        Judge judge = new Judge();
    
        ha.ruleExplanation();
        while(true){
            playerhand = play.playerH(); 
            enemyhand = enemy.enemyH();
            
                
            if(playerhand.equals("グー") || playerhand.equals("チョキ") || playerhand.equals("パー")){
                ha.playerhand(playerhand);
                ha.enemyH(enemyhand);
                judgeResult = judge.judge(playerhand,enemyhand);
                System.out.println(judgeResult);
            }
            else if(playerhand.equals("終了")){
                break;
            }
            else{
                System.out.print("もう一度入力してね\n");
            }
        }
        
        System.out.println("終了");
    }    
}
    

