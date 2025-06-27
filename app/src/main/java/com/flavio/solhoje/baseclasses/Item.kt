package com.flavio.solhoje.baseclasses

data class Item(
    var nome : String? = null,
    var endereco: String? = null,
    var contato : String? = null,
    val base64Image: String? = null,
    val imageUrl: String? = null
)
