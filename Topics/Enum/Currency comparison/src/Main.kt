enum class Country(val currency: String) {
    GERMANY("Euro"),
    MALI("CFA franc"),
    DOMINICA("Eastern Caribbean dollar"),
    CANADA("Canadian dollar"),
    SPAIN("Euro"),
    AUSTRALIA("Australian dollar"),
    BRAZIL("Brazilian real"),
    SENEGAL("CFA franc"),
    FRANCE("Euro"),
    GRENADA("Eastern Caribbean dollar"),
    KIRIBATI("Australian dollar");

    companion object {
        fun countryExist(cntry: String): Boolean {
            for (i in Country.values()) {
                if (cntry.uppercase() == i.name) return true
            }
            return false
        }
    }
}

fun main() {
    val (a, b) = readLine()!!.split(" ")
    println(
        if (Country.countryExist(a) && Country.countryExist(b)) {
            Country.valueOf(a.uppercase()).currency == Country.valueOf(b.uppercase()).currency
        } else false
    )
}