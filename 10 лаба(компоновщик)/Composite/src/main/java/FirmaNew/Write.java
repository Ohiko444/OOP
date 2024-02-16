package FirmaNew;

public class Write {

    Component components;

    public Write(Component components){
        this.components = components;
    }

    public void printComponents(){
        components.print();
        System.out.println("-----------------------------------------");
        System.out.print("Список выполняемых работ:\n**");
        System.out.println(components.allPost());
        System.out.println("-----------------------------------------");
        System.out.print("Общая сумма ЗП = ");
        System.out.println(components.allSalary());
    }
}
