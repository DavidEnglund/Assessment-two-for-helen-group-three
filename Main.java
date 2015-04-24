/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assesment2group3;

import java.util.Random;

/**
 *
 * @author David
 */
public class Assesment2group3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Vehicle v = new Vehicle("Ford", "T812", 2014);

		v.printDetails();
		
		// Vehicle sample distance
		for (int i = 0; i < 10; i++) {
			v.addKilometers(new Random().nextInt(100));
                        v.addFuel(new Random().nextDouble()*10, 1.3);
		}
		
		System.out.println("\n\n");
		v.addService();
		v.printDetails();
                
                System.out.println("\n\n");
                
                v.rentPerDay(14);
	}
    
}
