package com.example.jfbapps

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

//Nama        : Dini Yuliani ;
//NIM         : 10121905 ;
//Kelas       : IF9K ;
//Mata Kuliah : Pemrograman Android ;
//Dosen       : Rizki Adam Kurniawan S.Kom., M.Kom. ;
//Selesai     : 22 Agustus 2024. 22:00 ;

class JobDetailActivity : AppCompatActivity() {

    private lateinit var jobTitleTextView: TextView
    private lateinit var jobDescTextView: TextView
    private lateinit var jobLocationTextView: TextView
    private lateinit var jobInformationTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_detail)

        jobTitleTextView = findViewById(R.id.jobTitleTextView)
        jobDescTextView = findViewById(R.id.jobDescTextView)
        jobLocationTextView = findViewById(R.id.jobLocationTextView)
        jobInformationTextView = findViewById(R.id.jobInformationTextView)

        val jobTitle = intent.getStringExtra("jobTitle")
        val jobDetails = intent.getStringExtra("jobDetails")
        val jobLocation = intent.getStringExtra("jobLocation")
        val jobInformation = intent.getStringExtra("jobInformation")

        jobTitleTextView.text = jobTitle
        jobDescTextView.text = jobDetails
        jobLocationTextView.text = jobLocation
        jobInformationTextView.text = jobInformation
    }
}
