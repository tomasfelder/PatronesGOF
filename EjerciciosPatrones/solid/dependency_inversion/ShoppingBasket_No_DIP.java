package dependency_inversion;

public class ShoppingBasket_No_DIP {
	
	public void buy(Shopping shop){
		SqlDataBase_No_DIP db = new SqlDataBase_No_DIP();
		db.save(shop);
		
		CreditCard_No_DIP creditCard = new CreditCard_No_DIP();
		creditCard.pay(shop);
	}
	
}
