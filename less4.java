import java.util.Scanner;
class less4 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ведіть 4 значне число");
        int amount = input.nextInt();
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 1; j <= 4 ; j++) {
                for (int k = 1; k <= 4 ; k++) {
                    if (k !=1 && k != j && i != j){
                        amount++;
                        System.out.println(i + "" + j + " + k");
                    }
                }
            }
            System.out.println("Підрахунок з числел  трьохзначні числа є" + amount);
        }
    }
}
