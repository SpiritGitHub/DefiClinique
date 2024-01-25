package com.defitech.DefiClinique.model;


import jakarta.persistence.*;

    @Entity
    public class Patient {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column
        private Long id;
        private String firstName;
        private String lastName;
        private int age;
        private String gender;

        private boolean traitementspecifique;



        public Patient() {
        }



        public Patient(String firstName, String lastName, int age, String gender, boolean traitementspecifique) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.gender = gender;
            this.traitementspecifique = traitementspecifique;

        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }

    public boolean isTraitementspecifique() {
        return traitementspecifique;
    }

    public void setTraitementspecifique(boolean traitementspecifique) {
        this.traitementspecifique = traitementspecifique;
    }
}
