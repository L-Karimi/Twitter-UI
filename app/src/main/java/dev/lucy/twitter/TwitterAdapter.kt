package dev.lucy.twitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterAdapter(var tweetList: List<Twitter>) :
    RecyclerView.Adapter<TwitterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
        var intemview = LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_list_items, parent, false)
        return TwitterViewHolder(intemview)
    }


    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currentTwitter = tweetList.get(position)
        holder.tvHandle.text=currentTwitter.handle
        holder.tvTweetcount.text=currentTwitter.tweet
        holder.tvUsername.text=currentTwitter.username
        holder.tvTweetcount.text=currentTwitter.tvTweetcount.toString()
        holder.tvCommentcount.text=currentTwitter.commentCount.toString()
        holder.tvLikecount.text=currentTwitter.likeCount.toString()


    }

    override fun getItemCount(): Int {
        return tweetList.size
    }
}

class TwitterViewHolder(itemview: View) :
    RecyclerView.ViewHolder(itemview) {

    var imgAvatar = itemview.findViewById<ImageView>(R.id.imgAvatar)
    var tvUsername = itemview.findViewById<TextView>(R.id.tvusername)
    var tvHandle = itemview.findViewById<TextView>(R.id.tvHandle)
    var tvTweet = itemview.findViewById<TextView>(R.id.tvTweet)
    var imgRetweet = itemview.findViewById<ImageView>(R.id.imgRetweet)
    var tvTweetcount = itemview.findViewById<TextView>(R.id.tvTweetcount)
    var imgComment = itemview.findViewById<ImageView>(R.id.imgComment)
    var tvCommentcount = itemview.findViewById<TextView>(R.id.tvCommentcount)
    var imgLike = itemview.findViewById<ImageView>(R.id.imgLike)
    var tvLikecount = itemview.findViewById<TextView>(R.id.tvLikecount)
    var imgShare = itemview.findViewById<ImageView>(R.id.imgShare)

}
