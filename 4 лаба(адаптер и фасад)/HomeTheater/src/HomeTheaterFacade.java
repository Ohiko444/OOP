public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;
    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, Screen screen, TheaterLights lights, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Приготовьтесь посмотреть фильм...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Закрытие кинотеатра...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }


    public void watchCD(String movie){
        System.out.println("Приготовьтесь посмотреть фильм...");
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        cd.on();
        cd.play(movie);
        cd.pause();
        popper.on();
        popper.pop();
        cd.play();
        projector.tvMode();
    }
    public void endMovieCD() {
        System.out.println("Закрытие кинотеатра...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        cd.stop();
        cd.eject();
        cd.off();
    }

    public void onOffTuner(){
        tuner.on();
        tuner.setAm(amp);
        tuner.setFm();
        tuner.setFrequency();
        tuner.off();
    }
}
