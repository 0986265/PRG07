package com.jessestolk.localremind;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    TextView txt_currenttemp;
    TextView txt_currentcity;

    public static String city = "Rotterdam";
    private final static String LOG_TAG = "LocalRemind";
    private final static String WEATHERURI = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=ba2568930c19a5697fa99239e74f1e2e";

    public double currentTemp = 0.0;
    public String currentCity = "Verwegistan";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_currenttemp = findViewById(R.id.txt_currenttemp);
        txt_currentcity = findViewById(R.id.txt_currentcity);

        getWeatherData();


    }

    private void getWeatherData() {
        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);

        // Request a string response from the provided URL.
        JsonObjectRequest jsonRequest = new JsonObjectRequest(Request.Method.GET, WEATHERURI, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        //Log.d(LOG_TAG, response.toString());
                        fetchWeather(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(LOG_TAG,"That didn't work! " + error);
            }
        });

        // Add the request to the RequestQueue.
        queue.add(jsonRequest);
    }

    private  void fetchWeather(JSONObject weatherData) {

        try {
            //Access the array with all the temperatures
            JSONObject main = (JSONObject)weatherData.get("main");

            currentTemp = (double)main.get("temp");
            currentCity = weatherData.get("name").toString();
            Log.d(LOG_TAG, String.valueOf(currentTemp));
            updateWeather();

        } catch (JSONException e) {
            Log.e(LOG_TAG, "JSON exption");
        }

    }

    private void updateWeather() {
        double displayTemp = Math.round((currentTemp - 273) * 100.0) / 100.0;
        txt_currenttemp.setText(String.valueOf(displayTemp + "°C"));
        txt_currentcity.setText(currentCity);
    }
}