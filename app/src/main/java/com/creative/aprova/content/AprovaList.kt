package com.creative.aprova.content

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.creative.aprova.model.Aprovas




@Composable
fun AprovaList(
    aprovaData: List<Aprovas>,
    modifier: Modifier = Modifier
) {
//    val list by remember {
//        mutableListOf(aprovaData)
//    }
    val ss by remember {
        mutableStateOf(aprovaData)
    }

    LazyColumn (
        modifier= Modifier.fillMaxSize(),
        state = rememberLazyListState()
    ){
        itemsIndexed(
            items = ss,
            key = { index, item -> item.id },
            contentType = { index, item -> item::class }
        ) {index, item ->
            Aprova(aprovas = item)
        }
    }
}


