import java.util.Random;

class Player{
    //カプセル化
    private String name;
    private String handStatus;
    Player(String name){
        this.name = name;
        this.handStatus = null;
    };

    //getterメソッド
    String getName(){
        return this.name;
    };
    String getHandStatus(){
        return this.handStatus;
    };
    void makeHandSake(){
        Random random = new Random();
        String[] choices = {"rock", "scissors", "paper"};
        int randomIndex = random.nextInt(choices.length);
        String randomChoice = choices[randomIndex];
        this.handStatus = randomChoice;
    };
    };