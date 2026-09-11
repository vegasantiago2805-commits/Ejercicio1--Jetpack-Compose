package com.example.mycertificate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycertificate.ui.theme.MyCertificateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyCertificateTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                            Greeting(
                                name = "Santiago Vega Castañeda",
                                course = "Testing The Simulator",
                                hours = 240,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(innerPadding)
                            )
                        }
                    }
                }
            }
        }


        @Composable
        fun Greeting(name: String, course: String, hours: Int, modifier: Modifier = Modifier) {

            Box(
                modifier = modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(
                                id = R.drawable.ferrari_logo
                            ),
                            contentDescription = "Escudo izquierdo",
                            modifier = Modifier.size(50.dp, 50.dp),
                            alpha = 0.15f
                        )
                        Text(
                            text = "Scuderia Ferrari",
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Image(
                            painter = painterResource(
                                id = R.drawable.hp_logo
                            ),
                            contentDescription = "Escudo derecho",
                            modifier = Modifier.size(50.dp, 50.dp),
                            alpha = 0.15f
                        )
                    }
                    Spacer(
                        modifier = Modifier.height(50.dp)
                    )


                    Text(
                        text = "This certificate is presented to:",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(
                        modifier = Modifier.height(15.dp)
                    )

                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    )
                    {
                        Image(
                            painter = painterResource(
                                id = R.drawable.ferrarescuderia
                            ),
                            contentDescription = "Fondo CAD",
                            modifier = Modifier.size(420.dp, 180.dp),
                            alpha = 0.15f
                        )



                        Text(
                            text = name,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                    }


                    Spacer(
                        modifier = Modifier.height(15.dp)
                    )
                    Text(
                        text = "has completed a $hours hours course on",
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(
                        modifier = Modifier.height(10.dp)
                    )

                    Text(
                        text = course,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(
                        modifier = Modifier.height(35.dp)
                    )


                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = Alignment.CenterVertically
                    ) {


                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(
                                    id = R.drawable.leclerc
                                ),
                                contentDescription = "Firma representante 1",
                                modifier = Modifier.size(100.dp, 60.dp),
                                alpha = 0.15f
                            )

                            Text(
                                text = "Charles Leclerc",
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center
                            )


                            Spacer(
                                modifier = Modifier.height(4.dp)
                            )
                            Text(
                                text = "Piloto F1",
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(
                                    id = R.drawable.frederic
                                ),
                                contentDescription = "Firma representante 2",
                                modifier = Modifier.size(100.dp, 60.dp),
                                alpha = 0.15f
                            )
                            Text(
                                text = "Frederic Vasseur",
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center
                            )
                            Spacer(
                                modifier = Modifier.height(4.dp)
                            )
                            Text(
                                text = "Jefe de Equipo",
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }


        @Preview(showBackground = true)
        @Composable
        fun GreetingPreview() {

            MyCertificateTheme {

                Greeting(
                    name = "Santiago Vega Castañeda",
                    course = "Testing The Simulator",
                    hours = 240
                )
            }
        }