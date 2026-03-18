
package Users;

import Recommendations.HistorialBased;

public class NormalUser extends User{
    public NormalUser(){
        recommendation = new HistorialBased();
    }
    
    @Override
    public void displayUInfo(){
        System.out.println("Soy el usuario" + name );
    }
}