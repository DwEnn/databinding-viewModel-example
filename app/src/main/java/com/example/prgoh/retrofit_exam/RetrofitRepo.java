package com.example.prgoh.retrofit_exam;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by prgoh on 2017-09-08.
 */

public class RetrofitRepo implements Serializable {

    @SerializedName("data")
    List<Item> data;

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setBuyCount(String buyCount) {
//        this.buyCount = buyCount;
//    }
//
//    public void setIdx(String idx) {
//        this.idx = idx;
//    }
//
//    public void setImageUrl(String imageUrl) {
//        this.imageUrl = imageUrl;
//    }
//
//    public void setPrice(String price) {
//        this.price = price;
//    }
//
//    public void setShippingPrice(String shippingPrice) {
//        this.shippingPrice = shippingPrice;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getBuyCount() {
//        return buyCount;
//    }
//
//    public String getIdx() {
//        return idx;
//    }
//
//    public String getImageUrl() {
//        return imageUrl;
//    }
//
//    public String getPrice() {
//        return price;
//    }
//
//    public String getShippingPrice() {
//        return shippingPrice;
//    }

}
