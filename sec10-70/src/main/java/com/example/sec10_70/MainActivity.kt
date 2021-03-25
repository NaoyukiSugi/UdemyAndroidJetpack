package com.example.sec10_70

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val retService = RetrofitInstance
            .getRetrofitInstance()
            .create(AlbumService::class.java)
        val responseLiveData: LiveData<Response<Albums>> = liveData {
            val response = retService.getAlbums()
            emit(response)
        }
        responseLiveData.observe(this, Observer {
            val albums = it.body()?.listIterator()
            if (albums != null) {
                while (albums.hasNext()) {
                    val albumsItem = albums.next()
                    val result = " " + "Album Title: ${albumsItem.title}" + "\n" +
                            " " + "Album ID: ${albumsItem.id}" + "\n" +
                            " " + "User ID: ${albumsItem.userId}" + "\n\n\n"
                    text_view.append(result)
                }
            }
        })
    }
}
