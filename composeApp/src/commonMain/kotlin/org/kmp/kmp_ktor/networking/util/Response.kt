package org.kmp.kmp_ktor.networking.util

sealed class Response<T> {
    class Loading<T> : Response<T>()
    class Error<T>(val error: Throwable?) : Response<T>()
    class Success<T>(val data: T) : Response<T>()
}