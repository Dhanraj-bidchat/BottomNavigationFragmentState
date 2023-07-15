package com.example.bottomnavigationfragmentstate.model

data class Subject(
    val id: Int,
    val subjectName: String,
    val chapters: ArrayList<Chapter>,
    val viewType : Int? = null
)
