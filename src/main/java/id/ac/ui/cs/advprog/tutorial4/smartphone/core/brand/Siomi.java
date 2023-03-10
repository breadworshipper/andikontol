package id.ac.ui.cs.advprog.tutorial4.smartphone.core.brand;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.factory.SmartPhoneFactory;

public class Siomi extends SmartPhone{
    private SmartPhoneFactory smartPhoneFactory;

    public Siomi(SmartPhoneFactory smartPhoneFactory){
        this.smartPhoneFactory = smartPhoneFactory;
        setName("Siomi");
    }

    // TODO: Complete this method
    public void create(){
        setRAM(smartPhoneFactory.addRAM());
        setProcessor(smartPhoneFactory.addProcessor());
        setScreen(smartPhoneFactory.addScreen());
        System.out.println("Creating smartphone " + getName());
    }

    // TODO: Complete this method
    public void calculatePrice(){
        setPrice(1.5 * getProcessor().getPrice() + 2 * getRAM().getPrice() + getScreen().getPrice());
        System.out.println("Calculating price for " + getName());
    }
}