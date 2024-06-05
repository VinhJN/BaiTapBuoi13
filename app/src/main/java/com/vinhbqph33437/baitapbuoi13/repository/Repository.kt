package com.vinhbqph33437.baitapbuoi13.repository

import com.vinhbqph33437.baitapbuoi13.room.StudentEntity
import com.vinhbqph33437.baitapbuoi13.room.StudentsDB

class Repository(val studentsDB: StudentsDB) {
    suspend fun addStudentToRoom(studentEntity: StudentEntity){
        studentsDB.studentDao().addStudent(studentEntity)
    }

    fun getAllStudents() = studentsDB.studentDao().getALlStudents()

    suspend fun deleteStudentFromRoom(studentEntity: StudentEntity) {
        studentsDB.studentDao().deleteStudent(studentEntity)
    }

    suspend fun updateStudent(studentEntity: StudentEntity){
        studentsDB.studentDao().updateStudent(studentEntity)
    }
}