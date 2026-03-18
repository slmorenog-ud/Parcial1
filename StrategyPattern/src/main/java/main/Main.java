package main;

import Recommendations.AvaliableTimeBased;
import Recommendations.MoodBased;
import Users.NormalUser;
import Users.User;

public class Main {
    public static void main(String[] args) {
        User usuario1 = new NormalUser();
        usuario1.name = "Pedro Pérez";
        
        usuario1.displayUInfo();
        usuario1.performRecommendation();
        
        System.out.println("Cambiar de tipo de recomendación:");
        
        usuario1.setRecommendation(new MoodBased());
        usuario1.performRecommendation();

        User usuario2 = new NormalUser();
        usuario2.name = "Isabella Piñeros";
        usuario2.displayUInfo();
        usuario2.performRecommendation();

        System.out.println("Cambiar de tipo de recomendación:");
        usuario2.setRecommendation(new AvaliableTimeBased());
        usuario2.performRecommendation();
    }    
}
