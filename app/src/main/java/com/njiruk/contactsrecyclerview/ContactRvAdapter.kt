package com.njiruk.contactsrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.njiruk.contactsrecyclerview.databinding.ContactListBinding
import com.squareup.picasso.Picasso

class ContactRvAdapter(var contact_list: List<Contacts>) :
    RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding = ContactListBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {

        var currentContact = contact_list.get(position)
        holder.binding.tvnames.text = currentContact.name
        holder.binding.tvnumber.text = currentContact.phoneNumber
        holder.binding.tvemail.text = currentContact.email
        holder.binding.tvaddress.text = currentContact.address
        Picasso.get()
            .load(currentContact.image)
            .resize(300, 300)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_person_24)
            .into(holder.binding.imgName)


    }

    override fun getItemCount(): Int {
        return contact_list.size
    }

}


class ContactViewHolder(val binding: ContactListBinding) : RecyclerView.ViewHolder(binding.root)
