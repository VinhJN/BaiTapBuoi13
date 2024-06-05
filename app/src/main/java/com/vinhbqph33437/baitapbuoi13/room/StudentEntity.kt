package com.vinhbqph33437.baitapbuoi13.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class StudentEntity(
    @PrimaryKey(autoGenerate = true) var uid: Int = 0,
    @ColumnInfo(name = "hoten") var hoten: String?,
    @ColumnInfo(name = "mssv") var mssv: String?,
    @ColumnInfo(name = "diemTB") var diemTB: String?,
    @ColumnInfo(name = "daratruong") var daratruong: String?
)
