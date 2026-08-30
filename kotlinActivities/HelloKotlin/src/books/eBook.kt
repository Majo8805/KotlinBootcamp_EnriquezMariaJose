package books


class eBook(title: String, author: String, year: Int, pages: Int, val format: String = "text"): Book(title, author, year, pages) {

    private var wordCount = 0

    override fun readPage() {
        wordCount = wordCount + 250
    }

}