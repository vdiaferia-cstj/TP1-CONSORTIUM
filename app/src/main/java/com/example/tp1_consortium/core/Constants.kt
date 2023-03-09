package com.example.tp1_consortium.core

import android.content.Context
import android.preference.Preference
import android.provider.ContactsContract.Data
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore


val Context.dataStore : DataStore<Preference> by preferencesDataStore(name = "")