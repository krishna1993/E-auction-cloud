package com.example.model;

public class User {

    private String name;
    private int  productId;
	    private Long sellerId;
	    private String productName;
	    private String shortDescription;
	    private String detailedDescription;
	    private String category;
	    private float startingPrice;
	    private String bidEndDate;

    public User() {
    }

    public User(int productId, Long sellerId, String productName, String shortDescription,
				String detailedDescription, String category, float startingPrice, String bidEndDate) {
			super();
			this.productId = productId;
			this.sellerId = sellerId;
			this.productName = productName;
			this.shortDescription = shortDescription;
			this.detailedDescription = detailedDescription;
			this.category = category;
			this.startingPrice = startingPrice;
			this.bidEndDate = bidEndDate;
		}

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * @return Long return the sellerId
     */
    public Long getSellerId() {
        return sellerId;
    }

    /**
     * @param sellerId the sellerId to set
     */
    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * @return String return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return String return the shortDescription
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * @param shortDescription the shortDescription to set
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * @return String return the detailedDescription
     */
    public String getDetailedDescription() {
        return detailedDescription;
    }

    /**
     * @param detailedDescription the detailedDescription to set
     */
    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    /**
     * @return String return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return float return the startingPrice
     */
    public float getStartingPrice() {
        return startingPrice;
    }

    /**
     * @param startingPrice the startingPrice to set
     */
    public void setStartingPrice(float startingPrice) {
        this.startingPrice = startingPrice;
    }

    /**
     * @return String return the bidEndDate
     */
    public String getBidEndDate() {
        return bidEndDate;
    }

    /**
     * @param bidEndDate the bidEndDate to set
     */
    public void setBidEndDate(String bidEndDate) {
        this.bidEndDate = bidEndDate;
    }

}
