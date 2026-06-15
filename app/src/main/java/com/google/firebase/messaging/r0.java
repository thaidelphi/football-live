package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.b9;
import com.ironsource.da;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Store.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class r0 {

    /* renamed from: a  reason: collision with root package name */
    final SharedPreferences f15035a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Store.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        private static final long f15036d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a  reason: collision with root package name */
        final String f15037a;

        /* renamed from: b  reason: collision with root package name */
        final String f15038b;

        /* renamed from: c  reason: collision with root package name */
        final long f15039c;

        private a(String str, String str2, long j10) {
            this.f15037a = str;
            this.f15038b = str2;
            this.f15039c = j10;
        }

        static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put(b9.i.W, str2);
                jSONObject.put(da.a.f16995d, j10);
                return jSONObject.toString();
            } catch (JSONException e8) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e8);
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new a(jSONObject.getString("token"), jSONObject.getString(b9.i.W), jSONObject.getLong(da.a.f16995d));
                } catch (JSONException e8) {
                    Log.w("FirebaseMessaging", "Failed to parse token: " + e8);
                    return null;
                }
            }
            return new a(str, null, 0L);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b(String str) {
            return System.currentTimeMillis() > this.f15039c + f15036d || !str.equals(this.f15038b);
        }
    }

    public r0(Context context) {
        this.f15035a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    private void a(Context context, String str) {
        File file = new File(androidx.core.content.a.g(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || e()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            c();
        } catch (IOException e8) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e8.getMessage());
            }
        }
    }

    private String b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public synchronized void c() {
        this.f15035a.edit().clear().commit();
    }

    public synchronized a d(String str, String str2) {
        return a.c(this.f15035a.getString(b(str, str2), null));
    }

    public synchronized boolean e() {
        return this.f15035a.getAll().isEmpty();
    }

    public synchronized void f(String str, String str2, String str3, String str4) {
        String a10 = a.a(str3, str4, System.currentTimeMillis());
        if (a10 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f15035a.edit();
        edit.putString(b(str, str2), a10);
        edit.commit();
    }
}
