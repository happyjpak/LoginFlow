package com.example.loginflow.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginflow.R
import com.example.loginflow.components.ButtonComponent
import com.example.loginflow.components.ClickableLoginTextComponent
import com.example.loginflow.components.DividerTextComponent
import com.example.loginflow.components.HeadingTextComponents
import com.example.loginflow.components.MyTextFieldComponents
import com.example.loginflow.components.NormalTextComponents
import com.example.loginflow.components.PasswordTextFieldComponents
import com.example.loginflow.components.UnderLinedTextComponents
import com.example.loginflow.navigation.PostOfficeAppRouter
import com.example.loginflow.navigation.Screen

@Composable
fun LoginScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponents(value = stringResource(id = R.string.login))
            HeadingTextComponents(stringResource(id = R.string.welcome))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponents(
                labelValue = stringResource(id = R.string.email),
                imageVector = Icons.Default.Email
            )
            PasswordTextFieldComponents(
                labelValue = stringResource(id = R.string.password),
                imageVector = Icons.Default.Lock
            )
            Spacer(modifier = Modifier.height(40.dp))
            UnderLinedTextComponents(value = stringResource(id = R.string.forgot_password))
            Spacer(modifier = Modifier.height(140.dp))
            ButtonComponent(value = stringResource(id = R.string.login))
            Spacer(modifier = Modifier.height(20.dp))
            DividerTextComponent()

            ClickableLoginTextComponent(tryingToLogin = false, onTextSelected = {
                PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
            })
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}
