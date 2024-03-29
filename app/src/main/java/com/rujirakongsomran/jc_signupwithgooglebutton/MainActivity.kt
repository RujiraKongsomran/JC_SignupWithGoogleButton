package com.rujirakongsomran.jc_signupwithgooglebutton

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rujirakongsomran.jc_signupwithgooglebutton.ui.theme.JC_SignupWithGoogleButtonTheme

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_SignupWithGoogleButtonTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    GoogleButton(
                        text = "Sign Up with Google",
                        loadingText = "Creating Account...",
                        icon = painterResource(id = R.drawable.ic_google),
                        onClicked = {
                            Log.d("googleButton", "Clicked!")
                        }
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    GoogleButton(
                        text = "Sign Up with facebook",
                        loadingText = "Creating Account...",
                        icon = painterResource(id = R.drawable.ic_facebook),
                        onClicked = {
                            Log.d("facebookButton", "Clicked!")
                        }
                    )
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
    JC_SignupWithGoogleButtonTheme {
        Greeting("Android")
    }
}