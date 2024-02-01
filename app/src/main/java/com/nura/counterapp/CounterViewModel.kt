package com.nura.counterapp

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf

@Composable
fun NoteFormScreen(){
    var noteContent by remember{ mutableStateOf("")
    Column (
        modifier:Modifier,
        vertical arrangement

        )
    }
    }

}