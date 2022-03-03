package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //TreeSet<Student> names = new TreeSet<Student>((a,b) ->a.getName().compareTo(b.getName()));
        TreeSet<Student> names = new TreeSet<Student>();
       names.add(new Student("Astan","Serikov"));
       names.add(new Student("Asel","Alybaeva"));
       names.add(new Student("Asel","Alybaeva2"));
       names.add(new Student("Adilet","Torobaev"));
       names.add(new Student("Kira ","Test"));
       names.add(new Student("Zenitsu","Zenli"));
       names.add(new Student("Jordan","Michael"));


        for(Student st:names){
            System.out.println(st.name + " "+st.surname);
        }












    }
}
