package com.example.calculatorapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable()
fun MyApp(viewModel: CalculateViewModel = viewModel()) {

Column(
    modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
    verticalArrangement = Arrangement.Bottom,
    horizontalAlignment = Alignment.CenterHorizontally
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = viewModel.displayText,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.CenterEnd)
        )
    }
    Spacer(modifier = Modifier.weight(1f))


        Column {
        Row {
            Button(
                onClick = { viewModel.onClear()},
                shape = CircleShape,
                modifier = Modifier.size(82.dp),
            ) {
                Text(text = "AC", fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {viewModel.onOperatorClick("%")},
                shape = CircleShape,
                modifier = Modifier.size(82.dp)
            ) {
                Text(text = "%", fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {viewModel.onClear()},
                shape = CircleShape,
                modifier = Modifier.size(82.dp)
            ) {
//                Text(text = "x", fontSize = 24.sp)
                Image(imageVector = Icons.Default.Clear, contentDescription = "Clear All",
                    modifier = Modifier
                        .size(82.dp)
                        .clip(CircleShape))
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {viewModel.onOperatorClick("/")},
                shape = CircleShape,
                modifier = Modifier.size(82.dp)
            ) {
                Text(text = "/", fontSize = 24.sp)
            }
        }
    }
    Spacer(modifier = Modifier.height(32.dp))
    Column {
        Row {
            Button(
                onClick = {viewModel.onNumberClicked("7")},
                shape = CircleShape,
                modifier = Modifier.size(82.dp),
            ) {
                Text(text = "7", fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {viewModel.onNumberClicked("8")},
                shape = CircleShape,
                modifier = Modifier.size(82.dp)
            ) {
                Text(text = "8", fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {viewModel.onNumberClicked("9")},
                shape = CircleShape,
                modifier = Modifier.size(82.dp)
            ) {
                Text(text = "9", fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {viewModel.onOperatorClick("*")},
                shape = CircleShape,
                modifier = Modifier.size(82.dp)
            ) {
                Text(text = "*", fontSize = 24.sp)
            }
        }
    }
    Spacer(modifier = Modifier.height(32.dp))
    Column {
        Row {
            Button(
                onClick = {viewModel.onNumberClicked("4")},
                shape = CircleShape,
                modifier = Modifier.size(82.dp),
            ) {
                Text(text = "4", fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {viewModel.onNumberClicked("5")},
                shape = CircleShape,
                modifier = Modifier.size(82.dp)
            ) {
                Text(text = "5", fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {viewModel.onNumberClicked("6")},
                shape = CircleShape,
                modifier = Modifier.size(82.dp)
            ) {
                Text(text = "6", fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {viewModel.onOperatorClick("-")},
                shape = CircleShape,
                modifier = Modifier.size(82.dp)
            ) {
                Text(text = "-", fontSize = 24.sp)
            }
        }
    }
    Spacer(modifier = Modifier.height(32.dp))
    Column {
        Row {
            Button(
                onClick = {viewModel.onNumberClicked("1")},
                shape = CircleShape,
                modifier = Modifier.size(82.dp),
            ) {
                Text(text = "1", fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {viewModel.onNumberClicked("2")},
                shape = CircleShape,
                modifier = Modifier.size(82.dp)
            ) {
                Text(text = "2", fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {viewModel.onNumberClicked("3")},
                shape = CircleShape,
                modifier = Modifier.size(82.dp)
            ) {
                Text(text = "3", fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {viewModel.onOperatorClick("+")},
                shape = CircleShape,
                modifier = Modifier.size(82.dp)
            ) {
                Text(text = "+", fontSize = 24.sp)
            }
        }
    }
    Spacer(modifier = Modifier.height(32.dp))
    Column {
        Row {
            Button(
                onClick = {viewModel.onNumberClicked("00")},
                shape = CircleShape,
                modifier = Modifier.size(82.dp),
            ) {
                Text(text = "00", fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {viewModel.onNumberClicked("0")},
                shape = CircleShape,
                modifier = Modifier.size(82.dp)
            ) {
                Text(text = "0", fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {viewModel.onNumberClicked(".")},
                shape = CircleShape,
                modifier = Modifier.size(82.dp)
            ) {
                Text(text = ".", fontSize = 24.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {viewModel.onEqualClick()},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red
                ),
                shape = CircleShape,
                modifier = Modifier.size(82.dp)
            ) {
                Text(text = "=", fontSize = 24.sp, color = Color.White)
            }

        }
    }
}
}


