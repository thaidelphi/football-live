package r1;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import com.ironsource.in;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Locale;
/* compiled from: Myhttp.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e extends AsyncTask<Void, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    private String f30329a = getClass().getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private Context f30330b;

    /* renamed from: c  reason: collision with root package name */
    private String f30331c;

    /* renamed from: d  reason: collision with root package name */
    private c f30332d;

    /* renamed from: e  reason: collision with root package name */
    public String f30333e;

    /* renamed from: f  reason: collision with root package name */
    URL f30334f;

    /* renamed from: g  reason: collision with root package name */
    String f30335g;

    public e(Context context, String str, String str2, c cVar) {
        this.f30330b = context;
        this.f30331c = str;
        this.f30332d = cVar;
        this.f30335g = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Void... voidArr) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    this.f30334f = new URL(this.f30331c);
                } catch (Exception unused) {
                }
            }
            if (Build.VERSION.SDK_INT < 26) {
                try {
                    this.f30334f = new URL(this.f30331c);
                } catch (Exception unused2) {
                }
            }
            if (this.f30331c.contains("?CM=")) {
                this.f30334f = new URL(this.f30331c.split("\\?CM=")[0]);
            } else if (this.f30331c.contains("?postbody=")) {
                this.f30334f = new URL(this.f30331c.split("\\?postbody=")[0]);
            } else {
                this.f30334f = new URL(this.f30331c);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) this.f30334f.openConnection(Proxy.NO_PROXY);
            httpURLConnection.setUseCaches(false);
            if (this.f30335g.isEmpty()) {
                this.f30335g = System.getProperty("java.vm.name") + "/" + System.getProperty("java.vm.version") + " (" + System.getProperty("os.name") + "; U; Android " + Build.VERSION.RELEASE + "; " + Build.MODEL + " Build/" + Build.ID + ")";
            }
            httpURLConnection.setRequestProperty("User-agent", this.f30335g);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setConnectTimeout(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
            httpURLConnection.setReadTimeout(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
            if (this.f30331c.contains("?CM=")) {
                httpURLConnection.setRequestMethod(this.f30331c.split("\\?CM=")[1].toUpperCase(Locale.ROOT));
            }
            if (this.f30331c.contains("?postbody=")) {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod(in.f17849b);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
                outputStreamWriter.write(this.f30331c.split("\\?postbody=")[1]);
                outputStreamWriter.flush();
                outputStreamWriter.close();
                outputStream.close();
                httpURLConnection.connect();
            }
            this.f30333e = String.valueOf(httpURLConnection.getResponseCode());
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
            this.f30333e = "timeout";
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
        c cVar = this.f30332d;
        if (cVar != null && str != null) {
            cVar.a(str, "", "");
        } else {
            cVar.onError(this.f30333e, "");
        }
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
    }
}
