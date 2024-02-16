package OCP;

public class Report extends Salary{

    @Override
    public void process(Master master){
        beforeProcessing();
        super.process(master);
        afterProcessing();
    }

    private void beforeProcessing() {
        System.out.println("Отчёт ЗП мастера:");
    }

    private void afterProcessing(){
        System.out.println("Всего мастера заработали = ");
    }

}
