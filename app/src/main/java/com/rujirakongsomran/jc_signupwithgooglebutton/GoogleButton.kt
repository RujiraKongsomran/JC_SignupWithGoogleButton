package com.rujirakongsomran.jc_signupwithgooglebutton

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import  androidx.compose.runtime.*

@ExperimentalMaterialApi
@Composable
fun GoogleButton() {
    var clicked by remember { mutableStateOf(false) }
    Surface(onClick = { clicked = !clicked }
    ) {

    }
}

@ExperimentalMaterialApi
@Composable
@Preview
private fun GoogleButtonPreview() {
    GoogleButton()
}