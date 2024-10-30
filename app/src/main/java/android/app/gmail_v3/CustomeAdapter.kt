package android.app.gmail_v3

import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import kotlin.concurrent.timerTask

class CustomeAdapter(val activity: MainActivity, val list: List<mail>): ArrayAdapter<mail>(activity, R.layout.list_item) {

    override fun getCount(): Int {
        return list.size //So dong ve len view
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val context = activity.layoutInflater
        //layoutInflater la 1 component chuyen doi xml thanh view
        val rowView = context.inflate(R.layout.list_item, parent, false)

        val buttonAvt = rowView.findViewById<Button>(R.id.btnAvt)
        val title = rowView.findViewById<TextView>(R.id.titleText)
        val time = rowView.findViewById<TextView>(R.id.timeText)
        val des = rowView.findViewById<TextView>(R.id.desText)

        title.text = list[position].title
        time.text = list[position].time
        des.text = list[position].des
        buttonAvt.setBackgroundColor(Color.parseColor(list[position].color))
        buttonAvt.setText(list[position].title.first().toString())

        return rowView
    }
}