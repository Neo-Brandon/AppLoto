package com.example.loto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.loto.ui.theme.LotoTheme
import com.example.loto.view.LoteriaView
import com.example.loto.viewModels.LoteriaViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Obtén una instancia de LoteriaViewModel usando viewModels()
        val viewModel: LoteriaViewModel by viewModels()

        enableEdgeToEdge()

        setContent {
            LotoTheme {
                // Surface para el fondo de la pantalla
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.onBackground
                ) {
                    // Llama a la vista LoteriaView y pasa el viewModel
                    LoteriaView(viewModels = viewModel)
                }
            }
        }
    }
}