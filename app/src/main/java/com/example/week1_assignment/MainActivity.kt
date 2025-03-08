package com.example.week1_assignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.example.week1_assignment.ui.theme.Week1_AssignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            Week1_AssignmentTheme {
                MovieDetailsScreen()
            }
        }
    }
}

@Composable
fun MovieDetailsScreen() {
    val scrollState = rememberScrollState()
    var isDarkMode by remember { mutableStateOf(false) }
    var isWatchListAdded by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .background(if (isDarkMode) Color(0xFF292929) else Color.White) // Dark/Light background switch
        ) {
            Box( // Box wraps the navigation bar to apply background color
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Black) // Set background to black
                    .padding(vertical = 16.dp)
                    .padding(top = 0.dp)

            )
            // Movie Image

            Image(
                painter = painterResource(id = R.drawable.movie), // Replace with your movie image
                contentDescription = "Movie Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(260.dp),
                contentScale = ContentScale.Crop
            )

        Column(
            modifier = Modifier
                .padding(start = 16.dp, top = 20.dp) // Padding for spacing
        ) {
            // Movie Title (Placed Above)
            Text(
                text = "Ein Fest fürs Leben",
                color = if (isDarkMode) Color.White else Color.Black,
                style = MaterialTheme.typography.headlineMedium
            )

            Spacer(modifier = Modifier.height(8.dp)) // Space between title and details

            // Movie Details (Year, Quality, and Resolutions)
            Row(
                verticalAlignment = Alignment.CenterVertically // Aligns text and quality tags properly
            ) {
                // Year (Larger Text)
                Text(
                    text = "2023",
                    color = if (isDarkMode) Color.White else Color.Black,
                    style = MaterialTheme.typography.headlineSmall // Makes "2023" larger
                )

                Spacer(modifier = Modifier.width(4.dp)) // Small space

                // Quality Options (720p & 1080p with Background)
                QualityTag(text = "720p")
                Spacer(modifier = Modifier.width(4.dp)) // Small space
                QualityTag(text = "1080p")
            }
        }

        // Play and Download Buttons
        Row(
            horizontalArrangement = Arrangement.Center, // Centers buttons in the row
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { /* Play button action */ },
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                , // 80% of the parent width
                shape = RoundedCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isDarkMode) Color.White else Color.Black,
                    contentColor = if (isDarkMode) Color.Black else Color.White
                )
            ) {
                Icon(
                    imageVector = Icons.Default.PlayArrow, // Built-in play icon
                    contentDescription = "Play",
                    modifier = Modifier.size(25.dp) // Adjust icon size
                )
                Text(
                    text = "Play",
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Row(
            horizontalArrangement = Arrangement.Center, // Centers buttons in the row
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { /* Download button action */ },
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                , // 80% of the parent width
                shape = RoundedCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isDarkMode) Color.White else Color.Black,
                    contentColor = if (isDarkMode) Color.Black else Color.White
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Download, // Built-in download icon
                    contentDescription = "Download",
                    modifier = Modifier.size(25.dp) // Adjust icon size
                )
                Text(
                    text = "Download",
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Movie Story
        Text(
            text = "Ein Hochzeitsplaner will mit einer Traumhochzeit in einem malerischen Schloss seine Tätigkeit beenden, doch nicht nur die Vorbereitungen laufen vollkommen aus dem Ruder.",
            color = if (isDarkMode) Color.White else Color.Black,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(10.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Add to Watch List Button
        Button(
            onClick = { isWatchListAdded = !isWatchListAdded},
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(0.5f),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)

        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    imageVector = Icons.Default.Add, // Built-in add icon
                    contentDescription = "Watch List",
                    tint = if (isDarkMode) Color.White else Color.Black,
                    modifier = Modifier.size(40.dp)
                )
                Text(
                    text = if (isWatchListAdded) "Watched List" else "Watch List",
                    color = if (isDarkMode) Color.White else Color.Black
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Bottom Navigation with Icons
        BottomNavigationBar(isDarkMode = isDarkMode)

        // Dark Mode Toggle Button
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { isDarkMode = !isDarkMode },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(0.6f)
            ) {

                Text(
                    text = if (isDarkMode) "Switch to Light Mode" else "Switch to Dark Mode",
                    color = if (isDarkMode) Color.White else Color.Black
                )
            }
        }
    }
}

@Composable
fun BottomNavigationBar(isDarkMode: Boolean) {

    Row(
        horizontalArrangement = Arrangement.SpaceEvenly, // Distributes evenly
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
    ) {
        BottomNavIcon(icon = Icons.Default.PlayArrow, label = "Browser", isDarkMode = isDarkMode, modifier = Modifier.weight(1f))
        BottomNavIcon(icon = Icons.Default.List, label = "Watch List", isDarkMode = isDarkMode, modifier = Modifier.weight(1f))
        BottomNavIcon(icon = Icons.Default.Download, label = "Downloads", isDarkMode = isDarkMode, modifier = Modifier.weight(1f))
        BottomNavIcon(icon = Icons.Default.Search, label = "Search", isDarkMode = isDarkMode, modifier = Modifier.weight(1f))
    }
}

@Composable
fun BottomNavIcon(icon: ImageVector, label: String, isDarkMode: Boolean, modifier: Modifier = Modifier) {
    val textColor = if (isDarkMode) Color.White else Color.Black
    val iconTint = if (isDarkMode) Color.White else Color.Black

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier // Uses weight to distribute evenly
    ) {
        Icon(
            imageVector = icon,
            contentDescription = label,
            tint = iconTint, // White icon color in dark mode, black otherwise
            modifier = Modifier.size(32.dp)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = label,
            color = textColor, // White text color in dark mode, black otherwise
            style = MaterialTheme.typography.bodySmall
        )
    }
}
@Composable
fun QualityTag(text: String) {
    Text(
        text = text,
        color = Color.Black, // Text color
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier
            .background(Color(0xFF808080), shape = RoundedCornerShape(0.dp)) // White background with rounded corners
            .padding(horizontal = 7.dp, vertical = 3.dp) // Padding inside the tag
    )
}

@Preview(showBackground = true)
@Composable
fun MovieDetailsScreenPreview() {
    Week1_AssignmentTheme {
        MovieDetailsScreen()
    }
}
