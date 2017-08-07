package dependency_inversion;

public class ShoppingBasket {
	
	private Persistence persistence;
	private PaymentMethod paymentMethod;
	
	public ShoppingBasket(Persistence persistence,PaymentMethod paymentMethod){
		this.persistence=persistence;
		this.paymentMethod=paymentMethod;
	}
	
	public void buy(Shopping shopping){
		persistence.save(shopping);
		paymentMethod.pay(shopping);
	}
	
}
