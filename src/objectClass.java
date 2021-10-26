
public class objectClass {

    int age;
    String name;
    int yearlyIncome;

    public objectClass(int _age, String _name, int _yearlyIncome){
        age = _age;
        name = _name;
        yearlyIncome = _yearlyIncome;
    }

    public static void main(String[] args){

        //new code;
    }

    public int totalIncome(){
        return yearlyIncome * age;
    }

}
