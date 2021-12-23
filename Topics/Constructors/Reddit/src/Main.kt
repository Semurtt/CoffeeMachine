class Site(val address: String, val foundationYear: Int)

fun makeReddit(): Site {
    val site = Site("reddit.com", 2005)
    return site
}
