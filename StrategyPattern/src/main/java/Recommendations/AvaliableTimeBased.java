package Recommendations;

public class AvaliableTimeBased implements Recommendation{
    
    @Override
    public void recommend(){
        System.out.println("Recomendación basada en el tiempo disponible.");
    }
}