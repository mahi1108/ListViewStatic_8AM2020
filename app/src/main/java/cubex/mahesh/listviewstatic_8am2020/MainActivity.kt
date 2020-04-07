package cubex.mahesh.listviewstatic_8am2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countries = arrayOf("India","Australia",
                "Bangladesh","China")
        var myadapter = ArrayAdapter<String>(
                this@MainActivity,
                android.R.layout.simple_list_item_1,countries)
        lview1.adapter = myadapter
        lview1.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this@MainActivity,
                    countries[position], Toast.LENGTH_LONG).show()
        }
        lview1.setOnItemLongClickListener(object:AdapterView.OnItemLongClickListener{
            override fun onItemLongClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long): Boolean {
                Toast.makeText(this@MainActivity,
                        "Long :"+countries[position], Toast.LENGTH_LONG).show()
                return true;
            }
        })
    }
}
