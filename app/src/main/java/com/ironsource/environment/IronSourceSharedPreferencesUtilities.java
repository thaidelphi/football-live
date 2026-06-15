package com.ironsource.environment;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class IronSourceSharedPreferencesUtilities {

    /* renamed from: a  reason: collision with root package name */
    private static final String f17266a = "_preferences";

    static int a(Context context, String str, String str2, int i10) {
        return context == null ? i10 : context.getSharedPreferences(str, 0).getInt(str2, i10);
    }

    static void a(Context context, String str, String str2, boolean z10) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putBoolean(str2, z10);
        edit.apply();
    }

    public static boolean getBooleanFromSharedPrefs(Context context, String str, String str2, boolean z10) {
        return context == null ? z10 : context.getSharedPreferences(str, 0).getBoolean(str2, z10);
    }

    public static String getDefaultSharedPrefName(Context context, String str) {
        if (context == null) {
            return str;
        }
        return context.getPackageName() + f17266a;
    }

    public static int getIntFromDefaultSharedPrefs(Context context, String str, int i10) {
        return a(context, getDefaultSharedPrefName(context, ""), str, i10);
    }

    public static String getStringFromDefaultSharedPrefs(Context context, String str, String str2) {
        return getStringFromSharedPrefs(context, getDefaultSharedPrefName(context, ""), str, str2);
    }

    public static String getStringFromSharedPrefs(Context context, String str, String str2, String str3) {
        return context == null ? str3 : context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static void saveIntToSharedPrefs(Context context, String str, String str2, int i10) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putInt(str2, i10);
        edit.apply();
    }

    public static void saveStringToSharedPrefs(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        edit.apply();
    }
}
