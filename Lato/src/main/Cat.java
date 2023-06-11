/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Igrar
 */
public class Cat {

    private String name;
    private String breed;
    private int age;

    private Cat(CatBuilder c) {
        this.name = c.name;
        this.breed = c.breed;
        this.age = c.age;
    }

    public static class CatBuilder {
        
        private String name;
        private String breed;
        private int age;
        
        public CatBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CatBuilder setBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public CatBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        
        public Cat build() {
            return new Cat(this);
        }   
        
    }
    
    @Override
    public String toString(){
        return "Name = "+this.name+", Breed = "+this.breed+", Age = "+this.age;
    }

}
