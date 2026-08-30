package books

const val maxBooks = 3

open class Book(val title: String, val author: String, val year: Int, var pages: Int) {

    private var currentPage = 0

    open fun readPage() {
        currentPage++
    }

    fun pair(): Pair<String, String> {
        return Pair(title, author)
    }

    fun triple(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(borrowedBooks: Int): Boolean {
        return borrowedBooks < maxBooks
    }

    companion object {
        const val BASE_URL = "https://library.example.com/"
    }
    fun printUrl() {
        println(BASE_URL + title + ".html")
    }

    }

fun Book.bookWeight(): Double {
    return pages * 1.5
}

fun Book.tornPages(numberOfTornPages: Int) {
    pages = pages - numberOfTornPages
}
