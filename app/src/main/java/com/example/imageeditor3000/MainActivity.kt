package com.example.imageeditor3000

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*
import androidx.compose.ui.res.painterResource
import com.example.imageeditor3000.ui.navigation.NavGraph
import com.example.imageeditor3000.ui.theme.ImageEditorTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            ImageEditorTheme {
                var showSplash by remember { mutableStateOf(true) }

                LaunchedEffect(Unit) {
                    // Aquí pones tu “carga”: delay, prefs, BD, etc.
                    delay(1500)          // Simula espera o carga
                    showSplash = false   // Cuando acaba, quitas la splash
                }

                if (showSplash) {
                    SplashScreen()       // Pantalla de splash COMPOSABLE
                } else {
                    NavGraph()           // Tu navegación normal
                }
            }
        }
    }
}

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        // AQUÍ va tu logo directamente, como antes en un layout
        Image(
            painter = painterResource(id = R.drawable.splash_logo),
            contentDescription = null
        )
    }
}


