package com.kaleub.pagingcourse.api

import com.kaleub.pagingcourse.models.ResponseApi
import com.kaleub.pagingcourse.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getAllCharacters(
        @Query("page") page: Int
    ): Response<ResponseApi>


}