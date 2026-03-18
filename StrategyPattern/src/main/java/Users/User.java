package Users;
import Recommendations.Recommendation;

public abstract class User {
    
    Recommendation recommendation;
    public String name;
    
    public void setRecommendation (Recommendation reco){
        this.recommendation = reco;
    }
    
    public void displayUInfo(){
        System.out.println("Soy el usuario " + name);
    }

    public void performRecommendation(){
        recommendation.recommend();
    }
}