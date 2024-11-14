
class vending_machine{
    public static void main(String[] args){
        int total_value = 0;
        for (int i = 0; i < args.length; i++){
            int coin = Integer.parseInt(args[i]);
            if (coin == 10|| coin == 50 || coin == 100 || coin == 500){
                total_value += Integer.parseInt(args[i]);
            }
            else{
                System.out.println("警告 : " + coin +"は使いません" );
                continue;
            }
            }
        
        System.out.println("投入合計は" + total_value + "円です");
};
}