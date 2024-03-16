import java.util.Random;

public class FatFactory implements MacronutrientFactory{
    private Random rand = new Random();
    private String[] noRestriction = {"Avocado", "Sour Cream", "Tuna", "Peanuts"};
    private String[] paleo = {"Avocado", "Tuna", "Peanuts"};
    private String[] vegan = {"Avocado", "Peanuts"};
    private String[] nutAllergy = {"Avocado", "Sour Cream", "Tuna"};

    public String fatPlan(String diet) {
        if (diet == "no restriction") {
            return noRestriction[rand.nextInt(noRestriction.length)];
        }
        else if(diet == "paleo") {
            return paleo[rand.nextInt(paleo.length)];
        }
        else if(diet == "vegan") {
            return vegan[rand.nextInt(vegan.length)];
        }
        else if(diet == "nut allergy") {
            return nutAllergy[rand.nextInt(nutAllergy.length)];
        }
        else {
            return "No diet plan given";
        }
    }

    @Override
    public String carbPlan(String plan) {
        throw new UnsupportedOperationException("Unimplemented method 'carbPlan'");
    }

    @Override
    public String proteinPlan(String plan) {
        throw new UnsupportedOperationException("Unimplemented method 'proteinPlan'");
    }
}
