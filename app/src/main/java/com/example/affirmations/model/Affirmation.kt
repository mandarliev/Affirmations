package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// The Affirmation class is created in a new package called model, hence the name above (package com.example.affirmations.model).
// This makes the code more organized and more readable.
// Here is the defined the class Affirmation which we'll instantiate for the RecyclerView.

data class Affirmation (@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int) {


}