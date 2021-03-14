package java_2.oop.monkey;

import java.util.ArrayList;
import java.util.List;

class MonkeyCage {

    public MonkeyCage() {

    }

    private List<Monkey> monkeys = new ArrayList<>();

    public List<Monkey> getMonkeys() {
        return monkeys;
    }


    boolean areMonkeysSmiling() {
        //We have an array of monkeys.  Each Monkey has a boolean smile property, which indicates if that particular monkey is smiling.  Determine whether or not the majority of monkeys are smiling.  If the majority are smiling, return true.  if the majority are not smiling, return false.  If it is a tie, return true.
        int smilingsMonkeys = 0;
        int sadMonkeys = 0;
        for (Monkey monkey : monkeys) {
            if (monkey.smiling) {
                smilingsMonkeys++;
            } else {
                sadMonkeys++;
            }
        }
        if (smilingsMonkeys > sadMonkeys) {
            System.out.println("The monkeys are happy");
            return true;
        } else {

            System.out.println("The monkeys are happy");
            return false;
        }
    }

    void addMonkey(Monkey monkey) {
//        add a new monkey to the MonkeyCage
        monkeys.add(monkey);
    }

    void removeMonkey(Monkey monkey) {
//        remove a monkey from the MonkeyCage
        monkeys.remove(monkey);
    }

    class Monkey { //inner class.  DO NOT MOVE THIS CLASS
        String name;
        boolean smiling;

        public Monkey(String name, boolean smiling) {
            this.name = name;
            this.smiling = smiling;
        }
    }
}