package bidding;

/**
 * Class: CreditCard
 * 
 * Represent a credit card that a bidder will use to pay for a
 * item that they win the bidding for.
 * 
 * TCSS 360 - Software Development and Quality Assurance
 * University of Washington, Tacoma
 * Winter 2014
 * Instructor: Dr. Adwoa Donyina
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
		
	/**
	 * Create a new CreditCard object.
	 * <p>
	 * <dt><b> Precondition: We need a CreditCard object created. </b><dd>
	 * <dt><b> Postcondition: The CreditCard has been initialized 
	 * properly </b><dd>
	 * 
	 * @param aCardNum The card number.
	 * @param anExpDate The expiration date.
	 * @param aCSC The CSC code.
	 * @param aCardHolder The card holder.
	 * @param anAddress The card holder's address.
	 * @param aBank The bank the card belongs to.
	 * 
	 * @return The CreditCard object.
	 */
	public CreditCard(long aCardNum, int anExpDate, int aCSC,
			String aCardHolder, Address anAddress, String aBank){
		myCardNum = aCardNum;
		myExpDate = anExpDate;
		myCSC = aCSC;
		myCardHolder = aCardHolder;
		myAddress = anAddress;
		myBank = aBank;
	}
	
	/**
	 * Check to see if this CreditCard matches another CreditCard.
	 * <p>
	 * <dt><b> Precondition: CreditCard has been initialized. </b><dd>
	 * <dt><b> Postcondition: The CreditCard has not been changed. </b><dd>
	 * 
	 * @param anObject The object to compare this CreditCard with.
	 * 
	 * @return True if the other object is also a CreditCard, and it represents
	 * the same card as the card we are checking.
	 */
	@Override
	public boolean equals(Object anObject) {
		
		return false;
	}
	
	/**
	 * Get a String representation of the CreditCard.
	 * <p>
	 * <dt><b> Precondition: CreditCard has been initialized. </b><dd>
	 * <dt><b> Postcondition: The CreditCard has not been changed. </b><dd>
	 * 
	 * @return A string representation of the card.
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("");
		return "";
	}
}
