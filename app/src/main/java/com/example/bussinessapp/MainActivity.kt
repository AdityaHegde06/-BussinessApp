package com.example.bussinessapp

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussinessapp.ui.theme.BussinessAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


                {

                }

                }
            }
        }



@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true, showSystemUi = false)
@Composable
private fun Profile(){
    // Column with padding around the entire profile section
    Column (modifier = Modifier.padding(10.dp)){
        // Call to ProfilePreview composable to display image, name, and occupation
        ProfilePreview(R.drawable.p,
            name ="Aditya Hegde",
            occupation = "Android developer",
             email = "abcde@gmail.com",
              Phone ="0123456789" )


    }
}






@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun  ProfilePreview(imgId: Int, name: String, occupation: String, email: String, Phone: String, modifier: Modifier = Modifier) {
    BussinessAppTheme {
        //to arrange the profile components horizontal
        Column(
            modifier = modifier.padding(40.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Image composable to display profile picture
            Image(
                painter = painterResource(id = imgId),
                contentDescription = "Profile Picture for $name",
                modifier = Modifier.size(40.dp)
                    .clip(CircleShape)//Crops the image in circular shape
                    .background(MaterialTheme.colorScheme.surface)
            )
            // Text composable for the name, styled as a headline
            Text(
                text = name,
                //Headline style from this them
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                fontSize = 8.sp
            )
            Text(
                text = occupation,
                //Headline style from this them
                fontWeight = FontWeight.Thin,
                fontSize = 8.sp
            )

            //add space to get the space
            Spacer(modifier = Modifier.height(16.dp))


            //EMAIL ROW WITH ICON
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email Icon",
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.size(20.dp)

                )
                //ADDING SPACING BETWEEN  THE ICON  AND TEXT
                Spacer(modifier = Modifier.width(4.dp))

                Text(
                    text = email,
                    fontSize = 10.sp,
                    color = Color.Gray
                )


            }
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)
            ){
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = "phone Icon",
                    tint= MaterialTheme.colorScheme.primary,
                    modifier = Modifier.size(20.dp)

                )

                //ADDING SPACING BETWEEN  THE ICON  AND TEXT
                Spacer(modifier = Modifier.width(4.dp))

                Text(
                    text = Phone,
                    fontSize = 10.sp,
                    color = Color.Gray
                )

            }
        }


    }
}


