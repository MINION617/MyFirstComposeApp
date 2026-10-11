package com.example.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstComposeAppTheme {
                MyFirstScreen()
            }
        }
    }
}

@Composable
fun MyFirstScreen() {
    // Task 3
    Surface(color = Color.Gray) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(48.dp)
        ) {
            // Task 1
            Text(text = "Halo Ges! Aku Riza.")
            Text(text = "Ide punyaku dan tim: buat aplikasi yang bisa tracking bansos pemerintah.")

            // Task 2
            Image(
                painter = painterResource(id = R.drawable.my_picture),
                contentDescription = "Waktu lagi 'jalan2'"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyFirstScreenPreview() {
    MyFirstComposeAppTheme {
        MyFirstScreen()
    }
}
