package com.example.persink

class Notify {
    var setTimeMilis = 0
    fun timeNotify(setTime: String)
    {
        if (setTime == "15")
            // setTimeMilis = 1296000000 // 15 Hari
            setTimeMilis = 15000
        if (setTime == "10")
            // setTimeMilis = 864000000 // 10 Hari
            setTimeMilis = 10000
        if (setTime == "5")
            // setTimeMilis = 432000000 // 5 Hari
            setTimeMilis = 5000
    }
}