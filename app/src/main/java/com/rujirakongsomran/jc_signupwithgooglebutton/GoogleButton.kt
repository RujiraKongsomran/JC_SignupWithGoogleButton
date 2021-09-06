package com.rujirakongsomran.jc_signupwithgooglebutton

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import  androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.rujirakongsomran.jc_signupwithgooglebutton.ui.theme.Shapes

@ExperimentalMaterialApi
@Composable
fun GoogleButton() {
    var clicked by remember { mutableStateOf(false) }
    Surface(
        onClick = { clicked = !clicked },
        shape = Shapes.medium,
        border = BorderStroke(
            width = 1.dp,
            color = Color.LightGray
        ),
        color = MaterialTheme.colors.surface
    ) {

    }
}


@ExperimentalMaterialApi
@Composable
@Preview(showBackground = true)
private fun GoogleButtonPreview() {
    GoogleButton()
}