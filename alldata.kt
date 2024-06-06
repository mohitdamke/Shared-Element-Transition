package com.example.mypractice

data class alldata(
    val image: Int,
    val title: String,
    val description: String,
    val size : Int
)

fun alldataitems(): List<alldata> {

    return listOf(
        alldata(
            R.drawable.image_2, "title 1", "description 1",23
        ),
        alldata(
            R.drawable.image_2, "title 1", "description 1",263
        ),
        alldata(
            R.drawable.image_2, "title 1", "description 1",236
        ),
        alldata(
            R.drawable.image_2, "title 1", "description 1",263
        ),
        alldata(
            R.drawable.image_2, "title 1", "description 1",2360
        ),
        alldata(
            R.drawable.image_2, "title 1", "description 1",263
        ),
        alldata(
            R.drawable.image_2, "title 1", "description 1",233
        ),
        alldata(
            R.drawable.image_2, "title 1", "description 1",243
        ),
        alldata(
            R.drawable.image_2, "title 1", "description 1", 232
        ),

    )
}
