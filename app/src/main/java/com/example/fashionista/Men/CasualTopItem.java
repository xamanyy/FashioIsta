package com.example.fashionista.Men;

public class CasualTopItem {

    private String ImageUrl, ItemName, Stock;

    CasualTopItem() {

    }

    public CasualTopItem(String imageUrl, String itemName, String stock) {
        ImageUrl = imageUrl;
        ItemName = itemName;
        Stock = stock;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

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

