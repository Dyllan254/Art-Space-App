package com.example.artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspaceapp.ui.theme.ArtSpaceAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpace()
                }
            }
        }
    }
}

@Composable
fun ArtSpace(modifier: Modifier = Modifier) {
    val firstArtwork = R.drawable.mona_lisa
    val secondArtwork = R.drawable.girl_with_a_pearl_earring
    val thirdArtwork = R.drawable.the_starry_night
    val fourthArtwork = R.drawable.the_kiss
    val fifthArtwork = R.drawable.the_birth_of_venus
    val sixthArtwork = R.drawable.arrangememnt_in_grey_and_black_no_1
    val seventhArtwork = R.drawable.the_arnolfini_portrait
    val eighthArtwork = R.drawable.the_garden_of_earthly_delights
    val ninthArtwork = R.drawable.a_sunday_afternoon_on_the_island_of_la_grande_jatte
    val tenthArtwork = R.drawable.les_demoiselles_d_avignon
    val eleventhArtwork = R.drawable.the_harvesters
    val twelfthArtwork = R.drawable.le_dejeuner_sur_l_herbe
    val thirteenthArtwork = R.drawable.composition_with_red_blue_and_yellow
    val fourteenthArtwork = R.drawable.las_meninas__or_the_family_of_king_philip_iv
    val fifteenthArtwork = R.drawable.guernica
    val sixteenthArtwork = R.drawable.the_naked_maja
    val seventeenthArtwork = R.drawable.grande_odalisque

    var currentArtwork by remember { mutableStateOf(firstArtwork) }
    var title by remember { mutableStateOf(R.string.mona_lisa) }
    var artist by remember { mutableStateOf(R.string.leonardo_da_vinci) }
    var contentDescription by remember { mutableStateOf(R.string.mona_lisa) }

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
       ArtworkAndText(
           currentArtwork = currentArtwork,
           title = title,
           artist = artist,
           contentDescription = contentDescription
       )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = modifier.padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
        ) {
            Button(
                onClick = {
                    when (currentArtwork) {
                        firstArtwork -> {
                            currentArtwork = seventeenthArtwork
                            title = R.string.grande_odalisque
                            artist = R.string.jean_auguste_dominique_ingres
                            contentDescription = R.string.grande_odalisque
                        }

                        secondArtwork -> {
                            currentArtwork = firstArtwork
                            title = R.string.mona_lisa
                            artist = R.string.leonardo_da_vinci
                            contentDescription = R.string.leonardo_da_vinci
                        }

                        thirdArtwork -> {
                            currentArtwork = secondArtwork
                            title = R.string.girl_with_a_pearl_earring
                            artist = R.string.johannes_vermeer
                            contentDescription = R.string.girl_with_a_pearl_earring
                        }

                        fourthArtwork -> {
                            currentArtwork = thirdArtwork
                            title = R.string.the_starry_night
                            artist = R.string.vincent_van_goh
                            contentDescription = R.string.vincent_van_goh
                        }

                        fifthArtwork -> {
                            currentArtwork = fourthArtwork
                            title = R.string.the_kiss
                            artist = R.string.gustav_klimt
                            contentDescription = R.string.the_kiss
                        }

                        sixthArtwork -> {
                            currentArtwork = fifthArtwork
                            title = R.string.the_birth_of_venus
                            artist = R.string.sandro_botticelli
                            contentDescription = R.string.the_birth_of_venus
                        }

                        seventhArtwork -> {
                            currentArtwork = sixthArtwork
                            title = R.string.arrangement_in_Grey_and_Black_No__1
                            artist = R.string.james_abbott_mcNeill_whistler
                            contentDescription = R.string.arrangement_in_Grey_and_Black_No__1
                        }

                        eighthArtwork -> {
                            currentArtwork = seventhArtwork
                            title = R.string.the_arnolfini_portrait
                            artist = R.string.jan_van_eyck
                            contentDescription = R.string.the_arnolfini_portrait
                        }

                        ninthArtwork -> {
                            currentArtwork = eighthArtwork
                            title = R.string.the_garden_of_earthly_delights
                            artist = R.string.hieronymus_bosch
                            contentDescription = R.string.the_garden_of_earthly_delights
                        }

                        tenthArtwork -> {
                            currentArtwork = ninthArtwork
                            title = R.string.a_sunday_afternoon_on_the_island_of_la_grande_jatte
                            artist = R.string.georges_seurat
                            contentDescription = R.string.a_sunday_afternoon_on_the_island_of_la_grande_jatte
                        }

                        eleventhArtwork -> {
                            currentArtwork = tenthArtwork
                            title = R.string.les_demoiselles_d_avignon
                            artist = R.string.pablo_picasso
                            contentDescription = R.string.les_demoiselles_d_avignon
                        }

                        twelfthArtwork -> {
                            currentArtwork = eleventhArtwork
                            title = R.string.the_harvesters
                            artist = R.string.pieter_bruegel_the_elder
                            contentDescription = R.string.the_harvesters
                        }

                        thirteenthArtwork -> {
                            currentArtwork = twelfthArtwork
                            title = R.string.le_déjeuner_sur_l_herbe
                            artist = R.string.edouard_manet
                            contentDescription = R.string.le_déjeuner_sur_l_herbe
                        }

                        fourteenthArtwork -> {
                            currentArtwork = thirteenthArtwork
                            title = R.string.composition_with_red_blue_and_yellow
                            artist = R.string.piet_mondrian
                            contentDescription = R.string.composition_with_red_blue_and_yellow
                        }

                        fifteenthArtwork -> {
                            currentArtwork = fourteenthArtwork
                            title = R.string.las_meninas
                            artist = R.string.diego_rodríguez_de_Silva_y_velázquez
                            contentDescription = R.string.las_meninas
                        }

                        sixteenthArtwork -> {
                            currentArtwork = fifteenthArtwork
                            title = R.string.guernica
                            artist = R.string.pablo_picasso_2
                            contentDescription = R.string.guernica
                        }

                        seventeenthArtwork -> {
                            currentArtwork = sixteenthArtwork
                            title = R.string.the_naked_maja
                            artist = R.string.francisco_de_goya_y_lucientes
                            contentDescription = R.string.the_naked_maja
                        }

                        else -> {
                            currentArtwork = seventeenthArtwork
                            title = R.string.grande_odalisque
                            artist = R.string.jean_auguste_dominique_ingres
                            contentDescription = R.string.grande_odalisque
                        }
                    }
                },
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 2.dp,
                    pressedElevation = 0.dp,
                    focusedElevation = 0.dp
                )
            ) {
                Text(text = stringResource(id = R.string.previous))
            }
            Button(
                onClick = {
                    when(currentArtwork) {
                        firstArtwork -> {
                            currentArtwork = secondArtwork
                            title = R.string.girl_with_a_pearl_earring
                            artist = R.string.johannes_vermeer
                            contentDescription = R.string.girl_with_a_pearl_earring
                        }
                        secondArtwork -> {
                            currentArtwork = thirdArtwork
                            title = R.string.the_starry_night
                            artist = R.string.vincent_van_goh
                            contentDescription = R.string.vincent_van_goh
                        }
                        thirdArtwork -> {
                            currentArtwork = fourthArtwork
                            title = R.string.the_kiss
                            artist = R.string.gustav_klimt
                            contentDescription = R.string.the_kiss
                        }
                        fourthArtwork -> {
                            currentArtwork = fifthArtwork
                            title = R.string.the_birth_of_venus
                            artist = R.string.sandro_botticelli
                            contentDescription = R.string.the_birth_of_venus
                        }
                        fifthArtwork -> {
                            currentArtwork = sixthArtwork
                            title = R.string.arrangement_in_Grey_and_Black_No__1
                            artist = R.string.james_abbott_mcNeill_whistler
                            contentDescription = R.string.arrangement_in_Grey_and_Black_No__1
                        }
                        sixthArtwork -> {
                            currentArtwork = seventhArtwork
                            title = R.string.the_arnolfini_portrait
                            artist = R.string.jan_van_eyck
                            contentDescription = R.string.the_arnolfini_portrait
                        }
                        seventhArtwork -> {
                            currentArtwork = eighthArtwork
                            title = R.string.the_garden_of_earthly_delights
                            artist = R.string.hieronymus_bosch
                            contentDescription = R.string.the_garden_of_earthly_delights
                        }
                        eighthArtwork -> {
                            currentArtwork = ninthArtwork
                            title = R.string.a_sunday_afternoon_on_the_island_of_la_grande_jatte
                            artist = R.string.georges_seurat
                            contentDescription = R.string.a_sunday_afternoon_on_the_island_of_la_grande_jatte
                        }
                        ninthArtwork -> {
                            currentArtwork = tenthArtwork
                            title = R.string.les_demoiselles_d_avignon
                            artist = R.string.pablo_picasso
                            contentDescription = R.string.les_demoiselles_d_avignon
                        }
                        tenthArtwork -> {
                            currentArtwork = eleventhArtwork
                            title = R.string.the_harvesters
                            artist = R.string.pieter_bruegel_the_elder
                            contentDescription = R.string.the_harvesters
                        }
                        eleventhArtwork -> {
                            currentArtwork = twelfthArtwork
                            title = R.string.le_déjeuner_sur_l_herbe
                            artist = R.string.edouard_manet
                            contentDescription = R.string.le_déjeuner_sur_l_herbe
                        }
                        twelfthArtwork -> {
                            currentArtwork = thirteenthArtwork
                            title = R.string.composition_with_red_blue_and_yellow
                            artist = R.string.piet_mondrian
                            contentDescription = R.string.composition_with_red_blue_and_yellow
                        }
                        thirteenthArtwork -> {
                            currentArtwork = fourteenthArtwork
                            title = R.string.las_meninas
                            artist = R.string.diego_rodríguez_de_Silva_y_velázquez
                            contentDescription = R.string.las_meninas
                        }
                        fourteenthArtwork -> {
                            currentArtwork = fifteenthArtwork
                            title = R.string.guernica
                            artist = R.string.pablo_picasso_2
                            contentDescription = R.string.guernica
                        }
                        fifteenthArtwork -> {
                            currentArtwork = sixteenthArtwork
                            title = R.string.the_naked_maja
                            artist = R.string.francisco_de_goya_y_lucientes
                            contentDescription = R.string.the_naked_maja
                        }
                        sixteenthArtwork -> {
                            currentArtwork = seventeenthArtwork
                            title = R.string.grande_odalisque
                            artist = R.string.jean_auguste_dominique_ingres
                            contentDescription = R.string.grande_odalisque
                        }
                        else -> {
                            currentArtwork = firstArtwork
                            title = R.string.mona_lisa
                            artist = R.string.leonardo_da_vinci
                            contentDescription = R.string.leonardo_da_vinci
                        }
                    }
                },
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 2.dp,
                    pressedElevation = 0.dp,
                    focusedElevation = 0.dp
                )
            ) {
                Text(text = stringResource(id = R.string.next))
            }
        }

    }

}

@Composable
fun ArtworkAndText(
    @DrawableRes currentArtwork: Int,
    @StringRes title: Int,
    @StringRes artist: Int,
    @StringRes contentDescription: Int,
    modifier: Modifier = Modifier
) {
    Spacer(modifier = Modifier.height(10.dp))
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        shape = RectangleShape

    ) {
        Image(
            painter = painterResource(id = currentArtwork),
            contentDescription = stringResource(id = contentDescription),
            modifier = Modifier
                .border(
                    BorderStroke(10.dp, color = Color.White),
                )
        )
    }
    Spacer(modifier = Modifier.height(40.dp))
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp,
        ),
        shape = RectangleShape,
        modifier = Modifier
            .wrapContentSize()

    ) {
        Text(
            text = stringResource(id = title),
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Justify,
            fontSize = 28.sp
        )
        Text(
            text = stringResource(id = artist),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Justify
        )
        Spacer(modifier = Modifier.height(16.dp))

    }


}

@Preview(showBackground = true)
@Composable
fun ArtSpacePreview() {
    ArtSpaceAppTheme {
        ArtSpace()
    }
}