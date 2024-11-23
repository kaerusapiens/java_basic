import java.util.Random;

class Player{
    String name;
    String handStatus;

    Player(){
        this.name = null;
        this.handStatus = null;
    };
    Player(String name){
        this.name = name;
        this.handStatus = null;
    };
    void makeHandSake(){
        Random random = new Random();
        String[] choices = {"rock", "scissors", "paper"};
        int randomIndex = random.nextInt(choices.length);
        String randomChoice = choices[randomIndex];
        this.handStatus = randomChoice;
    };
    };