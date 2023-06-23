package com.example.forecasimpleapp.api.service

import com.google.gson.annotations.SerializedName

class ForecaAuthResponse (@SerializedName("access_token") val token: String)