package gr.map.justdictionary.dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import gr.map.justdictionary.dictionary.domain.model.License
import gr.map.justdictionary.dictionary.domain.model.Meaning
import gr.map.justdictionary.dictionary.domain.model.Phonetic
import gr.map.justdictionary.dictionary.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    val license: License,
    val meanings: List<Meaning>,
    val phonetic: String,
    val phonetics: List<Phonetic>,
    val sourceUrls: List<String>,
    val word: String,
    @PrimaryKey val id: Int? = null
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            license = license,
            meanings = meanings,
            phonetic = phonetic,
            phonetics = phonetics,
            sourceUrls = sourceUrls,
            word = word,
        )
    }
}
