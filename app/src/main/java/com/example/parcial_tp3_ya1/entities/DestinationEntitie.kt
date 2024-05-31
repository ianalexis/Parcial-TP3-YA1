package com.example.parcial_tp3_ya1.entities

import android.os.Parcel
import android.os.Parcelable

class DestinationEntitie(city: String?, country: String?, code: String?, image: String?, desc: String?, photos: Array<String>?, price: String? ) : Parcelable {

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

    companion object CREATOR : Parcelable.Creator<DestinationEntitie> {
        override fun createFromParcel(parcel: Parcel): DestinationEntitie {
            return DestinationEntitie(parcel)
        }

        override fun newArray(size: Int): Array<DestinationEntitie?> {
            return arrayOfNulls(size)
        }
    }


}