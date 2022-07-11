package dev.lucy.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import dev.lucy.twitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        DisplayTweets()
    }

    fun DisplayTweets() {
        val tweet1 = Twitter("Lucy", "luciahkei101", 22, "", "", 33, "", 90, "", "")
        val tweet2 = Twitter("Kirinyet", "luciahkei101", 22, "", "", 33, "", 90, "Dating a Kenyan girl is like dating an orphan", "")
        val tweet3 = Twitter("Lucy", "luciahkei101", 22, "", "", 33, "", 90, "I am proud of myself for passing my bar exams", "")
        val tweet4 = Twitter("Lucy", "luciahkei101", 22, "", "", 33, "", 90, "Only in Nairobi and Kampala airports are traveller's forced  to disembard from their cars for security checks ? Whats the logic for this American Requirement? BTW, why  is  this not applied in US airports?", "")
        val tweet5 = Twitter("Lucy", "luciahkei101", 22, "", "", 33, "", 90, "Another day to remind you: \"It's important to know what you want as a human being...Each brand I associate with it has to be of mutual benefit, doesn't have to be a big brand but there vision must align with mine\" ", "")
        val tweet6 = Twitter("Lucy", "luciahkei101", 22, "", "", 33, "", 90, "", "")
        val tweetList = listOf(tweet1, tweet2, tweet3, tweet6, tweet4, tweet5)
        var twitterAdapter = TwitterAdapter(tweetList)
        binding.rvtweets.layoutManager = LinearLayoutManager(this)
        binding.rvtweets.adapter=twitterAdapter

    }
}