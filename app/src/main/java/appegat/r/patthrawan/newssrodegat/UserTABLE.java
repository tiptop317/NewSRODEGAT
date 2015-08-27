package appegat.r.patthrawan.newssrodegat;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;

/**
 * Created by ADMIN-IT on 27/8/2558.
 */
public class UserTABLE {

    //Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String USER_TABLE = "userTABLE";
    public static final String COLUMN_ID_USER = "_id";
    public static final String COLUMN_USER = "User";
    public static final String COLUMN_PASSWORD = "Password";
    public static final String COLUMN_NAME = "Name";

    public UserTABLE(Context context) {
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();

    }   //Constructor

    public long addNewUser(String strUser, String strPassword, String strName) {
        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUMN_USER, strUser);
        objContentValues.put(COLUMN_PASSWORD, strPassword);
        objContentValues.put(COLUMN_NAME, strName);
        return writeSqLiteDatabase.insert(USER_TABLE, null, objContentValues);
    }   //  addNewUser

}   // Main Class
