/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithmsca;

/**
 *
 * @author mncrf
 */



public class Patient implements Comparable<Patient> {
    private String name;
    private String bloodType; 
    private int priority;
    private String gpDetails;
    private int age;

    public Patient(String name,String bloodType, int priority, String gpDetails, int age) {
        this.name = name;
        this.bloodType = bloodType != null ? bloodType : "A+";
        this.priority = priority;
        this.gpDetails = gpDetails;
        this.age = age;
    }

    // For priority queue comparison
    @Override
    public int compareTo(Patient other) {
        if (this.priority != other.priority) {
            return other.priority - this.priority;// returns higher priority first
        }
        return other.age - this.age; // If priorities equal, older age first 
    }

    public int getPriorityValue() {
        return priority; // Return the priority value
    }

    @Override
    public String toString() {
        return name + " (Blood Type: " + bloodType +",Priority"+ priority+", Age: " + age + ")";
    }

    // Getters
    public String getName() { return name; }
    public String getGpDetails() { return gpDetails; }
    public int getAge() { return age; } 
    public String getBloodType() { return bloodType; } 
}
