package com.drawonapp.rotatestickanimation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.drawonapp.rotateanim.RotatetheStick
import com.drawonapp.rotatestickanimation.ui.theme.RotateStickAnimationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RotateStickAnimationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    RotatetheStick(width = 160.dp, hieght = 10.dp , start_angle = 0.0f,
                        end_angle = 360.0f, durationMillis = 1500)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RotateStickAnimationTheme {
        RotatetheStick(width = 160.dp, hieght = 10.dp , start_angle = 0.0f,
            end_angle = 360.0f, durationMillis = 1500)
    }
}