package dev.tokoi.kotlin

class Meeting(val title: String) {
    var location = ""

    @JvmField
    var description = ""

    companion object {
        @JvmField
        val APP_VERSION = 1

        @JvmStatic
        fun getAppVersion(): Int {
            return APP_VERSION
        }
    }
}