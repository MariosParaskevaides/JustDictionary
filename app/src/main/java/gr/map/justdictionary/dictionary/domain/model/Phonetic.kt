package gr.map.justdictionary.dictionary.domain.model

import gr.map.justdictionary.dictionary.data.remote.dto.License

class Phonetic(
    val audio: String,
    val license: License,
    val sourceUrl: String,
    val text: String
)