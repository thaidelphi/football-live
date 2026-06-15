package r1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONArray;
import org.json.JSONObject;
import z4.l0;
/* compiled from: HttpGetChannel.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b extends AsyncTask<Void, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    private Context f30321a;

    /* renamed from: b  reason: collision with root package name */
    private String f30322b;

    /* renamed from: c  reason: collision with root package name */
    private d f30323c;

    /* renamed from: d  reason: collision with root package name */
    public String f30324d = null;

    /* renamed from: e  reason: collision with root package name */
    String f30325e;

    /* renamed from: f  reason: collision with root package name */
    String f30326f;

    /* renamed from: g  reason: collision with root package name */
    SharedPreferences f30327g;

    /* renamed from: h  reason: collision with root package name */
    URL f30328h;

    public b(Context context, String str, d dVar) {
        this.f30321a = context;
        this.f30322b = str;
        this.f30323c = dVar;
        this.f30327g = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static String b(String str) {
        try {
            String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException e8) {
            Log.e("MD5", e8.getLocalizedMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Void... voidArr) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    this.f30328h = new URL(this.f30322b);
                } catch (Exception unused) {
                }
            }
            if (Build.VERSION.SDK_INT < 26) {
                try {
                    this.f30328h = new URL(this.f30322b);
                } catch (Exception unused2) {
                }
            }
            URL url = new URL(this.f30322b);
            this.f30328h = url;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection(Proxy.NO_PROXY);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestProperty("User-agent", System.getProperty("java.vm.name") + "/" + System.getProperty("java.vm.version") + " (" + System.getProperty("os.name") + "; U; Android " + Build.VERSION.RELEASE + "; " + Build.MODEL + " Build/" + Build.ID + ")");
            httpURLConnection.setRequestProperty("request-id", b(Settings.Secure.getString(this.f30321a.getContentResolver(), "android_id")));
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(15000);
            this.f30324d = String.valueOf(httpURLConnection.getResponseCode());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = bufferedReader.read();
                if (read == -1) {
                    break;
                }
                sb.append((char) read);
            }
            bufferedReader.close();
            JSONObject jSONObject = new JSONObject(sb.toString());
            new JSONArray();
            new JSONArray();
            if (jSONObject.has("config_v2")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        this.f30326f = new String(new l0().a(jSONObject.getString("config_v2")));
                    } catch (Exception unused3) {
                    }
                }
                if (Build.VERSION.SDK_INT < 26) {
                    try {
                        this.f30326f = new String(new l0().a(jSONObject.getString("config_v2")));
                    } catch (Exception unused4) {
                    }
                }
                JSONObject jSONObject2 = new JSONObject(this.f30326f);
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f30321a);
                this.f30327g = defaultSharedPreferences;
                SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                edit.putString("base", jSONObject2.getString("base"));
                edit.putString("target", jSONObject2.getString("target"));
                edit.putString("watermark", jSONObject2.getString("watermark"));
                edit.putString("watermark_color", jSONObject2.getString("watermark_color"));
                edit.putString("watermark_margin", jSONObject2.getString("watermark_margin"));
                edit.commit();
            }
            if (jSONObject.has("config_v1")) {
                JSONObject jSONObject3 = new JSONObject(jSONObject.getString("config_v1"));
                SharedPreferences.Editor edit2 = this.f30327g.edit();
                edit2.putString("base", jSONObject3.getString("base"));
                edit2.putString("target", jSONObject3.getString("target"));
                edit2.putString("watermark", jSONObject3.getString("watermark"));
                edit2.putString("watermark_color", jSONObject3.getString("watermark_color"));
                edit2.putString("watermark_margin", jSONObject3.getString("watermark_margin"));
                edit2.commit();
            }
            if (jSONObject.has("post_v2")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        this.f30325e = new String(new l0().a(jSONObject.getString("post_v2")));
                    } catch (Exception unused5) {
                    }
                }
                if (Build.VERSION.SDK_INT < 26) {
                    try {
                        this.f30325e = new String(new l0().a(jSONObject.getString("post_v2")));
                    } catch (Exception unused6) {
                    }
                }
            } else {
                this.f30325e = jSONObject.getString("post_v1");
            }
            return this.f30325e;
        } catch (Exception unused7) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        d dVar = this.f30323c;
        if (dVar != null && str != null) {
            dVar.onSuccess(str);
        } else {
            dVar.onError(this.f30324d);
        }
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
    }
}
