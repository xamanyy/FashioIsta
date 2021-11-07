package com.example.fashionista.Men;

public class Items {

    private String ImageUrl, ItemName, Stock;
    Items() {

    }

    public Items(String imageUrl, String itemName, String stock, String rating) {
        ImageUrl = imageUrl;
        ItemName = itemName;
        Stock = stock;
//        Rating = rating;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

//    public String getRating() {
//        return Rating;
//    }

//    public void setRating(String rating) {
//        Rating = rating;
//    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String stock) {
        Stock = stock;
    }
}
