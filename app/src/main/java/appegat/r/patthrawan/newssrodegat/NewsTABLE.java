package appegat.r.patthrawan.newssrodegat;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by ADMIN-IT on 27/8/2558.
 */
public class NewsTABLE {

    //Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String NEWS_TABLE = "newsTABLE";
    public static final String COLUMN_ID_NEWS = "_id";
    public static final String COLUMN_Date = "Date";
    public static final String COLUMN_Head = "Head";
    public static final String COLUMN_Detail = "Detail";
    public static final String COLUMN_Image = "Image";
    public static final String COLUMN_Owner = "Owner";

    public NewsTABLE(Context context) {
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();
    }   //Constructor

    public long addNews(String strDate, String strHead, String strDetail, String strImage, String strOwner) {
            ContentValues objContentValues = new ContentValues();
            objContentValues.put(COLUMN_Date, strDate);
            objContentValues.put(COLUMN_Head, strHead);
            objContentValues.put(COLUMN_Detail, strDetail);
            objContentValues.put(COLUMN_Image, strImage);
            objContentValues.put(COLUMN_Owner, strOwner);
            return writeSqLiteDatabase.insert(NEWS_TABLE, null, objContentValues);
    }   // addNews

}   //Main Class
