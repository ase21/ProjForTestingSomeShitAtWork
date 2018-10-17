package ase.ProjTestingSomeShitAtWork;

import android.app.DialogFragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    EditText editText;
    WebView webView;
    RecyclerView probeRecyclerView;
    RecyclerView.Adapter probeAdapter;
    RecyclerView.LayoutManager probeLayoutManager;
    List<BeerObject> beerObjects;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    DialogFragment dialogFragment;
    int counter=0;

    final String SETTINGS_FILE_NAME = "mysettings.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        beerObjects = new ArrayList<>();
        initBeer();
        ListView listView = findViewById(R.id.list_item);
        listView.setAdapter(new BeerListAdapter(beerObjects, this));
//        init();

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String s = editText.getText().toString();
//                webView.loadUrl(s);
//            }
//        });
//        sharedPreferences = getSharedPreferences(SETTINGS_FILE_NAME, MODE_PRIVATE);
//
//
//        textView = findViewById(R.id.shared_preferences_textView);
//
//
//        beerObjects = new ArrayList<>();
//
//        initBeer();
//
//        probeRecyclerView = findViewById(R.id.probe_recycler_view);
//        probeLayoutManager = new LinearLayoutManager(this);
//        probeRecyclerView.setLayoutManager(probeLayoutManager);
//
//        probeAdapter = new ProbeAdapter(beerObjects);
//        probeRecyclerView.setAdapter(probeAdapter);



    }

//    private void init() {
//        textView = findViewById(R.id.textView2);
//        button = findViewById(R.id.button);
//        editText = findViewById(R.id.editText3);
//        webView = findViewById(R.id.webview);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textView.setText("Set Text");
//            }
//        });
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main,menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        dialogFragment = new GiveMeFiveDialog();
//        dialogFragment.show(getFragmentManager(), "dialogFragment");
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    protected void onStart() {
        super.onStart();
//        counter = sharedPreferences.getInt("counter", 0);
//        if (counter>=0){
//            if (counter==5){
//                Toast.makeText(this,String.valueOf(counter),Toast.LENGTH_LONG).show();
//                dialogFragment = new ProbeDialog();
//                dialogFragment.show(getFragmentManager(), "dialogFragment");
//            } else {
//                counter++;
//                editor = sharedPreferences.edit();
//                editor.putInt("counter", counter);
//                editor.apply();
//            }
//        }
//        textView.setText("s: "+counter);
    }

    private void initBeer() {
        beerObjects.add(new BeerObject("Американские хмели – «Каскад» и «Пекко» ярко раскрываются, " +
                "создавая цветочно-фруктовый аромат с выраженными цитрусовыми оттенками. " +
                "Освежающий вкус с приятной характерной горчинкой несомненно запомнится насыщенным вкусом и ароматом. ",
                "5,0 %",
                "Волковская пивоварня",
                "СВЕТЛЯЧОК",
                "https://irecommend.ru/sites/default/files/product-images/298886/nd7guhq1Kk0GWmOUD8XRGw.png",
                "Lager"));
        beerObjects.add(new BeerObject("Вишнёвый эль, обладающий выраженным кисло-сладким вкусом, довольно освежающим и не слишком приторным. " +
                "Послевкусие горьковатое, миндальное с ощутимыми тонами вишнёвой косточки. Аромат у нашего эля восхитительный, легкий, фруктовый.",
                "6,2 %",
                "Волковская пивоварня",
                "МИШЕНЬКА ПОД ВИШЕНКОЙ",
                "https://i.otzovik.com/objects/b/1090000/1081551.png",
                "Фруктовый эль"));
    }
}
