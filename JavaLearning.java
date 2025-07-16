package edu.mrk.john.mobilestore;
import edu.mrk.john.mobilestore.models.Mobile;
import java.util.ArrayList;
import java.util.List;

public class JavaLearning {

	public static void main(String[] args) {
		System.out.println("Hello World");
		List<Mobile> mobiles = new ArrayList<>();
		mobiles.add(new Mobile(1L,"John","Redmi",25500.00));
		mobiles.add(new Mobile(2L,"Bala","Motorolo",29500.00));
		mobiles.add(new Mobile(3L,"Roshan","Samsung",65500.00));
		mobiles.add(new Mobile(4L,"Saraswathi","IPhone",85500.00));
		mobiles.add(new Mobile(5L,"Dhanalakshmi","Sony",45500.00));
		mobiles.add(new Mobile(6L,"Chandrika","Vivo",38000.00));
		
		mobiles.get(2).setOwner("Sri Vathsan");
		mobiles.remove(3);
		
		/*Mobile[] mobiles = new Mobile[5];
		mobiles[0] = new Mobile(1L,"John","Redmi",25500.00);
		mobiles[1] = new Mobile(2L,"Bala","Motorolo",29500.00);
		mobiles[2] = new Mobile(3L,"Roshan","Samsung",65500.00);
		mobiles[3] = new Mobile(4L,"Saraswathi","IPhone",85500.00);
		mobiles[4] = new Mobile(5L,"Dhanalakshmi","Sony",45500.00);
		*/
		//Mobile m1 = new Mobile(1L,"John","Redmi",25500.00);
		
		//m1.id=1L;
		/*m1.setId(1L);
		m1.setOwner("John");
		m1.setBrand("Redmi");
		m1.setPrice(25500.00);*/
		
		//Mobile m2 = new Mobile(2L,"Bala","IPhone",65500.00);
		/*m2.setId(2L);
		m2.setOwner("Bala");
		m2.setBrand("IPhone");
		m2.setPrice(65500.00);
		*/
		showHeading();
		for(int i=0;i<mobiles.size();i++) {
			showMobile(mobiles.get(i));
		}
		/*showMobile(mobiles[0]);
		showMobile(mobiles[1]);
		showMobile(mobiles[2]);
		showMobile(mobiles[3]);
		showMobile(mobiles[4]);*/
		
	}
	public static void showHeading() {
		System.out.println("Id -- Owner -- Brand -- Price");
	}
	public static void showMobile(Mobile mob) {
		System.out.println(mob.getId() + " -- " + 
							mob.getOwner() + " -- " + 
							mob.getBrand() + " -- " + 
							mob.getPrice());
	}
}
