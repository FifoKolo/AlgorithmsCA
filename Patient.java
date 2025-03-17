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
    private String priority; // "urgent", "medium", "low"
    private String gpDetails;
    private int age;

    public Patient(String name, String priority, String gpDetails, int age) {
        this.name = name;
        this.priority = priority != null ? priority : "low"; // Default to "low" if null
        this.gpDetails = gpDetails;
        this.age = age;
    }

    // For priority queue comparison
    @Override
    public int compareTo(Patient other) {
        int thisPriority = getPriorityValue();
        int otherPriority = other.getPriorityValue();
        if (thisPriority != otherPriority) {
            return otherPriority - thisPriority; // Higher priority first (descending)
        }
        return other.age - this.age; // If priorities equal, older age first (descending)
    }

    public int getPriorityValue() {
        if (priority == null) return 0; // Safeguard against null
        switch (priority.toLowerCase()) {
            case "urgent": return 3;
            case "medium": return 2;
            case "low": return 1;
            default: return 0; // Unknown priority treated as lowest
        }
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ", Age: " + age + ")";
    }

    // Getters
    public String getName() { return name; }
    public String getGpDetails() { return gpDetails; }
    public int getAge() { return age; } // Added for completeness
    public String getPriority() { return priority; } // Added for completeness
}