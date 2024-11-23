public class Referee {
    private String name;

    Referee(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }


    void judement(String player1, String player1Handstatus, String player2, String player2Handstatus){
        // 結果を表示
        System.out.println(getName() + ">>>>>>>>>>>");
        System.out.println(player1 + " chose: " + player1Handstatus);
        System.out.println(player2 + " chose: " + player2Handstatus);

        // 勝敗を判定
        if (player1Handstatus.equals(player2Handstatus)) {
            System.out.println("It's a draw!");
        } else if (
            (player1Handstatus.equals("rock") && player2Handstatus.equals("scissors")) ||
            (player1Handstatus.equals("scissors") && player2Handstatus.equals("paper")) ||
            (player1Handstatus.equals("paper") && player2Handstatus.equals("rock"))
        ) {
            System.out.println(player1 + " wins!");
        } else {
            System.out.println(player2 + " wins!");
        }
    }
    
}
