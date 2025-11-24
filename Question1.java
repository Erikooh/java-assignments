// Question 1: Vacation Package Total Cost
// Author: Erick
// Date: Nov 24, 2025

public class Question1 {
    
    // Method to calculate total cost
    public static double calculateTotalCost(double accommodationCost, double mealCost, double activityCost) {
        return accommodationCost + mealCost + activityCost;
    }

    public static void main(String[] args) {
        // Sample data
        double accommodation = 800.50;
        double meals = 400.25;
        double activities = 250.00;

        // Call the method
        double totalCost = calculateTotalCost(accommodation, meals, activities);

        // Display result
        System.out.println("Total Vacation Cost: $" + totalCost);
    }
}
