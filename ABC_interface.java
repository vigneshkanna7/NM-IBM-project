package core.oops;

//public class ABC extends CMDA
public class ABC extends TestAbstract implements CMDA_1
{
	
   public void kitchen() {
	   System.out.println("kitchen finished");
   }

@Override
public void room() {
      System.out.println("room finished ...");	
}

@Override
public void hall() {
 
	 System.out.println("hall finished ");
}

@Override
public void restRoom() {
	System.out.println("finished rest room ...");
	
}

@Override
public void hall2() {
	// TODO Auto-generated method stub
	
}

   
   
}
