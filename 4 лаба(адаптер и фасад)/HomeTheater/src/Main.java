import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);


        System.out.print("Выберите:\n1 - DVD\n2 - CD\n3 - радио\nВыбор: ");
        int i = inp.nextInt();
        switch (i){
            case 1:
                homeTheaterFacade.watchMovie("Война миров");
                System.out.println();
                homeTheaterFacade.endMovie();
                break;
            case 2:
                homeTheaterFacade.watchCD("Преступление и наказание");
                System.out.println();
                homeTheaterFacade.endMovieCD();
                break;
            case 3:
                homeTheaterFacade.onOffTuner();
                break;
        }
    }
}
