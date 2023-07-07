package com.example.shopinglist.domain

interface ShopListRepository {

    fun addShopItem(shoItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun ediShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>
}