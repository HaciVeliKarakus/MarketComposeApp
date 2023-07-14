package com.hvk.marketcomposeapp

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.androidx.AndroidScreen

class NotificationScreen : AndroidScreen() {
    @Composable
    override fun Content() {
        Text(text = "Hi")
    }
}
