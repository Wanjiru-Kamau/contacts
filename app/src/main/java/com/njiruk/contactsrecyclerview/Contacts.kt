package com.njiruk.contactsrecyclerview

import android.media.Image
import android.provider.ContactsContract
import java.net.Inet4Address

data class Contacts(
    var name: String,
    var email: String,
    var phoneNumber: String,
    var address: String,
    var image: String
)
