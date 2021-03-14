package java_1.collections;

import java.util.*;

public class CollectionsChallenges {
    static Integer[] numbArr = {3,7,37,73};
    static List<String> stateList = Arrays.asList("Kansas", "Colorado", "Oklahoma", "Kansas");
    static ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(3,7,37,73));
    static LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("red","orange","yellow","green","blue","indigo","violet"));
    static ArrayList<String> names = new ArrayList<>(Arrays.asList("Smurf", "Malkovich", "Hodor", "Smurf", "Malkovich", "Hodor", "Pikachu"));

    public static void main(String[] args) {
//		Complete the code challenges for the following static methods
        findVal(2, numList);
        System.out.println(convertArrToList(numbArr));
        System.out.println(listToSet(stateList));
        System.out.println(addToList(307, numList));
        System.out.println(removeFromList(3, numList));
        System.out.println(insertIntoList(7, 0, numList));
        System.out.println(reverseNums(numList));
        System.out.println(reverseLinkedList(linkedList, true));
        System.out.println(reverseLinkedList(linkedList, false));
        System.out.println(removeDuplicates(names));
	}

	static int findVal(int val, ArrayList<Integer> arrList) {
//		find a value in the input array list.  return it if found.  If not, return 0.
        if(arrList.contains(val)) {
            return val;
        }

        else return 0;
    }
	static List convertArrToList(Object[] array) {
//		convert the array to a list and return it.
		return Arrays.asList(array);
	}

	static Set<String> listToSet(List<String> states) {
//		convert a list of US states to a set.  return the set.
		Set<String> setOfStates = new HashSet<>(states);
		return setOfStates;
	}

	static List<Integer> addToList(int x, ArrayList<Integer> numList) {
		// add the x input to the array list.  return the value if succcessfully added.

		if (numList.add(x)) {
			return numList;
		} else {
			return numList;
		}

	}

	static List<Integer> removeFromList(int x, ArrayList<Integer> numList) {
		// remove the input parameter value x from the numList.
		numList.removeIf(number -> number.equals(x));
		return numList;
	}

	static List<Integer> insertIntoList(int x, int i, ArrayList<Integer> numList) {
		// insert the the value x at index position i for the input numList.  If the index position is outside the bounds of the current numList, add it to the end of the array list.
        numList.add(i,x);

        return numList;
	}

	static List<Integer> reverseNums(ArrayList<Integer> nums) {
		/*
		reverse the values of the nums list
		return the reversed array list.
		*/

        Collections.reverse(nums);
		return nums;
	}

	static LinkedList<String> reverseLinkedList(LinkedList<String> linkedList, boolean mutate) {

/*		reverse the linked list.  If the mutate boolean is set to true, reverse a copy of the linked list without mutating the original list.  If mutate is false, reverse the original linkedList in place.
		example : ["red","orange","yellow","green","blue","indigo","violet"] => reverseLinkedList => [violet, indigo, blue, green, yellow, orange, red]
 */
		if(mutate) {
			LinkedList<String> listCopy = new LinkedList(linkedList);
			Collections.reverse(listCopy);
			return listCopy;
		}
		else {
			return linkedList;
		}
	}

	static ArrayList<String> removeDuplicates(ArrayList<String> names) {
//		remove duplicates from the list of name strings.  return a new array list with the unique elements.

        // Create a new ArrayList
        ArrayList<String> nameList = new ArrayList<>();

        // Traverse through the first list
        for (String name : names) {

            if (!nameList.contains(name)) {

                nameList.add(name);
            }
        }

        // return the new list

        return nameList;
	}

	static class Person {
		String name;
		int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", age=" + age +
					'}';
		}
	}

	//Optional
	static Queue<Person> covidVaccineQueue(Person[] people) {
//		There is an Array of people looking to get the COVID-19 vaccine.  The vaccines are administered on a first-come, first-serve basis.  Sequence the order of people by age.  The most elderly people get placed first in the queue, with the youngest getting placed last in the queue.  Return the Queue of folks waiting to be vaccinated.

		return null;
	}

}
