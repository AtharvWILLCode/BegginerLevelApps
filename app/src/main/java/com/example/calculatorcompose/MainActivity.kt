package com.example.calculatorcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculatorcompose.ui.theme.CalculatorComposeTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculatorcompose.CalcViewModel



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculatorComposeTheme {
                val viewModel = viewModel<CalcViewModel>()
                val state = viewModel.state
                val buttonspacing = 8.dp
                Calculator(
                    state = state,
                    onAction = viewModel::onAction,
                    buttonspacing = buttonspacing,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.DarkGray)
                )
            }
        }
    }
}





