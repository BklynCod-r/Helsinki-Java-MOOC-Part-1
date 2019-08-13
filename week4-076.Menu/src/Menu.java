
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal(String meal) {
        // Go thru list to make sure entered meal is not 
        // in there already
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }
    
    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }
    
    public void clearMenu() {
        meals.clear();
    }
}


//for (String addedMeal : this.meals) {
//            
//            System.out.println(this.meals);
//            if (meals.contains(meal)) {
//                meals.remove(meal);
//            } else {
//                break;
//            }
//        } 

//int size = meals.size();
//        
//        System.out.println(size);
//        
//        while (size > 0) {            
//            System.out.println(meals.indexOf(size));
//            size--;
//        }

