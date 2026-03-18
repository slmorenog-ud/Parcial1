package Recommendations;

public class MoodBased implements Recommendation{

    @Override
    public void recommend() {
        System.out.println("Recomendación basada en el estado de ánimo");
    }
}
