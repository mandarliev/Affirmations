package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

// The data package is created in order to separate the data, which itself could be fetched from the internet/other network, from other parts of the code
// Here we will use all the images/resources that will be fetched
class Datasource {

    /*
    This functions needs to return a list of Affirmations
     */
    fun loadAffirmations(): List<Affirmation> {

        return listOf<Affirmation>(
        Affirmation(R.string.affirmation1, R.drawable.image1),
        Affirmation(R.string.affirmation2, R.drawable.image2),
        Affirmation(R.string.affirmation3, R.drawable.image3),
        Affirmation(R.string.affirmation4, R.drawable.image4),
        Affirmation(R.string.affirmation5, R.drawable.image5),
        Affirmation(R.string.affirmation6, R.drawable.image6),
        Affirmation(R.string.affirmation7, R.drawable.image7),
        Affirmation(R.string.affirmation8, R.drawable.image8),
        Affirmation(R.string.affirmation9, R.drawable.image9),
        Affirmation(R.string.affirmation10, R.drawable.image10)
        )
    }
}