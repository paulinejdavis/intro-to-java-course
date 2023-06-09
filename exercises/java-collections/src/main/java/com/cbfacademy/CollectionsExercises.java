package com.cbfacademy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Set;


public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        LinkedList<Integer> emptyLinkedList = new LinkedList<>();
        //  - add 4 as the first element of the list
        emptyLinkedList.addFirst(4);
        //  - then add 5, 6, 8, 2, 9 to the list
        emptyLinkedList.add(5);
        emptyLinkedList.add(6);
        emptyLinkedList.add(8);
        emptyLinkedList.add(2);
        emptyLinkedList.add(9);
        //  - add another 2 as the last element of the list
        emptyLinkedList.addLast(2);
        //  - add 4 as the 3rd element of the list
        emptyLinkedList.add(2, 4);
        //  - invoke the method element() on the list and print the result on the screen
        int firstElement = emptyLinkedList.getFirst();
        System.out.println("First Element: " + firstElement);
        //  - return the list
        System.out.println("Empty Linked List: " + emptyLinkedList);
        return emptyLinkedList;
    }
    public ArrayDeque<Integer> useArrayDeque() {
        ArrayDeque<Integer> example_queue = new ArrayDeque<>();
//  - add 5, 6, 8, 9 to the the stack
        example_queue.add(5);
        example_queue.add(6);
        example_queue.add(8);
        example_queue.add(9);

        System.out.println(example_queue.peek());

        System.out.println(example_queue.poll());
        System.out.println(example_queue.element());
        return example_queue;
    }

    public HashMap<Integer, String> useHashMap() {
//        // TODO: create an empty hash map
        HashMap<Integer, String> languages = new HashMap<>();
//        //  - add {1, TypeScript} entry to the map
        languages.put(1, "TypeScript");
//        //  - add {2, Kotlin} entry to the map
        languages.put(2, "Kotlin");
//        //  - add {3, Python} entry to the map
        languages.put(3, "Python");
//        //  - add {4, Java} entry to the map
        languages.put(4, "Java");
//        //  - add {5, JavaScript} entry to the map
        languages.put(5, "JavaScript");
//        //  - add {6, Rust} entry to the map
        languages.put(6, "Rust");

        System.out.println(languages.keySet());
        System.out.println(languages.toString());
        System.out.println(languages.containsValue("English"));

//        Set<Integer> keys = languages.keySet();
//        System.out.println("Keys: " + keys);
//
//        System.out.println("Hashmap: ");
//        //  - determine the set of keys from the map and print it on the screen
//        for (Integer key : keys) {
//            String value = languages.get(key);
//            System.out.println(key + ": " + value);
       // }
        //System.out.println(languages.size());
        // System.out.println(languages.get(key()));
//        //  - determine whether the map contains "English" as a language and print the result on the screen
        // boolean containsEng = languages.containsValue("English");
//       - return the map
        return languages;
//        throw new RuntimeException("Not implemented");
  }
        public static void main(String[] args){
            CollectionsExercises collectionsExercises = new CollectionsExercises();
            LinkedList<Integer> linkedList = collectionsExercises.useLinkedList();

            System.out.println("Linked List Elements:");
            for (Integer element : linkedList) {
                System.out.println(element);
            }

            ArrayDeque<Integer> arrayDeque = collectionsExercises.useArrayDeque();

            System.out.println("Array Deque Elements:");
            for (Integer element : arrayDeque) {
                System.out.println(element);
            }

            HashMap<Integer, String> hashMap = collectionsExercises.useHashMap();
            //System.out.println("HashMap:" + hashMap);

        }

}

//    public static void main(String[] args) {
//        CollectionsExercises collectionsExercises = new CollectionsExercises();
//        collectionsExercises.useLinkedList();


    //public Stack<Integer> useStack() {
    // TODO: create an empty stack
    //  - add 5, 6, 8, 9 to the the stack
    //  - print the first element of the stack on the screen
    //  - print the last element of the stack on the screen
    //  - invoke the method pop() on the stack and print the result on the screen
    //  - invoke the push(4) method on the stack
    //  - return the stack
    //throw new RuntimeException("Not implemented");

    //  - print the first element of the stack on the screen
    //  - print the last element of the stack on the screen
    //  - invoke the method pop() on the stack and print the result on the screen
    //  - invoke the push(4) method on the stack
    //  - return the stack
    //throw new RuntimeException("Not implemented");

    //}
//



//        // TODO: create an empty arrayDeque
//        //  - add 5, 6, 8, 9 to the the stack
//        //  - print the first element of the queue on the screen
//        //  - print the last element of the queue on the screen
//        //  - invoke the method poll() on the queue and print the result on the screen
//        //  - invoke the element() method on the queue and print the result on the screen
//        //  - return the queue
//        throw new RuntimeException("Not implemented");
//    }
//
//    public HashMap<Integer, String> useHashMap() {
//        // TODO: create an empty hash map
//        //  - add {1, TypeScript} entry to the map
//        //  - add {2, Kotlin} entry to the map
//        //  - add {3, Python} entry to the map
//        //  - add {4, Java} entry to the map
//        //  - add {5, JavaScript} entry to the map
//        //  - add {6, Rust} entry to the map
//        //  - determine the set of keys from the map and print it on the screen
//        //  - determine the set of keys from the map and print it on the screen
//        //  - determine whether the map contains "English" as a language and print the result on the screen
//        //  - return the map
//        throw new RuntimeException("Not implemented");
//    }

//    public String getName() {
//        return "Collections Exercises";
//    }
//}


        //Stack<Integer> stack = collectionsExercises.useStack();

        // Print the elements in the stack
//            while (!stack.isEmpty()) {
//                System.out.println(stack.pop());
