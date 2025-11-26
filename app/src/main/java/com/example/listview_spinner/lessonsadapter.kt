package com.example.listview_spinner

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView


class LessonsAdapter(
    private val context: Context,
    private val data: ArrayList<Lesson>
) : RecyclerView.Adapter<LessonsAdapter.LessonViewHolder>() {

    class LessonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.tvTitle)
        val desc: TextView = itemView.findViewById(R.id.tvDesc)
        val img: ImageView = itemView.findViewById(R.id.imgLesson)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.lessonitem, parent, false)
        return LessonViewHolder(view)
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        val lesson = data[position]
        holder.title.text = lesson.title
        holder.desc.text = lesson.decription
        holder.img.setImageResource(lesson.imagView)
        holder.itemView.setOnClickListener {
            val intent = Intent(context, LessonDetailActivity::class.java)
            intent.putExtra("title", lesson.title)

            intent.putExtra("description2", lesson.decription2)
            intent.putExtra("imageRes", lesson.imagView)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}