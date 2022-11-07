package com.tomaslab.appgermantanks.domain

import com.tomaslab.appgermantanks.model.DataModel

class GetData {

    // Function load content in fragment_content.xml
    fun showContent(): DataModel{

        //Test data
        return DataModel(title = "TITLE",
                        image1 = "img1",
                        image2 = "img2",
                        image3 = "img3",
                        content1 = "content")
    }

}