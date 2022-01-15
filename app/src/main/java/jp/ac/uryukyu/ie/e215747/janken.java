package jp.ac.uryukyu.ie.e215747;

public class janken {
    public void janken(){
        String playerhand;
        String enemyhand;
        String judgeResult;
        
        player play = new player();
        hand ha = new hand();
        Enemy enemy  = new Enemy();
        judge judge = new judge();
    
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
    

