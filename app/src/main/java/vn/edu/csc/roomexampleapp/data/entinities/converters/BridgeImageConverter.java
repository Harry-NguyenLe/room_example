package vn.edu.csc.roomexampleapp.data.entinities.converters;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import vn.edu.csc.roomexampleapp.data.entinities.BridgeImages;


public class BridgeImageConverter {
    @TypeConverter
    public static List<BridgeImages> fromString(String value) {
        Type listType = new TypeToken<List<String>>() {
        }.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public static String fromBridgeImageList(List<BridgeImages> list) {
        Gson gson = new Gson();
        return gson.toJson(list);
    }
}
