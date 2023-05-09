/*
 * Copyright 2023 Google LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.wallet.button

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class ButtonType(val resourceId: Int, val width: Dp) {
    Add(R.drawable.add_to_googlewallet_button_content, 280.dp),
    AddCondensed(R.drawable.badge_add_to_googlewallet_button_content, 240.dp),
}

@Composable
fun WalletButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    type: ButtonType = ButtonType.Add,
) {
    Box(
        modifier = modifier
            .padding(8.dp)
            .width(type.width)
            .height(48.dp)
            .clip( RoundedCornerShape(24.dp) )
            .background(Color(0xFF1F1F1F))
            .clickable { onClick() }
    ) {
        Image(
            alignment = Alignment.Center,
            contentScale = ContentScale.None,
            modifier = modifier.fillMaxSize(),
            painter = painterResource(id = type.resourceId),
            contentDescription = null,
        )
    }
}