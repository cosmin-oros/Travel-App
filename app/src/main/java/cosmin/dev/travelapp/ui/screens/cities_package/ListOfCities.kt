package cosmin.dev.travelapp.ui.screens.cities_package

import cosmin.dev.travelapp.R

object ListOfCities {
    fun getData(): ArrayList<CitiesData>{
        return arrayListOf(
            CitiesData(
                imgRes = R.drawable.kabul,
                cityName = "Kabul",
                country = "Afghanistan",
                continent = "Asia",
                firstCity = 1
            ),
            CitiesData(
                imgRes = R.drawable.herat,
                cityName = "Herat",
                country = "Afghanistan",
                continent = "Asia",
                firstCity = 0
            ),
            CitiesData(
                imgRes = R.drawable.tirana,
                cityName = "Tirana",
                country = "Albania",
                continent = "Europe",
                firstCity = 1
            ),
            CitiesData(
                imgRes = R.drawable.durres,
                cityName = "Durres",
                country = "Albania",
                continent = "Europe",
                firstCity = 0
            ),
            CitiesData(
                imgRes = R.drawable.berat,
                cityName = "Berat",
                country = "Albania",
                continent = "Europe",
                firstCity = 0
            )
        )
    }
}