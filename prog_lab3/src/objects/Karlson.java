package objects;

import enums.Gender;
import enums.Money;
import enums.Tense;

public class Karlson extends Human{

    public Karlson(String name, Gender gender) {
        super(name, gender);
    }

    @Override
    public void get(Money money) {
        String add = "монету в " + money;
        System.out.println(makeSentence(this, "достать", Tense.PAST, add));
        String s = " ликует";
        if (money == Money.FIVE){
            s += " и порадован больше всего";
        }
        System.out.println(this.name + s);
    }

    public void lookAtWithHope(Human human){
        String add = " на " + human.name + "а" + " с надеждой";
        System.out.println(makeSentence(this, "посмотреть", Tense.PAST, add));
    }


}
