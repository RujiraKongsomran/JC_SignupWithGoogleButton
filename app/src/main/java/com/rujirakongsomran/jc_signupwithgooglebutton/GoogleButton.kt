package com.rujirakongsomran.jc_signupwithgooglebutton

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import  androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.rujirakongsomran.jc_signupwithgooglebutton.ui.theme.JC_SignupWithGoogleButtonTheme
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
        Row(
            modifier = Modifier
                .padding(
                    start = 12.dp,
                    end = 16.dp,
                    top = 12.dp,
                    bottom = 12.dp
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(
                    id = R.drawable.ic_google
                ),
                contentDescription = "Google Button",
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Sign Up with Google")
        }
    }
}


@ExperimentalMaterialApi
@Composable
@Preview
private fun GoogleButtonPreview() {
    JC_SignupWithGoogleButtonTheme() {
        GoogleButton()
    }
}