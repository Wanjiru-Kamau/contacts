package com.njiruk.contactsrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.njiruk.contactsrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contacts=Contacts("sakinah","saki@gmail.com","0724266263","nairobi","")
        var contacts1=Contacts("Renee","renee@gmail.com","0724245333","ruai","")
        var contacts2=Contacts("juma","juma@gmail.com","0724873767263","langata","")
        var contacts3=Contacts("mellon","mellon@gmail.com","0735266263","dago","")
        var contactlist= listOf(contacts,contacts1,contacts2,contacts3)

        var contactAdapter=ContactRvAdapter(contactlist)
        binding.rvcontacts.layoutManager=LinearLayoutManager(this)
        binding.rvcontacts.adapter = contactAdapter

    }
}