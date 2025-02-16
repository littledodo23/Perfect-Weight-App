# Perfect-Weight-App
 12th grade project ,Perfect Weight App is an Android application that helps users calculate their Body Mass Index (BMI) and determine their weight category. It also includes a note-taking feature for users to record important health-related notes. Notifications are triggered based on BMI results.

## Features

BMI Calculation: Users input height and weight to get their BMI.

Weight Classification: The app categorizes the result into underweight, normal weight, overweight, or obese.

Notifications: Sends an alert based on the BMI result.

Note-Taking Feature: Users can add and manage health-related notes.

Fragment-Based UI: Uses separate fragments for BMI calculation and notes.

## Technologies Used

Kotlin (Android development language)

Android SDK

Fragments for UI modularity

Notifications (NotificationManager, NotificationChannel)

AlertDialog for input prompts

## UI Design

Main Activity (activity_main.xml): Allows switching between BMI calculation and note-taking fragments.

Perfect Weight Fragment (fragment_perfect_weight.xml): Handles BMI calculation and notifications.

Note Dialog Fragment (fragment_note_dialog.xml): Manages user notes with a dialog-based interface.

Dialog Layout (dialog.xml): Provides an input field for adding notes.
