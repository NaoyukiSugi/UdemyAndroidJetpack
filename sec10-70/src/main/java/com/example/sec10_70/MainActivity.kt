package com.example.sec10_70

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import kotlinx.android.synthetic.main.activity_main.text_view
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var retService: AlbumService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        retService = RetrofitInstance
            .getRetrofitInstance()
            .create(AlbumService::class.java)
        getRequestWithQueryParameters()
        getRequestWithPathParameters()
    }

    private fun getRequestWithQueryParameters() {
        val responseLiveData: LiveData<Response<Albums>> = liveData {
            val response = retService.getSortedAlbums(3)
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

    private fun getRequestWithPathParameters() {
        // path parameter example
        val pathResponse: LiveData<Response<AlbumsItem>> = liveData {
            val response: Response<AlbumsItem> = retService.getAlbum(3)
            emit(response)
        }
        pathResponse.observe(this, Observer {
            val title = it.body()?.title
            Toast.makeText(applicationContext, title, Toast.LENGTH_LONG).show()
        })
    }
}
