package entities;
public abstract class taxPayer{
    public String name;
    Double anualRent;

    public taxPayer(){}

    public taxPayer(String name, Double anualRent){
        this.anualRent = anualRent;
        this.name = name;
    }

    public abstract Double tax();
}