package com.example.cadastro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cadastro.ui.theme.CadastroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CadastroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    cadastro()
                }
            }
        }
    }
}

@Composable
fun cadastro () {
    var nome by remember { mutableStateOf("") }
    var bairro by remember { mutableStateOf("") }
    var cep by remember { mutableStateOf("") }
    var cidade by remember { mutableStateOf("") }
    var estado by remember { mutableStateOf("") }

    Column(Modifier
        .fillMaxWidth(),
    ) {

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(text = "App Cadastro",
                fontSize = 20 .sp
            )
        }

        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp),
        )

        Row(
            Modifier
                .fillMaxWidth(),
        ) {
            TextField(
                value = nome, //Variavel var nome by remember {mutableStateOf("")}
                onValueChange = {novoValor -> nome = novoValor},
                label = { Text("Digite seu nome: ")}
            )
        }

        Spacer(modifier = Modifier.height(16.dp)) //Adiciona espaço na vertical

        Row(
            Modifier
                .fillMaxWidth(),
        ) {
            TextField(
                value = bairro , //Variavel var bairro by remember {mutableStateOf("")}
                onValueChange = {novoValor -> bairro = novoValor},
                label = { Text("Digite o nome do seu bairro")}
            )
        }

        Spacer(modifier = Modifier.height(16.dp)) //Adiciona mais espaço na vertical

        Row(
            Modifier
                .fillMaxWidth(),
        ) {
            TextField(
                value = cep, //Variavel var cep by remember {mutableStatOf("")}
                onValueChange = {novoValor -> cep = novoValor},
                label = {Text("Digite o seu CEP: ")}
            )
        }

        Spacer(modifier = Modifier.height(16.dp)) //Adiciona mais espaço na vertical

        Row(
            Modifier
                .fillMaxWidth()
        ) {
            TextField(
                value = cidade, //Variavel var cidade by remember {mutableStatOf("")}
                onValueChange = {novoValor -> cidade = novoValor },
                label = {Text("Digite sua cidade: ")}
            )
        }

        Spacer(modifier = Modifier.height(16.dp)) //Adiciona mais espaço na vertical

        Row (
            Modifier
                .fillMaxWidth()
        ){
            TextField(
                value = estado , //Variavel var cidade by remember {mutableStatOf("")}
                onValueChange =  {novoValor -> estado = novoValor},
                label = {Text("Digite seu estado: ")},
                shape = RoundedCornerShape(25.dp) //Raio da borda
            )
        }

        Spacer(modifier = Modifier.height(16.dp)) //Adiciona mais espaço na vertical

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(onClick = {}){
                Text(text = "Cadastrar")
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun cadastroPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        cadastro()
    }
}