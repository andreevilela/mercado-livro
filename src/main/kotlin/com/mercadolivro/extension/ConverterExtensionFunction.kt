package com.mercadolivro.extension

import com.mercadolivro.model.CustomerModel
import com.mercadolivro.request.CustomerRequest

fun CustomerRequest.toCustomerModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.email)
}

fun CustomerRequest.toCustomerModel(id: String): CustomerModel {
    return CustomerModel(id = id, name = this.name, email = this.email)
}