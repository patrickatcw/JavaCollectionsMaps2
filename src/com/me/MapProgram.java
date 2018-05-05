package com.me;

//starting off with javacollectionsmap

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    //run our code from here
    public static void main(String[] args) {

        //map object
        //<String, String> = key, value
        Map<String, String> languages = new HashMap<>();
        //added
        if(languages.containsKey("Java")) {
            System.out.println("Java already exists");
        }else {
            languages.put("Java", "a compiled high level, object-orientated, " +
                    "platform independent language");
            System.out.println("Java added successfully");
            System.out.println("#########################################");
        }
        languages.put("Java", "a compiled high level, object-orientated, " +
                "platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming " +
                "language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Thererin lies MADNESS!!"));

        //run
        System.out.println(languages.get("Java"));
        System.out.println("-----------------------------------------------------------");

        //demonstrate value being overwritten
        languages.put("Java", "this is a Java course!");
        System.out.println(languages.get("Java"));

        System.out.println("-----------------------------------------------------------");

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        }else{
            languages.put("Java", "this is a Java course");
        }

        System.out.println("==================================================================");

        //step 1 removing a key
        languages.remove("Lisp");

        //and we can remove a key if it is mapped to a certain value
        if(languages.remove("Algol", "an algorithmic language")) {
            System.out.println("Algol removed");
        }else{
            System.out.println("Algol not removed, key/value pair not found");
            //run
            /*
            Algol removed
            Java : this is a Java course!
            BASIC : Beginners All Purpose Symbolic Instruction Code
            Python : an interpreted, object-oriented, high-level programming language with dynamic semantics
            */
        }


        //keyset, prints entire keyset
        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

    }

}
