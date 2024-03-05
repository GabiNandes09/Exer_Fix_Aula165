package entities;
public class individual extends taxPayer{
    Double healthExpenditures;

    public individual(){
        super();
    }
    public individual (String name, Double anualRent, Double healthExpenditures){
        super(name, anualRent);
        this.healthExpenditures = healthExpenditures;        
    }

    @Override
    public Double tax (){
        Double totalTax;
        if (anualRent<20000) {
            totalTax = anualRent*0.15;
        } else {
            totalTax = anualRent*0.25;
        }
        if (healthExpenditures>0) {
            totalTax-= healthExpenditures*0.5;
        }
        return totalTax;
    }
}