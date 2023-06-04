package com.example.doglistapirest

import com.google.gson.annotations.SerializedName

// Parametros con el mismo nombre que en el JSON
//  data class DogsResponse(var status: String, var message: List<String>)

// Parametros con distinto nombre que en el JSON
data class DogsResponse(
    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>
)
