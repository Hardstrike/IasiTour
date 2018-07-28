package com.example.android.iasitour;


public class Place {

    private String mPlaceName;

    private String mPlaceSiteURL;

    private String mPlaceDescription;

    private String mPlaceAddress;

    private int mPlaceImageResourceID;

    private String mPlaceLocation;


    public Place (String name, String address, String description, int imageResourceID, String website, String location){
        mPlaceName = name;
        mPlaceAddress = address;
        mPlaceImageResourceID = imageResourceID;
        mPlaceDescription = description;
        mPlaceSiteURL = website;
        mPlaceLocation = location;
    }

    public String getName(){
        return mPlaceName;
    }

    public String getDescription(){
        return mPlaceDescription;
    }

    public String getAddress(){
        return mPlaceAddress;
    }

    public String getLocation(){
        return mPlaceLocation;
    }

    public String getSiteURL(){
        return mPlaceSiteURL;
    }

    public int getImageResourceID(){ return mPlaceImageResourceID; }



}