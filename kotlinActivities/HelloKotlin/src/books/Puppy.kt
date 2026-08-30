package books

import kotlin.random.Random

class Puppy {
    fun playWithBook(book: Book) {
        val destroyedPages = Random.nextInt(1, 10)
        book.tornPages(destroyedPages)
    }
}