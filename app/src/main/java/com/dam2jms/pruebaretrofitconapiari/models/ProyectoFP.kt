package com.dam2jms.pruebaretrofitconapiari.models

import kotlinx.serialization.Serializable

@Serializable
data class Proyecto(
    val proyecto: String,
    val centro: String,
    val responsable: String
)
