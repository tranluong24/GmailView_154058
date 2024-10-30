package android.app.gmail_v3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var constumeAdapter: CustomeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Khai bao danh sach
        var list = mutableListOf<mail>()
        list.add(mail("#FF9999","Helloalo.com","Toi da nop bai thanh cong","12:34 PM"))
        list.add(mail("#F0B2F0","Chiris Abad","Chuc mung ban da thang giai nhat !","11:22 AM"))
        list.add(mail("#ADC2FF","Tuto.com","THong bao lich thi cuoi ki","11:04 AM"))
        list.add(mail("#85E085","support","Chuc mung ngay nha giao Viet Nam","10:26 AM"))
        list.add(mail("#F0B2F0","Matt from lonic","Phan hoi ve yeu cau hoan tra","10:26 AM"))
        list.add(mail("#85AFFF","Edurila.com","Yeu cau truy cap khong hoan tat !","10:25 AM"))
        list.add(mail("#5CD65C","Matt from lonic","Phan hoi ve yeu cau hoan tra","10:24 AM"))
        list.add(mail("#85AFFF","Edurila.com","Yeu cau truy cap khong hoan tat !","10:23 AM"))

        constumeAdapter = CustomeAdapter(this,list)
        val listView = findViewById<ListView>(R.id.listView)

        listView.adapter = constumeAdapter


    }

}