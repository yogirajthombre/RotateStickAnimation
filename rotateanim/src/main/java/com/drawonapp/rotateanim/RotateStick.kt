package com.drawonapp.rotateanim

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun RotatetheStick(width: Dp, hieght:Dp, start_angle:Float, end_angle:Float, durationMillis:Int) {

    var animate_angle = animateFloatValues(initialValue = start_angle,
        targetValue = end_angle, durationMillis = durationMillis)



    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {


        Box() {

            Canvas(
                modifier = Modifier
                    .width(width)
                    .height(hieght)
            ) {

                val rect = Rect(Offset.Zero, size)


                rotate(animate_angle,rect.center){
                    drawRoundRect(color = Color.Red,
                        cornerRadius = CornerRadius(20.0f)
                    )
                }
            }

        }

    }

}


@Composable
fun animateFloatValues(initialValue: Float,
                       targetValue: Float,
                       durationMillis: Int) : Float{

    val EaseInOut = CubicBezierEasing(0.42f, 0.0f, 0.58f, 1.0f)

    val infiniteTransition = rememberInfiniteTransition()
    val scale: Float by infiniteTransition.animateFloat(
        initialValue = initialValue,
        targetValue = targetValue,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis, easing = EaseInOut),
            repeatMode = RepeatMode.Restart
        )
    )

    return scale

}