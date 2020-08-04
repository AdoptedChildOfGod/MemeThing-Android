package com.shannon.memething

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setUpViews()
    }

    fun setUpViews() {
        title = "Profile"

        profileEmailLabel.text = "Email: ${UserController.currentUser?.email}"
        profileScreenNameLabel.text = "Screen Name: ${UserController.currentUser?.screenName}"
        profilePointsLabel.text = "Points: ${UserController.currentUser?.points}"
    }

    fun editProfilePhotoButtonTapped(view: View) {

    }

    fun resetPasswordButtonTapped(view: View) {

    }

    fun editScreenNameButtonTapped(view: View) {

    }

    fun pointsInfoButtonTapped(view: View) {

    }

    fun deleteAccountButtonTapped(view: View) {

    }

    fun signOutButtonTapped(view: View) {

    }
}