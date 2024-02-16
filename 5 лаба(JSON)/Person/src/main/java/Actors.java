import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Actors {
    private String name;
    private String address;
    private String birthday;
    private boolean crime;
    private int prisonterm;
    private String[] friends;

    public String toString(){
        return "Actors{" + "name = '" + name + '\'' +
                ", address = '" + address + '\'' +
                ", birthday = " + birthday + '\'' +
                ", crime = " + crime +
                ", prisonterm = " + prisonterm +
                ", friends = " + Arrays.toString(friends) +
                "}";
    }

    public int getPrisonterm() {return prisonterm;}
    public void setPrisonterm(int prisonterm) {this.prisonterm = prisonterm;}
    public String[] getFriends() {return friends;}
    public void setFriends(String[] friends) {this.friends = friends;}
    public boolean isCrime() {return crime;}
    public void setCrime(boolean crime) {this.crime = crime;}
    public String getBirthday() {return birthday;}
    public void setBirthday(String birthday) {this.birthday = birthday;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}
