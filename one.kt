package com.example.mypractice

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun one(navController: NavHostController) {

    val alldataitems = alldataitems()
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ) {
        itemsIndexed(alldataitems) { index, item ->
            allItems(
                onItemClick = { navController.navigate("two/${item.image}/${item.title}/${item.description}/${item.size}") },
                item = item
            )
        }
    }
}

@Composable
fun allItems(onItemClick: (alldata) -> Unit, item: alldata) {

    Row(
        Modifier
            .fillMaxWidth()
            .clickable { onItemClick(item) }
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = item.image),
            contentDescription = "Image",
            modifier = Modifier
                .aspectRatio(16 / 9f)
                .weight(1f)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(2f)) {
            Text(
                text = item.title,
                fontSize = 26.sp,
                fontWeight = FontWeight.W600,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = item.description,
                fontSize = 20.sp,
                fontWeight = FontWeight.W300,
                maxLines = 2,
                modifier = Modifier
            )
        }
    }
}






























