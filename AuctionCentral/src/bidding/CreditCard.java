package bidding;

/**
 * Class: CreditCard
 * 
 * Represents a credit card that a bidder will use to pay for a
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
	 * <dt><b> Precondition: Valid parameters are passed to 
	 * constructor. </b><dd>
	 * <dt><b> Postcondition: The CreditCard has been initialized 
	 * properly. </b><dd>
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
	 * Get the card number.
	 * 
	 * @return The card number.
	 */
	private final long getCardNum() {
		return myCardNum;
	}

	/**
	 * Get the card expiration date.
	 * 
	 * @return The expiration date.
	 */
	private final int getExpDate() {
		return myExpDate;
	}

	/**
	 * Get the CSC code.
	 * 
	 * @return The CSC code.
	 */
	private final int getCSC() {
		return myCSC;
	}

	/**
	 * Get the card holder name.
	 * 
	 * @return The card holder name.
	 */
	private final String getCardHolder() {
		return myCardHolder;
	}

	/**
	 * Get the card holder address.
	 * 
	 * @return The address.
	 */
	private final Address getAddress() {
		
		//TODO : return a defensive copy once Address is complete.
		return myAddress;
	}

	/**
	 * Get the bank.
	 * 
	 * @return The bank.
	 */
	private final String getBank() {
		return myBank;
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
		boolean isEqual = true;
		
		// Check for correct object type, and set flag to false if incorrect
		if (!(anObject instanceof CreditCard)) {
			isEqual = false;
		} else {
			
			// If object is a CreditCard, cast it to a CreditCard
			CreditCard other = (CreditCard)anObject;
		
			// Compare field by field for equality and set flag to false if
			// a field doesn't match
			if (!myCardHolder.equals(other.getCardHolder())) {
				isEqual = false;
			} else if (myCardNum != other.getCardNum()) {
				isEqual = false;
			} else if (myExpDate != other.getExpDate()) {
				isEqual = false;
			} else if (myCSC != other.getCSC()) {
				isEqual = false;
			} else if (!myAddress.equals(other.getAddress())) {
				isEqual = false;
			} else if (!myBank.equals(other.getBank())) {
				isEqual = false;
			}
		}
		
		return isEqual;
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
		sb.append("Cardholder: ");
		sb.append(myCardHolder);
		sb.append("\n");
		sb.append("Card Number: ");
		sb.append(myCardNum);
		sb.append("\n");
		sb.append("Expiration Date: ");
		sb.append(myExpDate);
		sb.append("\n");
		sb.append("CSC: ");
		sb.append(myCSC);
		sb.append("\n");
		sb.append("Address: ");
		
		//TODO : once Address toString() is implemented, use that here!
		sb.append("PLACEHOLDER ADDRESS");
		
		sb.append("\n");
		sb.append("Bank: ");
		sb.append(myBank);
		sb.append("\n");
		return sb.toString();
	}
}
