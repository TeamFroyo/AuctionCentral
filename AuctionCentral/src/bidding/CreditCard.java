package bidding;

/**
 * Class: CreditCard
 * 
 * Represent a credit card that a bidder will use to pay for a
 * bid that they win.
 * 
 * @author Keith Lueneburg
 *
 */
public final class CreditCard {
	/**
	 * The 16 digit card number.
	 */
	private long myCardNum;
	
	/**
	 * Card expiration date.
	 */
	private int myExpDate;
	
	/**
	 * The 3 digit card security code.
	 */
	private int myCSC;
	
	/**
	 * The name of the card holder.
	 */
	private String myCardHolder;	
	
	/**
	 * The card holder's address.
	 */
	private Address myAddress;
	
	/**
	 * The bank this card belongs to.
	 */
	private String myBank;	
		
	public boolean equals(Object anObject) {
		
		return false;
	}
	
	public String toString() {
		
		return "";
	}
}
