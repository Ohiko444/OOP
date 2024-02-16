import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Person {

    private String name;
    private String address;
    private String birthday;
    private Boolean crime;
    private int prisonterm;

    Person(){}

    public Person(String name, String address, String birthday, Boolean crime, int prisonterm){
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.crime = crime;
        this.prisonterm = prisonterm;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getPrisonterm() {return prisonterm;}
    public void setPrisonterm(int prisonterm) {this.prisonterm = prisonterm;}
    public Boolean getCrime() {return crime;}
    public void setCrime(Boolean crime) {this.crime = crime;}
    public String getBirthday() {return birthday;}
    public void setBirthday(String birthday) {this.birthday = birthday;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public String toString(){
        return "Person{" +
                "name = '" + name + '\'' +
                ", address = '" + address + '\'' +
                ", birthday = " + birthday + '\'' +
                ", crime = " + crime +
                ", prisonterm = " + prisonterm +
                '}';
    }
}

