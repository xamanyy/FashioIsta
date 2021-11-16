package com.example.fashionista.Men;

public class Items {

    private String ImageUrl;
    private String ItemName;
    private String Company;

    Items()
    {

    }


    public Items(String imageUrl, String itemName,String Company) {
        ImageUrl = imageUrl;
        ItemName = itemName;
       this.Company = Company;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
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


}
