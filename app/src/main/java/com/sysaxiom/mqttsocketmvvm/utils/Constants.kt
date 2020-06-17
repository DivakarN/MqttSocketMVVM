package com.sysaxiom.mqttsocketmvvm.utils

object UrlsFields {

    const val BaseURL = ""
    const val ID = "id"
    const val LAT = "lat"
    const val LON = "lon"
    const val DATE = "date"
    const val TIME = "time"
    const val ADDRESS = "address"
    const val SPECIALITY = "speciality"
    const val NOTES = "notes"
    const val GET_APPOINTMENT = "patient/getAppointment"
    const val MAXIMUM_TIMEOUT = 90
    const val NO_INTERNET_CONNECTTION = "No Internet Connecttion"
    const val MQTT_DEV : String = ""
    const val MQTT_DEV_USERNAME : String = ""
    const val MQTT_DEV_PASSWORD : String =""
    const val MQTT_DEV_CLIENT_ID : String =""
}

fun returnMqttTopicNames(): ArrayList<String> {
    val mqttTopicName = ArrayList<String>()
    mqttTopicName.add("hello_world")
    return mqttTopicName
}
