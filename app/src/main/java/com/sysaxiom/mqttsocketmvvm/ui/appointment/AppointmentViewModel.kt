package com.sysaxiom.mqttsocketmvvm.ui.appointment

import android.content.Context
import androidx.lifecycle.ViewModel
import com.sysaxiom.mqttsocketmvvm.handlers.mqtt.MqttHandler

class AppointmentViewModel(
    private val context: Context
) : ViewModel() {

    fun getMqtt() = MqttHandler(context)

}