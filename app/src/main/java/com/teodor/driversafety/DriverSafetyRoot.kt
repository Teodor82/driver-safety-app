package com.teodor.driversafety

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.teodor.driversafety.ui.theme.DriverSafetyTheme

@Composable
fun DriverSafetyRoot() {
  DriverSafetyTheme {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
      Text("Driver Safety — Hello!")
    }
  }
}
