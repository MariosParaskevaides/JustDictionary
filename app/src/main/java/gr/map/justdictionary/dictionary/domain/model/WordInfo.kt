package gr.map.justdictionary.dictionary.domain.model

class WordInfo(
    val license: License,
    val meanings: List<Meaning>,
    val phonetic: String,
    val phonetics: List<Phonetic>,
    val sourceUrls: List<String>,
    val word: String
) {
}