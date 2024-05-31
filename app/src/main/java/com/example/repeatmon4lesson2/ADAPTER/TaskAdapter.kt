package com.example.repeatmon4lesson2.ADAPTER

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.repeatmon4lesson2.databinding.ItemTaskBinding
import com.example.repeatmon4lesson2.models.Task

class TaskAdapter : ListAdapter<Task, TaskAdapter.TaskViewHolder>(DiffUtil_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder(
            ItemTaskBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class TaskViewHolder(private val binding: ItemTaskBinding) : ViewHolder(binding.root) {
        fun bind(task: Task) {
            binding.tvTitle.text = task.title

        }

    }

    companion object {
        val DiffUtil_CALLBACK = object : DiffUtil.ItemCallback<Task>() {
            override fun areItemsTheSame(oldItem: Task, newItem: Task) = oldItem.id == newItem.id
            //изменилось или добавилось в список что та

            override fun areContentsTheSame(oldItem: Task, newItem: Task): Boolean {
                return oldItem == newItem

                // мы сравниваем что та изменилось в title внутри значение
                //  oldItem.title == newItem.title
            }

        }
    }


}