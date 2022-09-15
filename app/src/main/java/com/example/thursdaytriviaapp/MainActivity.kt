package com.example.thursdaytriviaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thursdaytriviaapp.ui.theme.ThursdayTriviaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThursdayTriviaAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomePage()
                }
            }
        }
    }
}

@Composable
fun HomePage() {
    Column( horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Image(
            painter = painterResource(id = R.drawable.jetpack_compose_desktop_icon),
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(text="Harsh Bhalala",fontSize = 30.sp, color = Color(56, 112, 179, 255))
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "❤️", fontSize = 30.sp)
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Jetpack Compose",fontSize = 30.sp, color = Color(8, 48, 66, 255))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ThursdayTriviaAppTheme {
        HomePage()
    }
}