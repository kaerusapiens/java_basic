
class BattleGround{

    public static void main(String[] args) {
        String player1 = args[0];
        String player2 = args[1];
        String referee = args[2];

        Player a = new Player(player1);
        Player b = new Player(player2);
        Referee c = new Referee(referee);


        // ランダムな手を生成
        a.makeHandSake();
        b.makeHandSake();

        c.judement(a.getName(),a.getHandStatus(),b.getName(),b.getHandStatus());
    }
    }
