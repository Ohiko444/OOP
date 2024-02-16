public class BlackSabbath {
    static Vocalist vocalist = new Vocalist("Оззи Осборн");
    static Guitarist guitarist = new Guitarist("Тони Айомми");
    static Bassist bassist = new Bassist("Гизер Батлер");
    static Drummer drummer = new Drummer("Билл Уорд");

    public static void playCoolSong(){
        guitarist.playCoolOpening();
        drummer.startPlaying();
        bassist.followTheDrums();
        guitarist.playCoolRiffs();
        vocalist.singCouplet(1);
        bassist.changeRhythm("припев");
        guitarist.playAnotherCoolRiffs();
        vocalist.singChorus();
        bassist.changeRhythm("куплет");
        guitarist.playCoolRiffs();
        vocalist.singCouplet(2);
        bassist.changeRhythm("припев");
        guitarist.playAnotherCoolRiffs();
        vocalist.singChorus();
        bassist.changeRhythm("куплет");
        guitarist.playIncrediblyCoolSolo();
        guitarist.playCoolRiffs();
        vocalist.singCouplet(3);
        bassist.changeRhythm("припев");
        guitarist.playAnotherCoolRiffs();
        vocalist.singChorus();
        bassist.changeRhythm("куплет");
        guitarist.playCoolRiffs();
        bassist.stopPlaying();
        drummer.stopPlaying();
        guitarist.playFinalAccord();
    }
}
