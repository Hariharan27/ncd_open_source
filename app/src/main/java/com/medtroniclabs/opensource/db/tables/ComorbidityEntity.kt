package com.medtroniclabs.opensource.db.tables

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "comorbidity")
data class ComorbidityEntity(
    @PrimaryKey
    @SerializedName("id")
    val _id: Long,
    @ColumnInfo(name = "display_order")
    val displayOrder: Int,
    @SerializedName("name")
    val comorbidity: String,
    @ColumnInfo(name = "culture_value")
    val cultureValue: String ?= null

)