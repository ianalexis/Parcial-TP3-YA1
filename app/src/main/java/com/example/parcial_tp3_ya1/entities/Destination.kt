package com.example.parcial_tp3_ya1.entities

import android.os.Parcel
import android.os.Parcelable

class Destination(city: String?, country: String?, code: String?, image: String?, desc: String?, photos: Array<String>?, price: String? ) : Parcelable {

    var city : String?
    var country : String?
    var code : String?
    var image : String?
    var desc : String?
    var photos : Array<String>?
    var price : String?

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.createStringArray()!!,
        parcel.readString(),
    ) {
    }
    init {
        this.city = city
        this.country = country
        this.code = code
        this.image = image
        this.desc = desc
        this.photos = photos
        this.price = price


    }
    override fun toString(): String {
        return "PerritoModel(city='$city', country='$country', code='$code', image='$image', desc='$desc', photos='$photos', price='$price')"
    }
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(city)
        parcel.writeString(country)
        parcel.writeString(code)
        parcel.writeString(image)
        parcel.writeString(desc)
        parcel.writeStringArray(photos)
        parcel.writeString(price)
    }


    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Destination> {
        override fun createFromParcel(parcel: Parcel): Destination {
            return Destination(parcel)
        }

        override fun newArray(size: Int): Array<Destination?> {
            return arrayOfNulls(size)
        }
    }


}