package com.mercadolivro.request

data class CustomerRequest(
    var name: String,
    var email: String
) {

//    fun toCustomerModel(): CustomerModel {
//        return CustomerModel(name = this.name, email = this.email)
//    }
}