package com.example.micro.historicaltour.JsonClasses;

import android.util.Base64;
import android.util.Log;

import com.example.micro.historicaltour.Classes.classes.UserClass;
import com.example.micro.historicaltour.Classes.classes.placeClass;
import com.example.micro.historicaltour.Classes.classes.reviewClass;
import com.example.micro.historicaltour.Classes.classes.timeClass;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;

public class JsonClass {



    public static ArrayList<placeClass> fetchPlacesData(String urlString){

        String response = null;
        
        URL url=CreateUrl(urlString);

        try { 
            response=  MakeHttpRequest(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return ExtractPlacesData(response);
    }


    public static ArrayList<placeClass> ExtractPlacesData(String jsonResponse)  {



        ArrayList<placeClass> placeArray= new ArrayList<>();

        try {


            JSONArray jsonPlaces = new JSONArray(jsonResponse);

            for (int i = 0; i <= jsonPlaces.length(); i++) {

                JSONObject jsonPlace = jsonPlaces.getJSONObject(i);

                int ID = jsonPlace.getInt("Id");
                String Name = jsonPlace.getString("Name");
                float Rate = (float) jsonPlace.getDouble("Rate");
                String VKey = jsonPlace.getString("VideoKey");
                String Description = jsonPlace.getString("Descrption");
                String Location = jsonPlace.getString("Location");
                float longitude = (float) jsonPlace.getDouble("longitude");
                float latitude = (float) jsonPlace.getDouble("latitude");

                JSONArray jsonImages = jsonPlace.getJSONArray("Images");
                JSONArray jsonDays = jsonPlace.getJSONArray("WorkingDays");
                JSONArray jsonReviews= jsonPlace.getJSONArray("reviewClasses");

                ArrayList<byte[]> Images= new ArrayList<>();
                ArrayList<timeClass> WorkingTimes = new ArrayList<>();
                ArrayList<reviewClass> Reviews = new ArrayList<>();


                for (int j =0 ;j<jsonImages.length();j++){
                    byte[] byteArray =  Base64.decode(jsonImages.getJSONObject(j).getString("Image"), Base64.DEFAULT) ;

                    Images.add(byteArray);
                }


                for (int j =0 ;j<jsonDays.length();j++){

                    timeClass time = new timeClass( jsonDays.getJSONObject(j).getInt("StartTime")
                            ,jsonDays.getJSONObject(j).getInt("EndTime"));

                    WorkingTimes.add(time);
                }


                for (int j =0 ;j<jsonReviews.length();j++){

                    JSONObject jsonReview = jsonReviews.getJSONObject(j);

                    int UserID = jsonReview.getInt("UserID");
                    String UserName = jsonReview.getString("UserName");

                    String comment = jsonReview.getString("Review");
                    float UserRate = (float) jsonReview.getDouble("Rate");



                    String DateString = jsonReview.getString("Date");
                    DateString.replaceAll("Date","");
                    DateString.replace(")","");

                    DateString = DateString.substring(6,DateString.length()-2);

                    Date Date=new Date(Long.valueOf(DateString));
//                    DateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
//                    try {
//                         Date = (java.sql.Date) simpleDateFormat.parse(DateString);
//                    } catch (ParseException e) {
//                        e.printStackTrace();
//                    }


                    UserClass user = new UserClass();

                    user.setID(UserID);
                    user.setUserName(UserName);
                    user.setName(UserName);

                    reviewClass review = new reviewClass(user,UserRate,comment,Date);


                    Reviews.add(review);


                }


                placeArray.add(new placeClass(ID, Name, Rate, VKey, Description, Location, longitude, latitude,WorkingTimes,Reviews,Images));

            }
        }
        catch (JSONException e){

            Log.e("Json Error", "Problem parsing the earthquake JSON results", e);
        }
        return placeArray;

    }



    public static URL CreateUrl(String urlString){


        URL url =null;

        try {
            url = new URL(urlString);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return url;
    }



    public static String MakeHttpRequest(URL url) throws IOException {

        String jsonRespone = null;

        if(url==null){
            return jsonRespone;
        }

        InputStream inputStream = null;
        HttpURLConnection urlConnection = null;

        try {

            urlConnection= (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.connect();

            if(urlConnection.getResponseCode()==200){

                inputStream=urlConnection.getInputStream();
                jsonRespone=ReadFromInputStream(inputStream);

            }
            else {

                Log.e("URL Error", "Error response code: " + urlConnection.getResponseCode());
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            inputStream.close();
            urlConnection.disconnect();
        }


        return jsonRespone;

    }

    private static String ReadFromInputStream(InputStream inputStream) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        if(inputStream!=null){

            InputStreamReader streamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            BufferedReader bufferedReader = new BufferedReader(streamReader);

            String Line =bufferedReader.readLine();

            while (Line!=null){
                stringBuilder.append(Line);
                Line=bufferedReader.readLine();
            }
        }

        return stringBuilder.toString();

    }



}
