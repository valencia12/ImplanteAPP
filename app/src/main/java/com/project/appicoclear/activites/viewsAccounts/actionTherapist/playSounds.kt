package com.project.appicoclear.activites.viewsAccounts.actionTherapist

import android.media.MediaPlayer
import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.project.appicoclear.R
import kotlinx.android.synthetic.main.activity_play_sounds.*

class playSounds : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_sounds)


        play_1.setOnTouchListener() {_,event ->
            handleTouch(event)
            true
        }
        play_2.setOnTouchListener() {_,event1 ->
            handleTouch1(event1)
            true
        }
        play_3.setOnTouchListener() {_,event2 ->
            handleTouch2(event2)
            true
        }
        play_4.setOnTouchListener() {_,event3 ->
            handleTouch3(event3)
            true
        }
        play_5.setOnTouchListener() {_,event4 ->
            handleTouch4(event4)
            true
        }
        play_6.setOnTouchListener() {_,event5 ->
            handleTouch5(event5)
            true
        }

    }

    private fun handleTouch(event:MotionEvent){
        mediaPlayer = MediaPlayer.create(this,R.raw.guepardo)
        mediaPlayer?.setOnPreparedListener{
            println("Ready to go")
        }
        when(event.action){
            MotionEvent.ACTION_DOWN ->{
                println("down")
                mediaPlayer?.start()
            }
            MotionEvent.ACTION_CANCEL, MotionEvent.ACTION_UP ->{
                println("up or cancel")
                mediaPlayer?.pause()
                mediaPlayer?.seekTo(0)
            }
            else ->{
                println("other")
            }
        }
    }
    private fun handleTouch1(event1:MotionEvent){
        mediaPlayer = MediaPlayer.create(this,R.raw.leon)
        mediaPlayer?.setOnPreparedListener{
            println("Ready to go")
        }
        when(event1.action){
            MotionEvent.ACTION_DOWN ->{
                println("down")
                mediaPlayer?.start()
            }
            MotionEvent.ACTION_CANCEL, MotionEvent.ACTION_UP ->{
                println("up or cancel")
                mediaPlayer?.pause()
                mediaPlayer?.seekTo(0)
            }
            else ->{
                println("other")
            }
        }
    }
    private fun handleTouch2(event2:MotionEvent){
        mediaPlayer = MediaPlayer.create(this,R.raw.mono)
        mediaPlayer?.setOnPreparedListener{
            println("Ready to go")
        }
        when(event2.action){
            MotionEvent.ACTION_DOWN ->{
                println("down")
                mediaPlayer?.start()
            }
            MotionEvent.ACTION_CANCEL, MotionEvent.ACTION_UP ->{
                println("up or cancel")
                mediaPlayer?.pause()
                mediaPlayer?.seekTo(0)
            }
            else ->{
                println("other")
            }
        }
    }
    private fun handleTouch3(event3:MotionEvent){
        mediaPlayer = MediaPlayer.create(this,R.raw.oso)
        mediaPlayer?.setOnPreparedListener{
            println("Ready to go")
        }
        when(event3.action){
            MotionEvent.ACTION_DOWN ->{
                println("down")
                mediaPlayer?.start()
            }
            MotionEvent.ACTION_CANCEL, MotionEvent.ACTION_UP ->{
                println("up or cancel")
                mediaPlayer?.pause()
                mediaPlayer?.seekTo(0)
            }
            else ->{
                println("other")
            }
        }
    }
    private fun handleTouch4(event4:MotionEvent){
        mediaPlayer = MediaPlayer.create(this,R.raw.perro)
        mediaPlayer?.setOnPreparedListener{
            println("Ready to go")
        }
        when(event4.action){
            MotionEvent.ACTION_DOWN ->{
                println("down")
                mediaPlayer?.start()
            }
            MotionEvent.ACTION_CANCEL, MotionEvent.ACTION_UP ->{
                println("up or cancel")
                mediaPlayer?.pause()
                mediaPlayer?.seekTo(0)
            }
            else ->{
                println("other")
            }
        }
    }
    private fun handleTouch5(event5:MotionEvent){
        mediaPlayer = MediaPlayer.create(this,R.raw.puma)
        mediaPlayer?.setOnPreparedListener{
            println("Ready to go")
        }
        when(event5.action){
            MotionEvent.ACTION_DOWN ->{
                println("down")
                mediaPlayer?.start()
            }
            MotionEvent.ACTION_CANCEL, MotionEvent.ACTION_UP ->{
                println("up or cancel")
                mediaPlayer?.pause()
                mediaPlayer?.seekTo(0)
            }
            else ->{
                println("other")
            }
        }
    }

}

