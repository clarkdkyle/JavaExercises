package java_1.dataTypes;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

class Arrays {
    static int[] nums = new int[]{10,23,3,4,5,2,1};
    static String[] greetings = new String[]{"Hello","Howdy","Hallo","Hola","Bonjour","Ciao","أهلا و سهلا"};
    static int[] bits = new int[]{0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};
    static String[] colors = new String[]{"bluebird","yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","Matterhorn","Great White Lakes","torah","white bible","green quran", "red herring", "Black Sea"};

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(bitsToBinaries()));
        printNums();
        greet("Wally West");
        System.out.println(keepColors());
    }


    static void printNums() {
//        Programmatically print the nums array to the console.  Print each number on a new line.  The nums array is defined on this class.
        for (int n : nums) {
            System.out.println(n);
        }
    }

    static void greet(String name) {
//        Randomly greet the person with a random greeting found in the greetings array.
//        For every greeting in the greetings array :
/*        ex : craig => greet() => "Hello Craig"
               "ABRAM" => greet() => "Hola Abram"
               "maTT => greet() => "أهلا و سهلا Matt"
 */          int rnd = new Random().nextInt(greetings.length);
                System.out.println(greetings[rnd] + " " + name );
    }

    static boolean[] bitsToBinaries() {
//        Programmatically convert the bit array of 1's and 0's into a binary array of true and false. return the 'converted' array.
//        ex : bitsToBinaries() => [false,true,true,true,false,false,false,true,true,true,true,true,false,true,false,false,true,false]
        boolean[] bool = new boolean[bits.length];
        for (int b = 0; b < bits.length; b++) {
            bool[b] = bits[b] != 0;
        }
        return bool;
    }

    static List<String> keepColors() {
//        In this class is an array called "colors".  Programmatically remove the elements that do NOT have a color associated with it.  Return the filtered color array of elements that have a color associated with it.
//        ex : keepColors() => ["bluebird","yellow bumblebee","black spider", "green monkey","pink","black bird","Great White Lakes","white bible","green quran", "red herring", "Black Sea"]
        List<String> list = java.util.Arrays.asList(colors);
        return list.stream()
                .filter (color -> color.toLowerCase().contains("blue") || color.toLowerCase().contains("yellow") || color.toLowerCase().contains("black") || color.toLowerCase().contains("green") || color.toLowerCase().contains("pink") || color.toLowerCase().contains("white") || color.toLowerCase().contains("red"))
                .collect(Collectors.toList());
    }
}






