package com.example.loginflow.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginflow.R
import com.example.loginflow.components.ButtonComponent
import com.example.loginflow.components.CheckboxComponent
import com.example.loginflow.components.ClickableLoginTextComponent
import com.example.loginflow.components.DividerTextComponent
import com.example.loginflow.components.HeadingTextComponents
import com.example.loginflow.components.MyTextFieldComponents
import com.example.loginflow.components.NormalTextComponents
import com.example.loginflow.components.PasswordTextFieldComponents
import com.example.loginflow.navigation.PostOfficeAppRouter.navigateTo
import com.example.loginflow.navigation.Screen


@Composable
fun SignUpScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponents(value = stringResource(id = R.string.hello))
            HeadingTextComponents(stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponents(
                labelValue = stringResource(id = R.string.first_name),
                imageVector = Icons.Default.Person
            )
            MyTextFieldComponents(
                labelValue = stringResource(id = R.string.last_name),
                imageVector = Icons.Default.Person
            )
            MyTextFieldComponents(
                labelValue = stringResource(id = R.string.email),
                imageVector = Icons.Default.Email
            )
            PasswordTextFieldComponents(
                labelValue = stringResource(id = R.string.password),
                imageVector = Icons.Default.Lock
            )
            CheckboxComponent(
                value = stringResource(id = R.string.terms_and_condition),
                onTextSelected = {
                    navigateTo(Screen.TermsAndConditionsScreen)
                }
            )
            Spacer(modifier = Modifier.height(80.dp))
            ButtonComponent(value = stringResource(id = R.string.register))
            Spacer(modifier = Modifier.height(20.dp))
            DividerTextComponent()

            ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {
                navigateTo(Screen.LoginScreen)
            })
        }
    }
}

@Preview
@Composable
fun DefaultPreViewOfSignUpScreen() {
    SignUpScreen()
}