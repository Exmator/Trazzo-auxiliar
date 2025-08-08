package edu.javeriana.trazzo.ui.utils

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import edu.javeriana.trazzo.R

@Composable
fun AddButton(
    texto: String,
    modifier: Modifier = Modifier
){
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.verde_principal),
        ),
        modifier = modifier
    ) {
        Text(text = texto)
    }
}