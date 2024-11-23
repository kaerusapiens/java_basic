import java.util.Random;

class Player{
<<<<<<< HEAD
    String name;
    String handStatus;
=======
    //カプセル化
    private String name;
    private String handStatus;
>>>>>>> 1f991cc (public attribute to private)

    Player(){
        this.name = null;
        this.handStatus = null;
    };
    Player(String name){
        this.name = name;
        this.handStatus = null;
    };
<<<<<<< HEAD
=======

    //getterメソッド
    String getName(){
        return this.name;
    };
    String getHandStatus(){
        return this.handStatus;
    };

>>>>>>> 1f991cc (public attribute to private)
    void makeHandSake(){
        Random random = new Random();
        String[] choices = {"rock", "scissors", "paper"};
        int randomIndex = random.nextInt(choices.length);
        String randomChoice = choices[randomIndex];
        this.handStatus = randomChoice;
    };
    };