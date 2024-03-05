package entities;
public class company extends taxPayer {
    Integer employeesQuantity;
    public company(){
        super();
    }
    public company(String name, Double anualRent, Integer employeesQuantity){
        super(name, anualRent);
        this.employeesQuantity = employeesQuantity;
    }

    @Override
    public Double tax(){
        Double totalTax;
        if (employeesQuantity<=10) {
            totalTax = anualRent*0.16;
        } else {
            totalTax = anualRent*0.14;
        }
        return totalTax;
    }
    
}