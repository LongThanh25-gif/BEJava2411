package Tuhoc.baitap;

public class bai4 {
    public static void main(String[] args) {
        // Dưới 10M: không đóng thuế
        // từ 10 đến 15M: thuế 10%́
        // từ 15 đến 30M: thuế 20%
        // trên 30M: thuế 50%

        int tax = 0;

        if(tax < 10){
            System.out.println("Không đóng thuế");
        }else if(10 <= tax && tax < 15){
            System.out.println("thuế 10%");
        }else if(15 <= tax && tax < 30){
            System.out.println("thuế 20%");
        }else{
            System.out.println("trên 50% ");
        }
    }
}
