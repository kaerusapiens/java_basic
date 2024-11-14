package java_basic;
class fibonacci{
    public static void main(String[] args){
        int start_number = Integer.parseInt(args[0]);
        int end_number = start_number;
        while( end_number < 100){
            System.out.println(end_number);
            end_number += end_number;
        }
    }
}