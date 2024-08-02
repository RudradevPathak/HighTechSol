import java.util.List;
import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {
        System.out.println("main");
        List<Person> personList = Person.createList();
        // System.out.println(personList);
        //ageBased(personList, 13);
        //printCheckedPerson(personList, new ImplementCheckPerson());
        //printCheckedPerson(personList, p -> p.age < 20 && p.gender==Person.sex.MALE);
        printCheckedPersonWithPredicates(personList, p -> p.age < 21 && p.gender == Person.sex.MALE);
       /* System.out.println(personList.stream().max(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        }));*/
//System.out.println(personList.stream().map(person1 -> person1));

    }

    public static void ageBased(List<Person> persons,Integer age){

        for (Person persons1 : persons){
            if(persons1.getAge() < age){
               // System.out.println("age: "+persons1);
            }
            break;
        }
    }
    @FunctionalInterface
     interface  CheckPerson{
        boolean checkPersonLogic(Person p);
    }

   /* static  class ImplementCheckPerson implements  CheckPerson{
        @Override
        public boolean checkPersonLogic(Person p) {
           // System.out.println("checkPerson"+p);
            return  p.gender == Person.sex.FEMALE && p.age > 15;
        }
    }*/

    public static void printCheckedPerson(List<Person> personList, CheckPerson checkPerson){
         for (Person p : personList){
            if(checkPerson.checkPersonLogic(p)){
                p.printPerson();
            }
         }
    }

    public static void printCheckedPersonWithPredicates(List<Person> personList, Predicate<Person> checkPerson){
        for (Person p : personList){
            if(checkPerson.test(p)){
                p.printPerson();
            }
        }
    }
}


