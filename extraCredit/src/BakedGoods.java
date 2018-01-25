public class BakedGoods {

	private int cakeQuantity;
	private int cookieQuantity;
	private int pieQuantity;
	
	private int cakePrice = 3;
	private int cookiePrice = 1;
	private int piePrice = 2;
	
	public BakedGoods(){
	}
	
	public int getCakePrice(){
		return cakePrice;
	}
	
	public int getCookiePrice(){
		return cookiePrice;
	}
	
	public int getPiePrice(){
		return piePrice;
	}
	
	public void setCakeQuantity(int cakeQuantity) {
        this.cakeQuantity = cakeQuantity;
    }

    public int getCakeQuantity() {
        return cakeQuantity;
    }
    
    public void setCookieQuantity(int cookieQuantity) {
        this.cookieQuantity = cookieQuantity;
    }

    public int getCookieQuantity() {
        return cookieQuantity;
    }
    
    public void setPieQuantity(int pieQuantity) {
        this.pieQuantity = pieQuantity;
    }

    public int getPieQuantity() {
        return pieQuantity;
    }
    
    public int Total(){
    	int total = cakeQuantity*cakePrice + cookieQuantity*cookiePrice + pieQuantity*piePrice;
    	return total;
    }
    
    public String Order(){
		return "Your order:" + "\n"
				+"Pieces of cake: " + cakeQuantity + " = " + "$" + cakeQuantity*cakePrice + "\n"
				+"Number of cookies: " + cookieQuantity + " = " + "$" + cookieQuantity*cookiePrice + "\n"
				+ "Slices of pie: " + pieQuantity + " = " + "$" + pieQuantity*piePrice + "\n"
				+ "\n"
				+ "Your total is: " + "$" + Total();
	}
}
