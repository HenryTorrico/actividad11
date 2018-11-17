package ucb.bo.edu.actividad11;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

public class SessionManager {

    //Shared Preferences
    private SharedPreferences pref;
    //Editor for Shared Preferences
    private SharedPreferences.Editor editor;
    //Sharedpref file name
    private static final String PREF_NAME = "Miapptest";
    //Context
    private Context _context;
    //Shared pref mode
    private int PRIVATE_MODE = 0;
    private String KEY_USER = "user";

    // Constructor
    public SessionManager(Context context) {
        _context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }
    //	Gson gson = new Gson();
    //	String userJson =gson.toJson(value);


    public void saveUser(Usuario username) {
        Gson gson = new Gson();
        String userJson = gson.toJson(username);
        editor.putString(KEY_USER, userJson);
        editor.commit();
    }
    public Usuario getUserName() {
        Gson gson=new Gson();
       return gson.fromJson(pref.getString(KEY_USER,null),Usuario.class);
    }


}

