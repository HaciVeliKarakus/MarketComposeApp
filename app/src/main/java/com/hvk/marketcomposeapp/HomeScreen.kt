package com.hvk.marketcomposeapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.navigator.bottomSheet.LocalBottomSheetNavigator

class HomeScreen : AndroidScreen() {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        Scaffold(
            topBar = { TopBar() },
        ) {
            Column(modifier = Modifier.padding(it)) {
                Text(text = "Deneme")
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun TopBar() {
        var favTapped by remember { mutableStateOf(false) }
        var notificationTapped by remember { mutableStateOf(false) }

        val bottomSheetNavigator = LocalBottomSheetNavigator.current
        Row(
            modifier = Modifier
                .height(64.dp)
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
//                .border(BorderStroke(1.dp, Color.Black))
                .graphicsLayer {
                    shadowElevation = 8.dp.toPx()
                    shape = RoundedCornerShape(16.dp)
                    clip = true
                }
                .background(Color(255, 138, 101, 255)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            TextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Search somethings...") },
                leadingIcon = { Icon(Icons.Rounded.Search, contentDescription = "Search") },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                ),
            )

            IconButton(onClick = { favTapped = !favTapped }) {
                Icon(
                    if (favTapped) {
                        Icons.Rounded.FavoriteBorder
                    } else {
                        Icons.Filled.Favorite
                    },
                    "Favorite",
                )
            }
            IconButton(onClick = { bottomSheetNavigator.show(NotificationScreen()) }) {
                Icon(Icons.Filled.Notifications, "Notification")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PreviewHomeScreen() {
    HomeScreen().Content()
}
