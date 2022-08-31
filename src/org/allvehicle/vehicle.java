package org.allvehicle;

import org.Fourwheeler.Fourwheeler;
import org.Threewheeler.Threewheeler;
import org.Twowheeler.Twowheeler;

public class vehicle {
private void VehicleNecessary() {
	System.out.println("RIDING");

}

public static void main(String[] args) {
	vehicle m=new vehicle();
			m.VehicleNecessary();
			
			Twowheeler s=new Twowheeler();
			s.bike();
			s.cycle();
			
			
			Threewheeler a=new Threewheeler();
			a.AUTO();
			
			Fourwheeler v= new Fourwheeler();
			v.car();
			v.bus();
			v.lorry();
			
			
			
			
			
			
}


}
