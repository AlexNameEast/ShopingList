package com.example.shopinglist.domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun ediShopItem(shopItem: ShopItem) {
        shopListRepository.ediShopItem(shopItem)
    }
}