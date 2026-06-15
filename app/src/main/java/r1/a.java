package r1;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.webkit.WebSettings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.URL;
/* compiled from: HttpGetCategory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a extends AsyncTask<Void, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    private String f30314a = getClass().getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private Context f30315b;

    /* renamed from: c  reason: collision with root package name */
    private String f30316c;

    /* renamed from: d  reason: collision with root package name */
    private c f30317d;

    /* renamed from: e  reason: collision with root package name */
    public String f30318e;

    /* renamed from: f  reason: collision with root package name */
    public String f30319f;

    /* renamed from: g  reason: collision with root package name */
    URL f30320g;

    public a(Context context, String str, c cVar) {
        this.f30315b = context;
        this.f30316c = str;
        this.f30317d = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Void... voidArr) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    this.f30320g = new URL(this.f30316c);
                } catch (Exception unused) {
                }
            }
            if (Build.VERSION.SDK_INT < 26) {
                try {
                    this.f30320g = new URL(this.f30316c);
                } catch (Exception unused2) {
                }
            }
            URL url = new URL(this.f30316c);
            this.f30320g = url;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection(Proxy.NO_PROXY);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestProperty("Content-Type", "application/javascript");
            httpURLConnection.setRequestProperty("User-agent", WebSettings.getDefaultUserAgent(this.f30315b));
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(15000);
            this.f30318e = String.valueOf(httpURLConnection.getResponseCode());
            this.f30319f = httpURLConnection.getHeaderField("content-type");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = bufferedReader.read();
                if (read != -1) {
                    sb.append((char) read);
                } else {
                    bufferedReader.close();
                    return sb.toString();
                }
            }
        } catch (SocketTimeoutException unused3) {
            this.f30318e = "timeout";
            return null;
        } catch (IOException unused4) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        c cVar = this.f30317d;
        if (cVar != null && str != null) {
            cVar.a(str, this.f30318e, this.f30319f);
        } else {
            cVar.onError(this.f30318e, this.f30319f);
        }
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
    }
}
