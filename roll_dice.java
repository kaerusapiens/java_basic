
/*-< 演習：Ex1_11_1 >---------------------------------
while文を使用して、6の目がでるまでサイコロを降り続けるプログラムを作成してください。
※1～6までのランダムなint型の値を取得する方法 ： 1 + (int)(Math.random() * 6.0)
※6の目が出たら「6が出たのでを終了します」と表示してください
----------------------------------------------------*/
class roll_dice{
    public static void main(String[] args) {
        int diceValue = 0;
        do{
            diceValue = 1+ (int)(Math.random() * 6.0); //0.0-5.9...    
            System.out.println("サイコロの値は"+ diceValue);

        } while(diceValue != 6);

        System.out.println("6が出たのでを終了します");
    }
    }