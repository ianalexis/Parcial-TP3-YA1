package com.example.parcial_tp3_ya1.entities

import android.os.Parcel
import android.os.Parcelable

class FlightEntitie (idIda : String?, aeropuertoIda: String?, idVuelta : String?, aeropuertoVuelta: String?, duracion : String?, aerolinea: String?, logo : String?, clase : String?, precio : String? ) :  Parcelable {

    var idIda : String?
    var aeropuertoIda : String?
    var idVuelta : String?
    var aeropuertoVuelta : String?
    var duracion : String?
    var aerolinea : String?
    var logo : String?
    var clase : String?
    var precio : String?
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }
    init {
        this.idIda = idIda
        this.aeropuertoIda = aeropuertoIda
        this.idVuelta = idVuelta
        this.aeropuertoVuelta = aeropuertoVuelta
        this.duracion = duracion
        this.aerolinea = aerolinea
        this.logo = logo
        this.clase = clase
        this.precio = precio
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(idIda)
        parcel.writeString(aeropuertoIda)
        parcel.writeString(idVuelta)
        parcel.writeString(aeropuertoVuelta)
        parcel.writeString(duracion)
        parcel.writeString(aerolinea)
        parcel.writeString(logo)
        parcel.writeString(clase)
        parcel.writeString(precio)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<FlightEntitie> {
        override fun createFromParcel(parcel: Parcel): FlightEntitie {
            return FlightEntitie(parcel)
        }

        override fun newArray(size: Int): Array<FlightEntitie?> {
            return arrayOfNulls(size)
        }
    }


}