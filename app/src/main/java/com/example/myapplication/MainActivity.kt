package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen() {
    val image = painterResource(id = R.drawable.iglesia)

    Scaffold(
        bottomBar = {
            NavigationBar (
                containerColor = Color(0xFF1F3A93)
            ) {
                NavigationBarItem(
                    icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = true,
                    onClick = {  }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Filled.List, contentDescription = "Lugares") },
                    label = { Text("Lista") },
                    selected = false,
                    onClick = { },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.Black,
                        unselectedIconColor = Color.Black
                    )
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Filled.LocationOn, contentDescription = "Map") },
                    label = { Text("Map") },
                    selected = false,
                    onClick = {  },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.Black,
                        unselectedIconColor = Color.Black
                    )
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Filled.Star, contentDescription = "Favoritos") },
                    label = { Text("Favoritos") },
                    selected = false,
                    onClick = {  },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.Black,
                        unselectedIconColor = Color.Black
                    )
                )
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .background(Color(0xFF1C1C1E))
                .padding(top = 32.dp, start = 16.dp, end = 16.dp, bottom = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Español - Bienvenido, ad",
                style = MaterialTheme.typography.titleLarge,
                color = Color(0xFF1F3A93),
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Arequipa, conocida como la Ciudad Blanca, posee una gran variedad de edificaciones históricas. Muchas de ellas, como iglesias y casonas, son poco conocidas por los turistas. Este aplicativo busca cambiar eso al ofrecer una experiencia interactiva para descubrir estos lugares llenos de historia",
                color = Color.White,
                textAlign = TextAlign.Justify
            )
            Spacer(modifier = Modifier.height(30.dp))
            Image(
                painter = image,
                contentDescription = "Edificación",
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth(),

            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {  }) {
                Text("VER EDIFICACIONES")
            }
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedButton(onClick = {  }) {
                Text("EDITAR PERFIL")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    MyApplicationTheme {
        HomeScreen()
    }
}
