package gr.map.justdictionary.dictionary.data.remote

import gr.map.justdictionary.dictionary.data.remote.dto.WordInfoDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {

    @GET("/api/v2/entries/en/{word}")
    suspend fun getWordInfo(@Path("word") word: String): List<WordInfoDto>

}