package com.example.bottomnavigationfragmentstate.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bottomnavigationfragmentstate.R
import com.example.bottomnavigationfragmentstate.model.Chapter
import com.squareup.picasso.Picasso


class ChapterAdapter(private val context: Context, private val chapters: ArrayList<Chapter>) :
    RecyclerView.Adapter<ChapterAdapter.CustomViewHolder>() {
    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view: View = inflater.inflate(R.layout.single_chapter, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val (_, chapterName, imageUrl) = chapters[position]
        holder.tvChapterName.text = chapterName
        Picasso.get().load(imageUrl).into(holder.ivChapter)
    }

    override fun getItemCount(): Int {
        return chapters.size
    }

    inner class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivChapter: ImageView
        var tvChapterName: TextView

        init {
            tvChapterName = itemView.findViewById<View>(R.id.tvChapterName) as TextView
            ivChapter = itemView.findViewById<View>(R.id.ivChapter) as ImageView
        }
    }
}