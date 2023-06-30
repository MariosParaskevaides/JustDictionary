package gr.map.justdictionary.dictionary.data.remote.dto

import gr.map.justdictionary.dictionary.domain.model.WordInfo

data class WordInfoDto(
    val license: License,
    val meaningDtos: List<MeaningDto>,
    val phonetic: String,
    val phoneticDtos: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            license = license,
            meanings = meaningDtos.map { it.toMeaning() },
            phonetic = phonetic,
            phonetics = phoneticDtos.map { it.toPhonetic() },
            sourceUrls = sourceUrls,
            word = word
        )
    }
}