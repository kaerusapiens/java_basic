
class BattleGround{

    public static void main(String[] args) {
        String player1 = args[0];
        String player2 = args[1];
<<<<<<< HEAD

        Player a = new Player(player1);
        Player b = new Player(player2);
=======
        String referee = args[2];

        Player a = new Player(player1);
        Player b = new Player(player2);
        Referee c = new Referee(referee);

>>>>>>> 1f991cc (public attribute to private)

        // ランダムな手を生成
        a.makeHandSake();
        b.makeHandSake();

<<<<<<< HEAD
        // 結果を表示
        System.out.println(player1 + " chose: " + a.handStatus);
        System.out.println(player2 + " chose: " + b.handStatus);

        // 勝敗を判定
        if (a.handStatus.equals(b.handStatus)) {
            System.out.println("It's a draw!");
        } else if (
            (a.handStatus.equals("rock") && b.handStatus.equals("scissors")) ||
            (a.handStatus.equals("scissors") && b.handStatus.equals("paper")) ||
            (a.handStatus.equals("paper") && b.handStatus.equals("rock"))
        ) {
            System.out.println(player1 + " wins!");
        } else {
            System.out.println(player2 + " wins!");
        }
    }
}
=======
        c.judement(a.getName(),a.getHandStatus(),b.getName(),b.getHandStatus());
    }
    }
>>>>>>> 1f991cc (public attribute to private)
