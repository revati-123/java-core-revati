

import com.revati.child.Laptop;
import com.revati.child.Television;
public class MainApp {

	public static void main(String[] args) 
	{
		Television t1 = new Television("Samsung 32 Inches", 17000.00f);
		t1.show();
		
		Laptop x = new Laptop ("Asus", 4000.00f);
		x.show();
		

	}

}
