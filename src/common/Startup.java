/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author tmorales3
 */
public class Startup {
    public static void main(String[] args) {
        List nonGenericsList = new ArrayList();
        List<Employee> genericsList = new ArrayList<>();
        Employee e1 = new Employee("Jones", "Mike", "123-45-6789");
        Employee e2 = new Employee("Smith", "Larry", "124-45-6789");
        Employee e3 = new Employee("Doe", "Charles", "125-45-6789");
        Employee e4 = new Employee("Johnson", "Robert", "126-45-6789");
        nonGenericsList.add(e1);
        nonGenericsList.add(e2);
        nonGenericsList.add(e3);
        nonGenericsList.add(e4);
        
        
        System.out.println("\nNon Generics List");
        for(Object o : nonGenericsList){
            Employee e = (Employee)o;
            genericsList.add(e);
            System.out.println(e);
        }
        
        System.out.println("\nGenerics List");
        for(Employee e : genericsList)
        {
            Employee emp = e;
            System.out.println(emp);
        }
        
        System.out.println();
        
        Dog d1 = new Dog("Fido", 1234);
        Dog d2 = new Dog("Finn", 1235);
        Dog d3 = new Dog("Rango", 1236);
        Dog d4 = new Dog("Remmy", 1237);
        Dog d5 = new Dog("Finn", 1235);
        
        List<Dog> dogList = new ArrayList<>();
        Set<Dog> dogSet = new HashSet<>();
        
        dogList.add(d1);
        dogList.add(d2);
        dogList.add(d3);
        dogList.add(d4);
        dogList.add(d5);
        
        dogSet.addAll(dogList);
        
        
        System.out.println("\nDog List Contents");
        for(Dog d : dogList){
            System.out.println(d);
        }
        
        System.out.println("\nDog Set Contents");
        for (Dog d: dogSet){
            System.out.println(d);
        }
    }
}
