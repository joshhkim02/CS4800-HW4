import java.util.Random;

public class ProteinFactory implements MacronutrientFactory{
    private Random rand = new Random();
    private String[] noRestriction = {"Fish", "Chicken", "Beef", "Tofu"};
    private String[] paleo = {"Fish", "Chicken", "Beef"};
    private String[] vegan = {"Tofu"};
    private String[] nutAllergy = {"Fish", "Chicken", "Beef", "Tofu"};

    public String proteinPlan(String diet) {
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
    public String fatPlan(String plan) {
        throw new UnsupportedOperationException("Unimplemented method 'fatPlan'");
    }

}
