package com.example.prgoh.retrofit_exam;

import com.google.gson.annotations.SerializedName;

/**
 * Created by prgoh on 2017-09-08.
 */

public class Item {

    @SerializedName("idx")
    String idx;
    @SerializedName("name")
    String name;
    @SerializedName("price")
    String price;
    @SerializedName("imageUrl")
    String imageUrl;
    @SerializedName("shippingPrice")
    String shippingPrice;
    @SerializedName("buyCount")
    String buyCount;
}
