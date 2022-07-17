package com.example.slidepuzzlev5

import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView5x5Row1()
        imageView5x5Row2()
        imageView5x5Row3()
        imageView5x5Row4()
        imageView5x5Row5()
        imageView4x4Row1()
        imageView4x4Row2()
        imageView4x4Row3()
        imageView4x4Row4()
        imageView3x3Row1()
        imageView3x3Row2()
        imageView3x3Row3()
        imageViewBunch()

    }

    private fun imageViewBunch() {

        button5x5.setOnClickListener() {

            tableLayoutBackgroud5x5.bringToFront()
            tableLayout5x5.bringToFront()

            viewClear()

            val myList = ArrayList((1..24).toList())
            myList.shuffle()
            textView1.text = myList[0].toString()
            textView2.text = myList[1].toString()
            textView3.text = myList[2].toString()
            textView4.text = myList[3].toString()
            textView5.text = myList[4].toString()
            textView6.text = myList[5].toString()
            textView7.text = myList[6].toString()
            textView8.text = myList[7].toString()
            textView9.text = myList[8].toString()
            textView10.text = myList[9].toString()
            textView11.text = myList[10].toString()
            textView12.text = myList[11].toString()
            textView13.text = myList[12].toString()
            textView14.text = myList[13].toString()
            textView15.text = myList[14].toString()
            textView16.text = myList[15].toString()
            textView17.text = myList[16].toString()
            textView18.text = myList[17].toString()
            textView19.text = myList[18].toString()
            textView20.text = myList[19].toString()
            textView21.text = myList[20].toString()
            textView22.text = myList[21].toString()
            textView23.text = myList[22].toString()
            textView24.text = myList[23].toString()
            textView25.text = ""

            when (textView1.text) {
                "1" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit1.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView2.text) {
                "1" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit2.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView3.text) {
                "1" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit3.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView4.text) {
                "1" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit4.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView5.text) {
                "1" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit5.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView6.text) {
                "1" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit6.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView7.text) {
                "1" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit7.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView8.text) {
                "1" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit8.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView9.text) {
                "1" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit9.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView10.text) {
                "1" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit10.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView11.text) {
                "1" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit11.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView12.text) {
                "1" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit12.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView13.text) {
                "1" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit13.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView14.text) {
                "1" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit14.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView15.text) {
                "1" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit15.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView16.text) {
                "1" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit16.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView17.text) {
                "1" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit17.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView18.text) {
                "1" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit18.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView19.text) {
                "1" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit19.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView20.text) {
                "1" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit20.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView21.text) {
                "1" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit21.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView22.text) {
                "1" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit22.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView23.text) {
                "1" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit23.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
            when (textView24.text) {
                "1" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
                "16" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_16
                        )
                    )
                }
                "17" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_17
                        )
                    )
                }
                "18" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_18
                        )
                    )
                }
                "19" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_19
                        )
                    )
                }
                "20" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_20
                        )
                    )
                }
                "21" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_21
                        )
                    )
                }
                "22" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_22
                        )
                    )
                }
                "23" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_23
                        )
                    )
                }
                "24" -> {
                    myImageViewSplit24.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_24
                        )
                    )
                }
            }
        }

        button4x4.setOnClickListener() {

            tableLayoutBackgroud4x4.bringToFront()
            tableLayout4x4.bringToFront()

            viewClear()

            val myList = ArrayList((1..15).toList())
            myList.shuffle()
            textView26.text = myList[0].toString()
            textView27.text = myList[1].toString()
            textView28.text = myList[2].toString()
            textView29.text = myList[3].toString()
            textView30.text = myList[4].toString()
            textView31.text = myList[5].toString()
            textView32.text = myList[6].toString()
            textView33.text = myList[7].toString()
            textView34.text = myList[8].toString()
            textView35.text = myList[9].toString()
            textView36.text = myList[10].toString()
            textView37.text = myList[11].toString()
            textView38.text = myList[12].toString()
            textView39.text = myList[13].toString()
            textView40.text = myList[14].toString()
            textView41.text = ""

            when (textView26.text) {
                "1" -> {
                    myImageViewSplit26.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit26.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit26.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit26.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit26.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit26.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit26.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit26.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit26.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit26.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit26.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit26.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit26.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit26.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit26.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_15
                        )
                    )
                }
            }
            when (textView27.text) {
                "1" -> {
                    myImageViewSplit27.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit27.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit27.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit27.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit27.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit27.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit27.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit27.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit27.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit27.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit27.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit27.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit27.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit27.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit27.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_15
                        )
                    )
                }
            }
            when (textView28.text) {
                "1" -> {
                    myImageViewSplit28.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit28.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit28.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit28.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit28.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit28.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit28.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit28.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit28.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit28.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit28.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit28.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit28.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit28.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit28.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_15
                        )
                    )
                }
            }
            when (textView29.text) {
                "1" -> {
                    myImageViewSplit29.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit29.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit29.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit29.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit29.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit29.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit29.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit29.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit29.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit29.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit29.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit29.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit29.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit29.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit29.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_15
                        )
                    )
                }
            }
            when (textView30.text) {
                "1" -> {
                    myImageViewSplit30.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit30.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit30.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit30.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit30.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit30.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit30.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit30.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit30.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit30.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit30.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit30.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit30.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit30.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit30.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_15
                        )
                    )
                }
            }
            when (textView31.text) {
                "1" -> {
                    myImageViewSplit31.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit31.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit31.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit31.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit31.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit31.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit31.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit31.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit31.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit31.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit31.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit31.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit31.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit31.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit31.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_15
                        )
                    )
                }
            }
            when (textView32.text) {
                "1" -> {
                    myImageViewSplit32.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit32.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit32.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit32.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit32.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit32.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit32.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit32.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit32.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit32.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit32.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit32.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit32.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit32.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit32.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_15
                        )
                    )
                }
            }
            when (textView33.text) {
                "1" -> {
                    myImageViewSplit33.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit33.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit33.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit33.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit33.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit33.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit33.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit33.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit33.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit33.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit33.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit33.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit33.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit33.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit33.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_15
                        )
                    )
                }
            }
            when (textView34.text) {
                "1" -> {
                    myImageViewSplit34.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit34.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit34.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit34.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit34.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit34.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit34.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit34.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit34.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit34.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit34.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit34.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit34.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit34.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit34.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_15
                        )
                    )
                }
            }
            when (textView35.text) {
                "1" -> {
                    myImageViewSplit35.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit35.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit35.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit35.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit35.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit35.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit35.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit35.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit35.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit35.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit35.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit35.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit35.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit35.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit35.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_15
                        )
                    )
                }
            }
            when (textView36.text) {
                "1" -> {
                    myImageViewSplit36.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_2
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit36.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit36.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit36.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit36.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit36.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit36.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit36.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit36.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit36.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit36.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit36.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit36.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit36.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit36.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_15
                        )
                    )
                }
            }
            when (textView37.text) {
                "1" -> {
                    myImageViewSplit37.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit37.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit37.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit37.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit37.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit37.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit37.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit37.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit37.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit37.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit37.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit37.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit37.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit37.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit37.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_15
                        )
                    )
                }
            }
            when (textView38.text) {
                "1" -> {
                    myImageViewSplit38.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit38.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit38.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit38.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit38.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit38.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit38.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit38.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit38.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit38.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit38.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit38.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit38.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit38.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit38.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut_15
                        )
                    )
                }
            }
            when (textView39.text) {
                "1" -> {
                    myImageViewSplit39.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit39.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit39.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit39.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit39.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit39.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit39.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit39.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit39.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit39.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit39.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit39.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit39.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit39.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit39.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_15
                        )
                    )
                }
            }
            when (textView40.text) {
                "1" -> {
                    myImageViewSplit40.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit40.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit40.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit40.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit40.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit40.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit40.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit40.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit40.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit40.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit40.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit40.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit40.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit40.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit40.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_15
                        )
                    )
                }
            }
            when (textView41.text) {
                "1" -> {
                    myImageViewSplit41.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit41.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit41.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit41.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit41.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit41.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit41.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit41.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_8
                        )
                    )
                }
                "9" -> {
                    myImageViewSplit41.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_9
                        )
                    )
                }
                "10" -> {
                    myImageViewSplit41.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_10
                        )
                    )
                }
                "11" -> {
                    myImageViewSplit41.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_11
                        )
                    )
                }
                "12" -> {
                    myImageViewSplit41.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_12
                        )
                    )
                }
                "13" -> {
                    myImageViewSplit41.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_13
                        )
                    )
                }
                "14" -> {
                    myImageViewSplit41.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_14
                        )
                    )
                }
                "15" -> {
                    myImageViewSplit41.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut4x4_15
                        )
                    )
                }
            }
        }

        button3x3.setOnClickListener() {

            tableLayoutBackgroud3x3.bringToFront()
            tableLayout3x3.bringToFront()

            viewClear()

            val myList = ArrayList((1..8).toList())
            myList.shuffle()
            textView42.text = myList[0].toString()
            textView43.text = myList[1].toString()
            textView44.text = myList[2].toString()
            textView45.text = myList[3].toString()
            textView46.text = myList[4].toString()
            textView47.text = myList[5].toString()
            textView48.text = myList[6].toString()
            textView49.text = myList[7].toString()
            textView50.text = ""

            when (textView42.text) {
                "1" -> {
                    myImageViewSplit42.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit42.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit42.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit42.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit42.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit42.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit42.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit42.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_8
                        )
                    )
                }
            }
            when (textView43.text) {
                "1" -> {
                    myImageViewSplit43.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit43.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit43.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit43.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit43.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit43.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit43.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit43.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_8
                        )
                    )
                }
            }
            when (textView44.text) {
                "1" -> {
                    myImageViewSplit44.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit44.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit44.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit44.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit44.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit44.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit44.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit44.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_8
                        )
                    )
                }
            }
            when (textView45.text) {
                "1" -> {
                    myImageViewSplit45.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit45.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit45.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit45.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit45.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit45.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit45.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit45.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_8
                        )
                    )
                }
            }
            when (textView46.text) {
                "1" -> {
                    myImageViewSplit46.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit46.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit46.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit46.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit46.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit46.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit46.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit46.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_8
                        )
                    )
                }
            }
            when (textView47.text) {
                "1" -> {
                    myImageViewSplit47.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit47.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit47.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit47.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit47.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit47.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit47.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit47.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_8
                        )
                    )
                }
            }
            when (textView48.text) {
                "1" -> {
                    myImageViewSplit48.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit48.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit48.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit48.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit48.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit48.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit48.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit48.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_8
                        )
                    )
                }
            }
            when (textView49.text) {
                "1" -> {
                    myImageViewSplit49.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit49.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit49.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit49.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit49.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit49.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit49.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit49.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_8
                        )
                    )
                }
            }
            when (textView50.text) {
                "1" -> {
                    myImageViewSplit50.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_1
                        )
                    )
                }
                "2" -> {
                    myImageViewSplit50.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_2
                        )
                    )
                }
                "3" -> {
                    myImageViewSplit50.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_3
                        )
                    )
                }
                "4" -> {
                    myImageViewSplit50.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_4
                        )
                    )
                }
                "5" -> {
                    myImageViewSplit50.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_5
                        )
                    )
                }
                "6" -> {
                    myImageViewSplit50.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_6
                        )
                    )
                }
                "7" -> {
                    myImageViewSplit50.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_7
                        )
                    )
                }
                "8" -> {
                    myImageViewSplit50.setImageBitmap(
                        BitmapFactory.decodeResource(
                            resources,
                            R.drawable.cut3x3_8
                        )
                    )
                }
            }
        }
    }

    private fun viewClear() {
        textView1.text = ""
        textView2.text = ""
        textView3.text = ""
        textView4.text = ""
        textView5.text = ""
        textView6.text = ""
        textView7.text = ""
        textView8.text = ""
        textView9.text = ""
        textView10.text = ""
        textView11.text = ""
        textView12.text = ""
        textView13.text = ""
        textView14.text = ""
        textView15.text = ""
        textView16.text = ""
        textView17.text = ""
        textView18.text = ""
        textView19.text = ""
        textView20.text = ""
        textView21.text = ""
        textView22.text = ""
        textView23.text = ""
        textView24.text = ""
        textView25.text = ""
        textView26.text = ""
        textView27.text = ""
        textView28.text = ""
        textView29.text = ""
        textView30.text = ""
        textView31.text = ""
        textView32.text = ""
        textView33.text = ""
        textView34.text = ""
        textView35.text = ""
        textView36.text = ""
        textView37.text = ""
        textView38.text = ""
        textView39.text = ""
        textView40.text = ""
        textView41.text = ""
        textView42.text = ""
        textView43.text = ""
        textView44.text = ""
        textView45.text = ""
        textView46.text = ""
        textView47.text = ""
        textView48.text = ""
        textView49.text = ""
        textView50.text = ""

        myImageViewSplit1.setImageBitmap(null)
        myImageViewSplit2.setImageBitmap(null)
        myImageViewSplit3.setImageBitmap(null)
        myImageViewSplit4.setImageBitmap(null)
        myImageViewSplit5.setImageBitmap(null)
        myImageViewSplit6.setImageBitmap(null)
        myImageViewSplit7.setImageBitmap(null)
        myImageViewSplit8.setImageBitmap(null)
        myImageViewSplit9.setImageBitmap(null)
        myImageViewSplit10.setImageBitmap(null)
        myImageViewSplit11.setImageBitmap(null)
        myImageViewSplit12.setImageBitmap(null)
        myImageViewSplit13.setImageBitmap(null)
        myImageViewSplit14.setImageBitmap(null)
        myImageViewSplit15.setImageBitmap(null)
        myImageViewSplit16.setImageBitmap(null)
        myImageViewSplit17.setImageBitmap(null)
        myImageViewSplit18.setImageBitmap(null)
        myImageViewSplit19.setImageBitmap(null)
        myImageViewSplit20.setImageBitmap(null)
        myImageViewSplit21.setImageBitmap(null)
        myImageViewSplit22.setImageBitmap(null)
        myImageViewSplit23.setImageBitmap(null)
        myImageViewSplit24.setImageBitmap(null)
        myImageViewSplit25.setImageBitmap(null)
        myImageViewSplit26.setImageBitmap(null)
        myImageViewSplit27.setImageBitmap(null)
        myImageViewSplit28.setImageBitmap(null)
        myImageViewSplit29.setImageBitmap(null)
        myImageViewSplit30.setImageBitmap(null)
        myImageViewSplit31.setImageBitmap(null)
        myImageViewSplit32.setImageBitmap(null)
        myImageViewSplit33.setImageBitmap(null)
        myImageViewSplit34.setImageBitmap(null)
        myImageViewSplit35.setImageBitmap(null)
        myImageViewSplit36.setImageBitmap(null)
        myImageViewSplit37.setImageBitmap(null)
        myImageViewSplit38.setImageBitmap(null)
        myImageViewSplit39.setImageBitmap(null)
        myImageViewSplit40.setImageBitmap(null)
        myImageViewSplit41.setImageBitmap(null)
        myImageViewSplit42.setImageBitmap(null)
        myImageViewSplit43.setImageBitmap(null)
        myImageViewSplit44.setImageBitmap(null)
        myImageViewSplit45.setImageBitmap(null)
        myImageViewSplit46.setImageBitmap(null)
        myImageViewSplit47.setImageBitmap(null)
        myImageViewSplit48.setImageBitmap(null)
        myImageViewSplit49.setImageBitmap(null)
        myImageViewSplit50.setImageBitmap(null)
    }

    private fun imageView5x5Row1() {

        myImageViewSplit1.setOnClickListener() {
            when {
                textView2.text == "" -> {
                    textView2.text = textView1.text
                    textView1.text = ""

                    myImageViewSplit2.setImageBitmap((myImageViewSplit1.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit1.setImageBitmap(null)
                }
                textView6.text == "" -> {
                    textView6.text = textView1.text
                    textView1.text = ""

                    myImageViewSplit6.setImageBitmap((myImageViewSplit1.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit1.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit2.setOnClickListener() {
            when {
                textView3.text == "" -> {
                    textView3.text = textView2.text
                    textView2.text = ""

                    myImageViewSplit3.setImageBitmap((myImageViewSplit2.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit2.setImageBitmap(null)
                }
                textView7.text == "" -> {
                    textView7.text = textView2.text
                    textView2.text = ""

                    myImageViewSplit7.setImageBitmap((myImageViewSplit2.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit2.setImageBitmap(null)
                }
                textView1.text == "" -> {
                    textView1.text = textView2.text
                    textView2.text = ""

                    myImageViewSplit1.setImageBitmap((myImageViewSplit2.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit2.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit3.setOnClickListener() {
            when {
                textView4.text == "" -> {
                    textView4.text = textView3.text
                    textView3.text = ""

                    myImageViewSplit4.setImageBitmap((myImageViewSplit3.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit3.setImageBitmap(null)
                }
                textView8.text == "" -> {
                    textView8.text = textView3.text
                    textView3.text = ""

                    myImageViewSplit8.setImageBitmap((myImageViewSplit3.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit3.setImageBitmap(null)
                }
                textView2.text == "" -> {
                    textView2.text = textView3.text
                    textView3.text = ""

                    myImageViewSplit2.setImageBitmap((myImageViewSplit3.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit3.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit4.setOnClickListener() {
            when {
                textView5.text == "" -> {
                    textView5.text = textView4.text
                    textView4.text = ""

                    myImageViewSplit5.setImageBitmap((myImageViewSplit4.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit4.setImageBitmap(null)
                }
                textView3.text == "" -> {
                    textView3.text = textView4.text
                    textView4.text = ""

                    myImageViewSplit3.setImageBitmap((myImageViewSplit4.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit4.setImageBitmap(null)
                }
                textView9.text == "" -> {
                    textView9.text = textView4.text
                    textView4.text = ""

                    myImageViewSplit9.setImageBitmap((myImageViewSplit4.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit4.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit5.setOnClickListener() {
            when {
                textView4.text == "" -> {
                    textView4.text = textView5.text
                    textView5.text = ""

                    myImageViewSplit4.setImageBitmap((myImageViewSplit5.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit5.setImageBitmap(null)
                }
                textView10.text == "" -> {
                    textView10.text = textView5.text
                    textView5.text = ""

                    myImageViewSplit10.setImageBitmap((myImageViewSplit5.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit5.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun imageView5x5Row2() {

        myImageViewSplit6.setOnClickListener() {
            when {
                textView1.text == "" -> {
                    textView1.text = textView6.text
                    textView6.text = ""

                    myImageViewSplit1.setImageBitmap((myImageViewSplit6.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit6.setImageBitmap(null)
                }
                textView7.text == "" -> {
                    textView7.text = textView6.text
                    textView6.text = ""

                    myImageViewSplit7.setImageBitmap((myImageViewSplit6.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit6.setImageBitmap(null)
                }
                textView11.text == "" -> {
                    textView11.text = textView6.text
                    textView6.text = ""

                    myImageViewSplit11.setImageBitmap((myImageViewSplit6.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit6.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit7.setOnClickListener() {
            when {
                textView2.text == "" -> {
                    textView2.text = textView7.text
                    textView7.text = ""

                    myImageViewSplit2.setImageBitmap((myImageViewSplit7.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit7.setImageBitmap(null)
                }
                textView6.text == "" -> {
                    textView6.text = textView7.text
                    textView7.text = ""

                    myImageViewSplit6.setImageBitmap((myImageViewSplit7.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit7.setImageBitmap(null)
                }
                textView8.text == "" -> {
                    textView8.text = textView7.text
                    textView7.text = ""

                    myImageViewSplit8.setImageBitmap((myImageViewSplit7.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit7.setImageBitmap(null)
                }
                textView12.text == "" -> {
                    textView12.text = textView7.text
                    textView7.text = ""

                    myImageViewSplit12.setImageBitmap((myImageViewSplit7.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit7.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit8.setOnClickListener() {
            when {
                textView3.text == "" -> {
                    textView3.text = textView8.text
                    textView8.text = ""

                    myImageViewSplit3.setImageBitmap((myImageViewSplit8.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit8.setImageBitmap(null)
                }
                textView7.text == "" -> {
                    textView7.text = textView8.text
                    textView8.text = ""

                    myImageViewSplit7.setImageBitmap((myImageViewSplit8.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit8.setImageBitmap(null)
                }
                textView9.text == "" -> {
                    textView9.text = textView8.text
                    textView8.text = ""

                    myImageViewSplit9.setImageBitmap((myImageViewSplit8.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit8.setImageBitmap(null)
                }
                textView13.text == "" -> {
                    textView13.text = textView8.text
                    textView8.text = ""

                    myImageViewSplit13.setImageBitmap((myImageViewSplit8.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit8.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit9.setOnClickListener() {
            when {
                textView4.text == "" -> {
                    textView4.text = textView9.text
                    textView9.text = ""

                    myImageViewSplit4.setImageBitmap((myImageViewSplit9.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit9.setImageBitmap(null)
                }
                textView8.text == "" -> {
                    textView8.text = textView9.text
                    textView9.text = ""

                    myImageViewSplit8.setImageBitmap((myImageViewSplit9.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit9.setImageBitmap(null)
                }
                textView10.text == "" -> {
                    textView10.text = textView9.text
                    textView9.text = ""

                    myImageViewSplit10.setImageBitmap((myImageViewSplit9.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit9.setImageBitmap(null)
                }
                textView14.text == "" -> {
                    textView14.text = textView9.text
                    textView9.text = ""

                    myImageViewSplit14.setImageBitmap((myImageViewSplit9.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit9.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit10.setOnClickListener() {
            when {
                textView5.text == "" -> {
                    textView5.text = textView10.text
                    textView10.text = ""

                    myImageViewSplit5.setImageBitmap((myImageViewSplit10.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit10.setImageBitmap(null)
                }
                textView9.text == "" -> {
                    textView9.text = textView10.text
                    textView10.text = ""

                    myImageViewSplit9.setImageBitmap((myImageViewSplit10.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit10.setImageBitmap(null)
                }
                textView15.text == "" -> {
                    textView15.text = textView10.text
                    textView10.text = ""

                    myImageViewSplit15.setImageBitmap((myImageViewSplit10.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit10.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun imageView5x5Row3() {

        myImageViewSplit11.setOnClickListener() {
            when {
                textView6.text == "" -> {
                    textView6.text = textView11.text
                    textView11.text = ""

                    myImageViewSplit6.setImageBitmap((myImageViewSplit11.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit11.setImageBitmap(null)
                }
                textView12.text == "" -> {
                    textView12.text = textView11.text
                    textView11.text = ""

                    myImageViewSplit12.setImageBitmap((myImageViewSplit11.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit11.setImageBitmap(null)
                }
                textView16.text == "" -> {
                    textView16.text = textView11.text
                    textView11.text = ""

                    myImageViewSplit16.setImageBitmap((myImageViewSplit11.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit11.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit12.setOnClickListener() {
            when {
                textView7.text == "" -> {
                    textView7.text = textView12.text
                    textView12.text = ""

                    myImageViewSplit7.setImageBitmap((myImageViewSplit12.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit12.setImageBitmap(null)
                }
                textView11.text == "" -> {
                    textView11.text = textView12.text
                    textView12.text = ""

                    myImageViewSplit11.setImageBitmap((myImageViewSplit12.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit12.setImageBitmap(null)
                }
                textView13.text == "" -> {
                    textView13.text = textView12.text
                    textView12.text = ""

                    myImageViewSplit13.setImageBitmap((myImageViewSplit12.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit12.setImageBitmap(null)
                }
                textView17.text == "" -> {
                    textView17.text = textView12.text
                    textView12.text = ""

                    myImageViewSplit17.setImageBitmap((myImageViewSplit12.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit12.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit13.setOnClickListener() {
            when {
                textView8.text == "" -> {
                    textView8.text = textView13.text
                    textView13.text = ""

                    myImageViewSplit8.setImageBitmap((myImageViewSplit13.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit13.setImageBitmap(null)
                }
                textView12.text == "" -> {
                    textView12.text = textView13.text
                    textView13.text = ""

                    myImageViewSplit12.setImageBitmap((myImageViewSplit13.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit13.setImageBitmap(null)
                }
                textView14.text == "" -> {
                    textView14.text = textView13.text
                    textView13.text = ""

                    myImageViewSplit14.setImageBitmap((myImageViewSplit13.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit13.setImageBitmap(null)
                }
                textView18.text == "" -> {
                    textView18.text = textView13.text
                    textView13.text = ""

                    myImageViewSplit18.setImageBitmap((myImageViewSplit13.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit13.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit14.setOnClickListener() {
            when {
                textView9.text == "" -> {
                    textView9.text = textView14.text
                    textView14.text = ""

                    myImageViewSplit9.setImageBitmap((myImageViewSplit14.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit14.setImageBitmap(null)
                }
                textView13.text == "" -> {
                    textView13.text = textView14.text
                    textView14.text = ""

                    myImageViewSplit13.setImageBitmap((myImageViewSplit14.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit14.setImageBitmap(null)
                }
                textView15.text == "" -> {
                    textView15.text = textView14.text
                    textView14.text = ""

                    myImageViewSplit15.setImageBitmap((myImageViewSplit14.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit14.setImageBitmap(null)
                }
                textView19.text == "" -> {
                    textView19.text = textView14.text
                    textView14.text = ""

                    myImageViewSplit19.setImageBitmap((myImageViewSplit14.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit14.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit15.setOnClickListener() {
            when {
                textView10.text == "" -> {
                    textView10.text = textView15.text
                    textView15.text = ""

                    myImageViewSplit10.setImageBitmap((myImageViewSplit15.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit15.setImageBitmap(null)
                }
                textView14.text == "" -> {
                    textView14.text = textView15.text
                    textView15.text = ""

                    myImageViewSplit14.setImageBitmap((myImageViewSplit15.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit15.setImageBitmap(null)
                }
                textView20.text == "" -> {
                    textView20.text = textView15.text
                    textView15.text = ""

                    myImageViewSplit20.setImageBitmap((myImageViewSplit15.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit15.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun imageView5x5Row4() {

        myImageViewSplit16.setOnClickListener() {
            when {
                textView11.text == "" -> {
                    textView11.text = textView16.text
                    textView16.text = ""

                    myImageViewSplit11.setImageBitmap((myImageViewSplit16.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit16.setImageBitmap(null)
                }
                textView17.text == "" -> {
                    textView17.text = textView16.text
                    textView16.text = ""

                    myImageViewSplit17.setImageBitmap((myImageViewSplit16.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit16.setImageBitmap(null)
                }
                textView21.text == "" -> {
                    textView21.text = textView16.text
                    textView16.text = ""

                    myImageViewSplit21.setImageBitmap((myImageViewSplit16.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit16.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit17.setOnClickListener() {
            when {
                textView12.text == "" -> {
                    textView12.text = textView17.text
                    textView17.text = ""

                    myImageViewSplit12.setImageBitmap((myImageViewSplit17.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit17.setImageBitmap(null)
                }
                textView16.text == "" -> {
                    textView16.text = textView17.text
                    textView17.text = ""

                    myImageViewSplit16.setImageBitmap((myImageViewSplit17.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit17.setImageBitmap(null)
                }
                textView18.text == "" -> {
                    textView18.text = textView17.text
                    textView17.text = ""

                    myImageViewSplit18.setImageBitmap((myImageViewSplit17.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit17.setImageBitmap(null)
                }
                textView22.text == "" -> {
                    textView22.text = textView17.text
                    textView17.text = ""

                    myImageViewSplit22.setImageBitmap((myImageViewSplit17.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit17.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit18.setOnClickListener() {
            when {
                textView13.text == "" -> {
                    textView13.text = textView18.text
                    textView18.text = ""

                    myImageViewSplit13.setImageBitmap((myImageViewSplit18.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit18.setImageBitmap(null)
                }
                textView17.text == "" -> {
                    textView17.text = textView18.text
                    textView18.text = ""

                    myImageViewSplit17.setImageBitmap((myImageViewSplit18.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit18.setImageBitmap(null)
                }
                textView19.text == "" -> {
                    textView19.text = textView18.text
                    textView18.text = ""

                    myImageViewSplit19.setImageBitmap((myImageViewSplit18.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit18.setImageBitmap(null)
                }
                textView23.text == "" -> {
                    textView23.text = textView18.text
                    textView18.text = ""

                    myImageViewSplit23.setImageBitmap((myImageViewSplit18.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit18.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit19.setOnClickListener() {
            when {
                textView14.text == "" -> {
                    textView14.text = textView19.text
                    textView19.text = ""

                    myImageViewSplit14.setImageBitmap((myImageViewSplit19.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit19.setImageBitmap(null)
                }
                textView18.text == "" -> {
                    textView18.text = textView19.text
                    textView19.text = ""

                    myImageViewSplit18.setImageBitmap((myImageViewSplit19.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit19.setImageBitmap(null)
                }
                textView20.text == "" -> {
                    textView20.text = textView19.text
                    textView19.text = ""

                    myImageViewSplit20.setImageBitmap((myImageViewSplit19.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit19.setImageBitmap(null)
                }
                textView24.text == "" -> {
                    textView24.text = textView19.text
                    textView19.text = ""

                    myImageViewSplit24.setImageBitmap((myImageViewSplit19.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit19.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit20.setOnClickListener() {
            when {
                textView15.text == "" -> {
                    textView15.text = textView20.text
                    textView20.text = ""

                    myImageViewSplit15.setImageBitmap((myImageViewSplit20.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit20.setImageBitmap(null)
                }
                textView19.text == "" -> {
                    textView19.text = textView20.text
                    textView20.text = ""

                    myImageViewSplit19.setImageBitmap((myImageViewSplit20.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit20.setImageBitmap(null)
                }
                textView25.text == "" -> {
                    textView25.text = textView20.text
                    textView20.text = ""

                    myImageViewSplit25.setImageBitmap((myImageViewSplit20.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit20.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun imageView5x5Row5() {

        myImageViewSplit21.setOnClickListener() {
            when {
                textView22.text == "" -> {
                    textView22.text = textView21.text
                    textView21.text = ""

                    myImageViewSplit22.setImageBitmap((myImageViewSplit21.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit21.setImageBitmap(null)
                }
                textView16.text == "" -> {
                    textView16.text = textView21.text
                    textView21.text = ""

                    myImageViewSplit16.setImageBitmap((myImageViewSplit21.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit21.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit22.setOnClickListener() {
            when {
                textView23.text == "" -> {
                    textView23.text = textView22.text
                    textView22.text = ""

                    myImageViewSplit23.setImageBitmap((myImageViewSplit22.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit22.setImageBitmap(null)
                }
                textView17.text == "" -> {
                    textView17.text = textView22.text
                    textView22.text = ""

                    myImageViewSplit17.setImageBitmap((myImageViewSplit22.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit22.setImageBitmap(null)
                }
                textView21.text == "" -> {
                    textView21.text = textView22.text
                    textView22.text = ""

                    myImageViewSplit21.setImageBitmap((myImageViewSplit22.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit22.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit23.setOnClickListener() {
            when {
                textView24.text == "" -> {
                    textView24.text = textView23.text
                    textView23.text = ""

                    myImageViewSplit24.setImageBitmap((myImageViewSplit23.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit23.setImageBitmap(null)
                }
                textView18.text == "" -> {
                    textView18.text = textView23.text
                    textView23.text = ""

                    myImageViewSplit18.setImageBitmap((myImageViewSplit23.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit23.setImageBitmap(null)
                }
                textView22.text == "" -> {
                    textView22.text = textView23.text
                    textView23.text = ""

                    myImageViewSplit22.setImageBitmap((myImageViewSplit23.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit23.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit24.setOnClickListener() {
            when {
                textView25.text == "" -> {
                    textView25.text = textView24.text
                    textView24.text = ""

                    myImageViewSplit25.setImageBitmap((myImageViewSplit24.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit24.setImageBitmap(null)
                }
                textView23.text == "" -> {
                    textView23.text = textView24.text
                    textView24.text = ""

                    myImageViewSplit23.setImageBitmap((myImageViewSplit24.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit24.setImageBitmap(null)
                }
                textView19.text == "" -> {
                    textView19.text = textView24.text
                    textView24.text = ""

                    myImageViewSplit19.setImageBitmap((myImageViewSplit24.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit24.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit25.setOnClickListener() {
            when {
                textView24.text == "" -> {
                    textView24.text = textView25.text
                    textView25.text = ""

                    myImageViewSplit24.setImageBitmap((myImageViewSplit25.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit25.setImageBitmap(null)
                }
                textView20.text == "" -> {
                    textView20.text = textView25.text
                    textView25.text = ""

                    myImageViewSplit20.setImageBitmap((myImageViewSplit25.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit25.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun imageView4x4Row1() {

        myImageViewSplit26.setOnClickListener() {
            when {
                textView27.text == "" -> {
                    textView27.text = textView26.text
                    textView26.text = ""

                    myImageViewSplit27.setImageBitmap((myImageViewSplit26.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit26.setImageBitmap(null)
                }
                textView30.text == "" -> {
                    textView30.text = textView26.text
                    textView26.text = ""

                    myImageViewSplit30.setImageBitmap((myImageViewSplit26.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit26.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit27.setOnClickListener() {
            when {
                textView26.text == "" -> {
                    textView26.text = textView27.text
                    textView27.text = ""

                    myImageViewSplit26.setImageBitmap((myImageViewSplit27.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit27.setImageBitmap(null)
                }
                textView28.text == "" -> {
                    textView28.text = textView27.text
                    textView27.text = ""

                    myImageViewSplit28.setImageBitmap((myImageViewSplit27.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit27.setImageBitmap(null)
                }
                textView31.text == "" -> {
                    textView31.text = textView27.text
                    textView27.text = ""

                    myImageViewSplit31.setImageBitmap((myImageViewSplit27.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit27.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit28.setOnClickListener() {
            when {
                textView27.text == "" -> {
                    textView27.text = textView28.text
                    textView28.text = ""

                    myImageViewSplit27.setImageBitmap((myImageViewSplit28.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit28.setImageBitmap(null)
                }
                textView29.text == "" -> {
                    textView29.text = textView28.text
                    textView28.text = ""

                    myImageViewSplit29.setImageBitmap((myImageViewSplit28.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit28.setImageBitmap(null)
                }
                textView32.text == "" -> {
                    textView32.text = textView28.text
                    textView28.text = ""

                    myImageViewSplit32.setImageBitmap((myImageViewSplit28.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit28.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit29.setOnClickListener() {
            when {
                textView28.text == "" -> {
                    textView28.text = textView29.text
                    textView29.text = ""

                    myImageViewSplit28.setImageBitmap((myImageViewSplit29.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit29.setImageBitmap(null)
                }
                textView33.text == "" -> {
                    textView33.text = textView29.text
                    textView29.text = ""

                    myImageViewSplit33.setImageBitmap((myImageViewSplit29.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit29.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun imageView4x4Row2() {

        myImageViewSplit30.setOnClickListener() {
            when {
                textView26.text == "" -> {
                    textView26.text = textView30.text
                    textView30.text = ""

                    myImageViewSplit26.setImageBitmap((myImageViewSplit30.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit30.setImageBitmap(null)
                }
                textView31.text == "" -> {
                    textView31.text = textView30.text
                    textView30.text = ""

                    myImageViewSplit31.setImageBitmap((myImageViewSplit30.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit30.setImageBitmap(null)
                }
                textView34.text == "" -> {
                    textView34.text = textView30.text
                    textView30.text = ""

                    myImageViewSplit34.setImageBitmap((myImageViewSplit30.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit30.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit31.setOnClickListener() {
            when {
                textView27.text == "" -> {
                    textView27.text = textView31.text
                    textView31.text = ""

                    myImageViewSplit27.setImageBitmap((myImageViewSplit31.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit31.setImageBitmap(null)
                }
                textView30.text == "" -> {
                    textView30.text = textView31.text
                    textView31.text = ""

                    myImageViewSplit30.setImageBitmap((myImageViewSplit31.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit31.setImageBitmap(null)
                }
                textView32.text == "" -> {
                    textView32.text = textView31.text
                    textView31.text = ""

                    myImageViewSplit32.setImageBitmap((myImageViewSplit31.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit31.setImageBitmap(null)
                }
                textView35.text == "" -> {
                    textView35.text = textView31.text
                    textView31.text = ""

                    myImageViewSplit35.setImageBitmap((myImageViewSplit31.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit31.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit32.setOnClickListener() {
            when {
                textView28.text == "" -> {
                    textView28.text = textView32.text
                    textView32.text = ""

                    myImageViewSplit28.setImageBitmap((myImageViewSplit32.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit32.setImageBitmap(null)
                }
                textView31.text == "" -> {
                    textView31.text = textView32.text
                    textView32.text = ""

                    myImageViewSplit31.setImageBitmap((myImageViewSplit32.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit32.setImageBitmap(null)
                }
                textView33.text == "" -> {
                    textView33.text = textView32.text
                    textView32.text = ""

                    myImageViewSplit33.setImageBitmap((myImageViewSplit32.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit32.setImageBitmap(null)
                }
                textView36.text == "" -> {
                    textView36.text = textView32.text
                    textView32.text = ""

                    myImageViewSplit36.setImageBitmap((myImageViewSplit32.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit32.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit33.setOnClickListener() {
            when {
                textView29.text == "" -> {
                    textView29.text = textView33.text
                    textView33.text = ""

                    myImageViewSplit29.setImageBitmap((myImageViewSplit33.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit33.setImageBitmap(null)
                }
                textView32.text == "" -> {
                    textView32.text = textView33.text
                    textView33.text = ""

                    myImageViewSplit32.setImageBitmap((myImageViewSplit33.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit33.setImageBitmap(null)
                }
                textView37.text == "" -> {
                    textView37.text = textView33.text
                    textView33.text = ""

                    myImageViewSplit37.setImageBitmap((myImageViewSplit33.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit33.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun imageView4x4Row3() {

        myImageViewSplit34.setOnClickListener() {
            when {
                textView30.text == "" -> {
                    textView30.text = textView34.text
                    textView34.text = ""

                    myImageViewSplit30.setImageBitmap((myImageViewSplit34.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit34.setImageBitmap(null)
                }
                textView35.text == "" -> {
                    textView35.text = textView34.text
                    textView34.text = ""

                    myImageViewSplit35.setImageBitmap((myImageViewSplit34.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit34.setImageBitmap(null)
                }
                textView38.text == "" -> {
                    textView38.text = textView34.text
                    textView34.text = ""

                    myImageViewSplit38.setImageBitmap((myImageViewSplit34.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit34.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit35.setOnClickListener() {
            when {
                textView31.text == "" -> {
                    textView31.text = textView35.text
                    textView35.text = ""

                    myImageViewSplit31.setImageBitmap((myImageViewSplit35.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit35.setImageBitmap(null)
                }
                textView34.text == "" -> {
                    textView34.text = textView35.text
                    textView35.text = ""

                    myImageViewSplit34.setImageBitmap((myImageViewSplit35.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit35.setImageBitmap(null)
                }
                textView36.text == "" -> {
                    textView36.text = textView35.text
                    textView35.text = ""

                    myImageViewSplit36.setImageBitmap((myImageViewSplit35.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit35.setImageBitmap(null)
                }
                textView39.text == "" -> {
                    textView39.text = textView35.text
                    textView35.text = ""

                    myImageViewSplit39.setImageBitmap((myImageViewSplit35.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit35.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit36.setOnClickListener() {
            when {
                textView32.text == "" -> {
                    textView32.text = textView36.text
                    textView36.text = ""

                    myImageViewSplit32.setImageBitmap((myImageViewSplit36.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit36.setImageBitmap(null)
                }
                textView35.text == "" -> {
                    textView35.text = textView36.text
                    textView36.text = ""

                    myImageViewSplit35.setImageBitmap((myImageViewSplit36.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit36.setImageBitmap(null)
                }
                textView37.text == "" -> {
                    textView37.text = textView36.text
                    textView36.text = ""

                    myImageViewSplit37.setImageBitmap((myImageViewSplit36.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit36.setImageBitmap(null)
                }
                textView40.text == "" -> {
                    textView40.text = textView36.text
                    textView36.text = ""

                    myImageViewSplit40.setImageBitmap((myImageViewSplit36.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit36.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit37.setOnClickListener() {
            when {
                textView33.text == "" -> {
                    textView33.text = textView37.text
                    textView37.text = ""

                    myImageViewSplit33.setImageBitmap((myImageViewSplit37.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit37.setImageBitmap(null)
                }
                textView36.text == "" -> {
                    textView36.text = textView37.text
                    textView37.text = ""

                    myImageViewSplit36.setImageBitmap((myImageViewSplit37.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit37.setImageBitmap(null)
                }
                textView41.text == "" -> {
                    textView41.text = textView37.text
                    textView37.text = ""

                    myImageViewSplit41.setImageBitmap((myImageViewSplit37.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit37.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun imageView4x4Row4() {

        myImageViewSplit38.setOnClickListener() {
            when {
                textView34.text == "" -> {
                    textView34.text = textView38.text
                    textView38.text = ""

                    myImageViewSplit34.setImageBitmap((myImageViewSplit38.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit38.setImageBitmap(null)
                }
                textView39.text == "" -> {
                    textView39.text = textView38.text
                    textView38.text = ""

                    myImageViewSplit39.setImageBitmap((myImageViewSplit38.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit38.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit39.setOnClickListener() {
            when {
                textView35.text == "" -> {
                    textView35.text = textView39.text
                    textView39.text = ""

                    myImageViewSplit35.setImageBitmap((myImageViewSplit39.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit39.setImageBitmap(null)
                }
                textView38.text == "" -> {
                    textView38.text = textView39.text
                    textView39.text = ""

                    myImageViewSplit38.setImageBitmap((myImageViewSplit39.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit39.setImageBitmap(null)
                }
                textView40.text == "" -> {
                    textView40.text = textView39.text
                    textView39.text = ""

                    myImageViewSplit40.setImageBitmap((myImageViewSplit39.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit39.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit40.setOnClickListener() {
            when {
                textView36.text == "" -> {
                    textView36.text = textView40.text
                    textView40.text = ""

                    myImageViewSplit36.setImageBitmap((myImageViewSplit40.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit40.setImageBitmap(null)
                }
                textView39.text == "" -> {
                    textView39.text = textView40.text
                    textView40.text = ""

                    myImageViewSplit39.setImageBitmap((myImageViewSplit40.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit40.setImageBitmap(null)
                }
                textView41.text == "" -> {
                    textView41.text = textView40.text
                    textView40.text = ""

                    myImageViewSplit41.setImageBitmap((myImageViewSplit40.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit40.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit41.setOnClickListener() {
            when {
                textView37.text == "" -> {
                    textView37.text = textView41.text
                    textView41.text = ""

                    myImageViewSplit37.setImageBitmap((myImageViewSplit41.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit41.setImageBitmap(null)
                }
                textView40.text == "" -> {
                    textView40.text = textView41.text
                    textView41.text = ""

                    myImageViewSplit40.setImageBitmap((myImageViewSplit41.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit41.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun imageView3x3Row1() {

        myImageViewSplit42.setOnClickListener() {
            when {
                textView43.text == "" -> {
                    textView43.text = textView42.text
                    textView42.text = ""

                    myImageViewSplit43.setImageBitmap((myImageViewSplit42.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit42.setImageBitmap(null)
                }
                textView45.text == "" -> {
                    textView45.text = textView42.text
                    textView42.text = ""

                    myImageViewSplit45.setImageBitmap((myImageViewSplit42.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit42.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit43.setOnClickListener() {
            when {
                textView42.text == "" -> {
                    textView42.text = textView43.text
                    textView43.text = ""

                    myImageViewSplit42.setImageBitmap((myImageViewSplit43.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit43.setImageBitmap(null)
                }
                textView44.text == "" -> {
                    textView44.text = textView43.text
                    textView43.text = ""

                    myImageViewSplit44.setImageBitmap((myImageViewSplit43.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit43.setImageBitmap(null)
                }
                textView46.text == "" -> {
                    textView46.text = textView43.text
                    textView43.text = ""

                    myImageViewSplit46.setImageBitmap((myImageViewSplit43.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit43.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit44.setOnClickListener() {
            when {
                textView43.text == "" -> {
                    textView43.text = textView44.text
                    textView44.text = ""

                    myImageViewSplit43.setImageBitmap((myImageViewSplit44.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit44.setImageBitmap(null)
                }
                textView47.text == "" -> {
                    textView47.text = textView44.text
                    textView44.text = ""

                    myImageViewSplit47.setImageBitmap((myImageViewSplit44.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit44.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun imageView3x3Row2() {

        myImageViewSplit45.setOnClickListener() {
            when {
                textView42.text == "" -> {
                    textView42.text = textView45.text
                    textView45.text = ""

                    myImageViewSplit42.setImageBitmap((myImageViewSplit45.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit45.setImageBitmap(null)
                }
                textView46.text == "" -> {
                    textView46.text = textView45.text
                    textView45.text = ""

                    myImageViewSplit46.setImageBitmap((myImageViewSplit45.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit45.setImageBitmap(null)
                }
                textView48.text == "" -> {
                    textView48.text = textView45.text
                    textView45.text = ""

                    myImageViewSplit48.setImageBitmap((myImageViewSplit45.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit45.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit46.setOnClickListener() {
            when {
                textView43.text == "" -> {
                    textView43.text = textView46.text
                    textView46.text = ""

                    myImageViewSplit43.setImageBitmap((myImageViewSplit46.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit46.setImageBitmap(null)
                }
                textView45.text == "" -> {
                    textView45.text = textView46.text
                    textView46.text = ""

                    myImageViewSplit45.setImageBitmap((myImageViewSplit46.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit46.setImageBitmap(null)
                }
                textView47.text == "" -> {
                    textView47.text = textView46.text
                    textView46.text = ""

                    myImageViewSplit47.setImageBitmap((myImageViewSplit46.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit46.setImageBitmap(null)
                }
                textView49.text == "" -> {
                    textView49.text = textView46.text
                    textView46.text = ""

                    myImageViewSplit49.setImageBitmap((myImageViewSplit46.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit46.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit47.setOnClickListener() {
            when {
                textView44.text == "" -> {
                    textView44.text = textView47.text
                    textView47.text = ""

                    myImageViewSplit44.setImageBitmap((myImageViewSplit47.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit47.setImageBitmap(null)
                }
                textView46.text == "" -> {
                    textView46.text = textView47.text
                    textView47.text = ""

                    myImageViewSplit46.setImageBitmap((myImageViewSplit47.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit47.setImageBitmap(null)
                }
                textView50.text == "" -> {
                    textView50.text = textView47.text
                    textView47.text = ""

                    myImageViewSplit50.setImageBitmap((myImageViewSplit47.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit47.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun imageView3x3Row3() {

        myImageViewSplit48.setOnClickListener() {
            when {
                textView45.text == "" -> {
                    textView45.text = textView48.text
                    textView48.text = ""

                    myImageViewSplit45.setImageBitmap((myImageViewSplit48.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit48.setImageBitmap(null)
                }
                textView49.text == "" -> {
                    textView49.text = textView48.text
                    textView48.text = ""

                    myImageViewSplit49.setImageBitmap((myImageViewSplit48.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit48.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit49.setOnClickListener() {
            when {
                textView46.text == "" -> {
                    textView46.text = textView49.text
                    textView49.text = ""

                    myImageViewSplit46.setImageBitmap((myImageViewSplit49.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit49.setImageBitmap(null)
                }
                textView48.text == "" -> {
                    textView48.text = textView49.text
                    textView49.text = ""

                    myImageViewSplit48.setImageBitmap((myImageViewSplit49.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit49.setImageBitmap(null)
                }
                textView50.text == "" -> {
                    textView50.text = textView49.text
                    textView49.text = ""

                    myImageViewSplit50.setImageBitmap((myImageViewSplit49.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit49.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }

        myImageViewSplit50.setOnClickListener() {
            when {
                textView47.text == "" -> {
                    textView47.text = textView50.text
                    textView50.text = ""

                    myImageViewSplit47.setImageBitmap((myImageViewSplit50.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit50.setImageBitmap(null)
                }
                textView49.text == "" -> {
                    textView49.text = textView50.text
                    textView50.text = ""

                    myImageViewSplit49.setImageBitmap((myImageViewSplit50.drawable as BitmapDrawable).bitmap)
                    myImageViewSplit50.setImageBitmap(null)
                }
                else -> {
                    Toast.makeText(this, "NO SPACE TO MOVE", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}