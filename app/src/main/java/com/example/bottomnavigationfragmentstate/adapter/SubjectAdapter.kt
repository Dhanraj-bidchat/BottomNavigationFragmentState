package com.example.bottomnavigationfragmentstate.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bottomnavigationfragmentstate.R
import com.example.bottomnavigationfragmentstate.databinding.ItemBrandsBinding
import com.example.bottomnavigationfragmentstate.databinding.ItemBrowseMenuBinding
import com.example.bottomnavigationfragmentstate.databinding.ItemCategoriesBinding
import com.example.bottomnavigationfragmentstate.databinding.SingleSubjectBinding
import com.example.bottomnavigationfragmentstate.model.Subject


class SubjectAdapter(subjects: ArrayList<Subject>, context: Context) :
//    RecyclerView.Adapter<SubjectAdapter.ViewHolder>()
    RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    var subjects: ArrayList<Subject>
    private val context: Context
    private val layoutInflater: LayoutInflater

    companion object {
        const val VIEW_TYPE_CATEGORY = 1
        const val VIEW_TYPE_BRANDS = 2
        const val VIEW_TYPE_MENU = 3
        const val VIEW_TYPE_ALL_CATEGORY = 4
    }

    init {
        this.subjects = subjects
        this.context = context
        layoutInflater = LayoutInflater.from(context)
    }

    private inner class PopularCatVH(itemVH: View) : RecyclerView.ViewHolder(itemVH) {
        val binding = ItemCategoriesBinding.bind(itemView)

        fun bind(position: Int) {

        }
    }

    private inner class BrandsVH(itemVH: View) : RecyclerView.ViewHolder(itemVH) {
        val binding = ItemBrandsBinding.bind(itemView)

        fun bind(position: Int) {

        }
    }

    private inner class MenuVH(itemVH: View) : RecyclerView.ViewHolder(itemVH) {
        val binding = ItemBrowseMenuBinding.bind(itemView)

        fun bind(position: Int) {

        }
    }

    private inner class AllCategoryVH(itemVH: View) : RecyclerView.ViewHolder(itemVH) {
        val binding = SingleSubjectBinding.bind(itemView)

        fun bind(position: Int) {
            binding.rvChapters
            binding.rvChapters.adapter = ChapterAdapter(context, subjects[position].chapters)
            binding.rvChapters.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
//            binding.rvChapters.setHasFixedSize(true)
            binding.tvSubjectName.setText(subjects[position].subjectName)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        if(viewType == VIEW_TYPE_CATEGORY){
            return PopularCatVH(
                LayoutInflater.from(context).inflate(R.layout.item_categories, parent, false)
            )
        } else if(viewType == VIEW_TYPE_BRANDS) {
            return BrandsVH(
                LayoutInflater.from(context).inflate(R.layout.item_brands, parent, false)
            )
        } else if(viewType == VIEW_TYPE_MENU) {
            return MenuVH(
                LayoutInflater.from(context).inflate(R.layout.item_browse_menu, parent, false)
            )
        }else{ //viewType == VIEW_TYPE_ALL_CATEGORY
            return AllCategoryVH(
                LayoutInflater.from(context).inflate(R.layout.single_subject, parent, false)
            )
        }

//        val view: View = layoutInflater.inflate(R.layout.single_subject, parent, false)
//        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder) {
            is PopularCatVH -> {
                holder.bind(position)
            }
            is BrandsVH -> {
                holder.bind(position)
            }
            is MenuVH -> {
                holder.bind(position)
            }
            is AllCategoryVH -> {
                holder.bind(position)
            }
            else -> {
//                holder.bind(position)
            }
        }

//        holder.recyclerView.adapter = ChapterAdapter(context, subjects[position].chapters)
//        holder.recyclerView.layoutManager =
//            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
//        holder.recyclerView.setHasFixedSize(true)
//        holder.tvHeading.setText(subjects[position].subjectName)
    }

    override fun getItemCount(): Int {
        return subjects.size
    }

    override fun getItemViewType(position: Int): Int {
//        return super.getItemViewType(position)
        if(subjects[position].viewType == 1) {
           return VIEW_TYPE_CATEGORY
        } else if(subjects[position].viewType == 2) {
            return VIEW_TYPE_BRANDS
        }else if(subjects[position].viewType == 2) {
            return VIEW_TYPE_MENU
        }
        return  VIEW_TYPE_ALL_CATEGORY

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