
package com.sonifadhilah0132.mobpro1.util

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import kotlinx.coroutines.flow.map

val Context.dataStores : DataStore<Preferences> by preferencesDataStore(
    name = "settings_preference"
)

class SettingsDataStore(private val context: Context) {

    companion object {
        private val IS_LIST = booleanPreferencesKey("is_list")
    }

    val layoutFlow: Flow<Boolean> = context.dataStores.data.map { preferences ->
        preferences[IS_LIST] ?: true
    }

    suspend fun saveLayout(isList: Boolean) {
        context.dataStores.edit { preferences ->
            preferences[IS_LIST] = isList
        }
    }
}
