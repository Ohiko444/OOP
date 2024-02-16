public class Amplifier {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public void on(){
        System.out.println(toString() + "усилитель включен");
    }

    public void off(){
        System.out.println(toString() + "усилитель выключен");
    }

    public void setCd(CdPlayer cdPlayer){
        this.cdPlayer = cdPlayer;
        System.out.println(toString() + "настройка усилителя CD-плеера");
    }

    public void setDvd(DvdPlayer dvdPlayer){
        this.dvdPlayer = dvdPlayer;
        System.out.println(toString() + "настройка усилителя DVD-плеера ");
    }

    public void setStereoSound(){
        System.out.println(toString() + "включен стерео звук");
    }

    public void setSurroundSound(){
        System.out.println(toString() + "включен усилитель объемного звучания (5 динамиков, 1 сабвуфер)");
    }

    public void setTuner(Tuner tuner){
        this.tuner = tuner;
        System.out.println(toString() + "настройка усилителя радио ");
    }

    public void setVolume(int n){
        System.out.println(toString() + "настройка громкости усилителя на " + n);
    }

    public String toString(){
        return "Top-O-Line ";
    }
}
