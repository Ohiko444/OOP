import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Fisher man = new Fisher();

        int ch = 1;
        while (ch != 0) {
            man.setFishes(0);
            man.read();
            System.out.println("Введите 1 если рыбак ловит рыбу удочкой \n 2 - сетями \n 3 - руками \n 0 - если прекратил рыбачить");
            int ind = inp.nextInt();
            while (ind != 0) {
                switch (ind) {
                    case 1:
                        man.setFishingStrategy(new RodFishing());
                        man.goFishing();
                        break;
                    case 2:
                        man.setFishingStrategy(new NetFishing());
                        man.goFishing();
                        break;
                    case 3:
                        man.setFishingStrategy(new HandsFishing());
                        man.goFishing();
                        break;
                }
                System.out.println("Введите 1 если рыбак ловит рыбу удочкой \n 2 - сетями \n 3 - руками \n 0 - если прекратил рыбачить");
                ind = inp.nextInt();
            }
            System.out.println("----------------------------------------------------------------------------");
            man.write();
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Введите 1, если хотите ввести еще 1 рыбака и 0 чтобы прекратить программу");
            ch = inp.nextInt();
        }
    }
}
