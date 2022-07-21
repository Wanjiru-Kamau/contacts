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
        var contacts=Contacts("sakinah","saki@gmail.com","0724266263","nairobi","https://images.unsplash.com/photo-1583994009785-37ec30bf9342?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contacts1=Contacts("Renee","renee@gmail.com","0724245333","ruai","https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contacts2=Contacts("juma","juma@gmail.com","0724873767263","langata","https://images.unsplash.com/photo-1507152832244-10d45c7eda57?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTd8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contacts3=Contacts("mellon","mellon@gmail.com","0735266263","dago","https://media.istockphoto.com/photos/headshot-of-mature-black-woman-walking-on-city-street-picture-id1364683713?b=1&k=20&m=1364683713&s=170667a&w=0&h=rHN6wZG4STOTU3BpbcHyPDELoHFuTS63hbnWt47f7zc=")
        var contactlist= listOf(contacts,contacts1,contacts2,contacts3)

        var contactAdapter=ContactRvAdapter(contactlist)
        binding.rvcontacts.layoutManager=LinearLayoutManager(this)
        binding.rvcontacts.adapter = contactAdapter

    }
}