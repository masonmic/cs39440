package stock_trader;

import java.util.ArrayList;

public class Main {

	static ArrayList<Float> myHistory = new ArrayList<>();
	
	public static void main(String [ ] args)
	
	{
    
    for(int i=1; i<11; i++){
	Stock test = new Stock();
    myHistory.add((float) test.getHigh());
    
    
    
    System.out.println("" + test.getRating());
    System.out.println(myHistory);
    
	}
	}

}
