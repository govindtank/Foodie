package com.foodie.data.model.detail

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Lists {

    @SerializedName("groups")
    @Expose
    var groups: List<Group_>? = null
}
