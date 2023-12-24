package objects;

import enums.Gender;
import enums.Money;
import enums.Tense;
public class Kid extends Human{
    PiggyBank savedBank;
    public Kid(String name, Gender gender) {
        super(name, gender);
    }

    @Override
    public void get(Money money) {
        String add = "монету в " + money;
        System.out.println(makeSentence(this, "достать", Tense.PAST, add));
    }

    private void emptyPiggyBank(PiggyBank bank){
        System.out.println(makeSentence(this, "опустошить", Tense.FUTURE, bank.name));
    }
    public void becomeMotherTo(Human human, PiggyBank bank){
        savedBank = bank;
        String add = "матерью для " + human.name + "а";
        if (bank.isEmpty()){
            System.out.println(makeSentence(this, "стать", Tense.PAST, add));
        } else {
            System.out.println(makeSentence(this, "стать", Tense.FUTURE, add));
            System.out.print("Но для этого ");
            emptyPiggyBank(bank);
        }
    }

    public void becomeMotherTo(Human human){
        becomeMotherTo(human, savedBank);
    }
    public void a(){
        //void
    }

    public static void a(int a){

    }

    public void stoodConfused(){
        System.out.println(this.name + " стоял совершенно растерянный");
    }
}

