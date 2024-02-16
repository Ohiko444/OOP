package Worker;

//внутренний статический класс
public class Worker {

    public final int serviceNumber;
    public final String FIO;
    private int salary;
    private String position;
    private String category;
    private int healthGroup;
    private String departmentName;
    private String projectName;

    private Worker(Builder builder) {
        serviceNumber = builder.serviceNumber;
        FIO = builder.FIO;
        salary = builder.salary;
        position = builder.position;
        category = builder.category;
        healthGroup = builder.healthGroup;
        departmentName = builder.departmentName;
        projectName = builder.projectName;
    }

    public static class Builder {

        private final int serviceNumber;
        private final String FIO;
        private int salary;
        private String position;
        private String category;
        private int healthGroup = 1;
        private String departmentName;
        private String projectName;


        public Builder(int serviceNumber, String FIO) {
            this.serviceNumber = serviceNumber;
            this.FIO = FIO;
        }

        public Builder makeSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder makePosition(String position) {
            this.position = position;
            return this;
        }
        public Builder makeCategory(String category) {
            this.category = category;
            return this;
        }
        public Builder makeHealthGroup(int healthGroup) {
            this.healthGroup = healthGroup;
            return this;
        }
        public Builder makeDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public Builder makeProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        public Worker build() {
            return new Worker(this);
        }

    }

    @Override
    public String toString() {
        String result = "табельный номер: " + serviceNumber + "\n" + "ФИО: " + FIO + "\n" + "группа здоровья/инвалидность: " + healthGroup + "\n";
        if (salary != 0){
            result += "зарплата: " + salary + "\n";
        }
        if (position != null){
            result += "должность: " + position + "\n";
        }
        if (category != null){
            result += "категория: " + category + "\n";
        }
        if (departmentName != null){
            result += "название отдела: " + departmentName + "\n";
        }
        if (projectName != null){
            result += "название проекта: " + projectName + "\n";
        }
        return result;
    }
}
