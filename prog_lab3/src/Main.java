import enums.Gender;
import objects.*;
import objects.PiggyBank;

public class Main {
    public static void main(String[] args) {
        Place kitchen = new Place("Кухня", Gender.FEMALE);
        Place bookshelf = new Place("Книжная полка", Gender.FEMALE);
        Place desk = new Place("Стол", Gender.MALE);
        Knife knife = new Knife("Нож", kitchen);
        String [] piggyBankProperties = new String[]{"прекрасная", "тяжелая"};
        PiggyBank piggyBank = new PiggyBank("Копилка", Gender.FEMALE,
                bookshelf, desk, piggyBankProperties);

        Karlson carlson = new Karlson("Карлсон", Gender.MALE);
        Kid malish = new Kid("Малыш", Gender.MALE);
        carlson.lookAtWithHope(malish);
        malish.stoodConfused();

        malish.becomeMotherTo(carlson, piggyBank);
        System.out.println(piggyBank);
        knife.moveTo(malish, bookshelf);
        piggyBank.open(malish, knife);
        piggyBank.makeEmpty(malish, carlson);
        malish.becomeMotherTo(carlson);

        int t = TestClass.staticMethod(2, 3);
        System.out.println(malish);
    }
}