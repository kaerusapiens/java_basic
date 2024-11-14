
class backeryOrder{
    public static void main(String[] args){
        int total_value = 0;
        for (int i = 0; i < args.length; i+=2){
                String menu = args[i];
                int qty = Integer.parseInt(args[i+1]);
                switch (menu) {
                    case "ショートケーキ":
                        total_value += (qty * 320);
                        break;
                    case "モンブラン":
                        total_value += (qty * 350);
                        break;
                    case "チョコレートケーキ":
                        total_value += (qty * 370);
                        break;
                    case "いちごのタルト":
                        total_value += (qty * 400);
                        break;
                    case "チーズケーキ ":
                        total_value += (qty * 300);
                        break;
                };
        };

        //特別割引率20%割引
        if (total_value > 1000){
            
            total_value = (int)(total_value * 0.8);
        };

        //消費税8パーセント
        total_value = (int)(total_value * 1.08);

        System.out.println("合計は" + total_value + "円です");
            };
};