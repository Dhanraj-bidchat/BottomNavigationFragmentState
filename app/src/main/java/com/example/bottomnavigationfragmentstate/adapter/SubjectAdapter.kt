package com.example.bottomnavigationfragmentstate.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bottomnavigationfragmentstate.R
import com.example.bottomnavigationfragmentstate.model.Subject


class SubjectAdapter(subjects: ArrayList<Subject>, context: Context) :
    RecyclerView.Adapter<SubjectAdapter.ViewHolder>() {
    var subjects: ArrayList<Subject>
    private val context: Context
    private val layoutInflater: LayoutInflater

    init {
        this.subjects = subjects
        this.context = context
        layoutInflater = LayoutInflater.from(context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = layoutInflater.inflate(R.layout.single_subject, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.recyclerView.adapter = ChapterAdapter(context, subjects[position].chapters)
        holder.recyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        holder.recyclerView.setHasFixedSize(true)
        holder.tvHeading.setText(subjects[position].subjectName)
    }

    override fun getItemCount(): Int {
        return subjects.size
    }



    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var recyclerView: RecyclerView
        var tvHeading: TextView

        init {
            recyclerView = itemView.findViewById<View>(R.id.rvChapters) as RecyclerView
//            recyclerView.isNestedScrollingEnabled = false
            tvHeading = itemView.findViewById<View>(R.id.tvSubjectName) as TextView
        }
    }
}