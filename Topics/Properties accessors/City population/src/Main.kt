class City(val name: String) {
    var population: Int = 500
        set(peoples) {
            if (peoples < 0) field = 0
            if (peoples > 50_000_000) field = 50_000_000
        }
}
