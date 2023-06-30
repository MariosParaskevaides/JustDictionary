package gr.map.justdictionary.dictionary.domain.model

import gr.map.justdictionary.dictionary.data.remote.dto.License

class WordInfo(
    val license: License,
    val meanings: List<Meaning>,
    val phonetic: String,
    val phonetics: List<Phonetic>,
    val sourceUrls: List<String>,
    val word: String
) {
}