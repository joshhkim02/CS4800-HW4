public class Main {
    public static void main(String[] args) {
        // Singleton Design Implementation
        MacronutrientFactory carbsFactory = new CarbFactory();
        MacronutrientFactory proteinFactory = new ProteinFactory();
        MacronutrientFactory fatsFactory = new FatFactory();

        Customer[] customers = new Customer[] {
            new Customer("Josh", "no restriction"),
            new Customer("Jenny", "paleo"),
            new Customer("Gordon", "vegan"),
            new Customer("David", "nut allergy"),
            new Customer("Max", "no restriction"),
            new Customer("Sam", "no restriction")};

        for (Customer customer : customers) {
            String carbs = carbsFactory.carbPlan(customer.getDietPlan());
            String protein = proteinFactory.proteinPlan(customer.getDietPlan());
            String fats = fatsFactory.fatPlan(customer.getDietPlan());

            System.out.println(customer.getName() + "'s meal plan - " + customer.getDietPlan() + ":");
            System.out.println("Carbs: " + carbs);
            System.out.println("Protein: " + protein);
            System.out.println("Fats: " + fats + "\n");
        }
    }
}