package objects;

import enums.Gender;
import enums.Money;
import interfaces.MoneyReceivable;

public class Human extends BaseObject implements MoneyReceivable {

    public Human(String name, Gender gender) {
        super(name, gender);
        {
            System.out.println("Персонаж " + this.name + " создан");
        }
    }

    @Override
    public void get(Money money){}

}
