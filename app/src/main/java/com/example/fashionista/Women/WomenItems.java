package com.example.fashionista.Women;

public class WomenItems {
    private String ImageUrl, ItemName, Stock, Rating;

    public WomenItems() {

    }

    public WomenItems(String imageUrl, String itemName, String stock, String rating) {
        ImageUrl = imageUrl;
        ItemName = itemName;
        Stock = stock;
        Rating = rating;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public void setStock(String stock) {
        Stock = stock;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public String getItemName() {
        return ItemName;
    }

    public String getStock() {
        return Stock;
    }

    public String getRating() {
        return Rating;
    }
}
