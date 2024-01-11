package com.dam2jms.pruebaretrofitconapiari.data

import com.dam2jms.pruebaretrofitconapiari.models.Proyecto
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.http.GET

interface RetrofitService {
    @GET("proyectos")
    suspend fun getProyectos(): List<Proyecto>
}

object RetrofitServiceFactory {
    fun makeRetrofitService(): RetrofitService {
        return Retrofit
            .Builder()
            .baseUrl("https://private-a3a699-probandoretrofitapiary.apiary-mock.com/")
            .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
            .build().create(RetrofitService::class.java)
    }
}























/*class CreditCardRepository {
    private val creditCardService = RetrofitInstance.creditCardService

    suspend fun getCreditCards(): List<Proyecto> {
        return creditCardService.getProyectos()
    }
}

class CreditCardViewModel : ViewModel() {
    private val repository = CreditCardRepository()

    private val _creditCards = MutableLiveData<List<Proyecto>>()
    val creditCards: LiveData<List<Proyecto>> = _creditCards

    fun fetchCreditCards() {
        viewModelScope.launch {
            try {
                val cards = repository.getCreditCards()
                _creditCards.value = cards
            } catch (e: Exception) {
                // Handle error
            }
        }
    }
}*/