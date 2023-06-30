package gr.map.justdictionary.dictionary.data.util

import java.lang.reflect.Type

interface JsonParser {

    fun <T> fromJson(json: String, type: Type) :T?

    fun <T> toJson(obj: T, tye: Type): String?

}