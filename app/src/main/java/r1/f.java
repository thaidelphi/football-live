package r1;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import com.ironsource.b9;
import com.ironsource.cc;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
/* compiled from: UrlGetter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class f extends AsyncTask<Void, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    private String f30336a = getClass().getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private Context f30337b;

    /* renamed from: c  reason: collision with root package name */
    private String f30338c;

    /* renamed from: d  reason: collision with root package name */
    private String f30339d;

    /* renamed from: e  reason: collision with root package name */
    private String f30340e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f30341f;

    /* renamed from: g  reason: collision with root package name */
    private c f30342g;

    /* renamed from: h  reason: collision with root package name */
    JSONObject f30343h;

    /* renamed from: i  reason: collision with root package name */
    public String f30344i;

    /* renamed from: j  reason: collision with root package name */
    URL f30345j;

    public f(Context context, String str, String str2, String str3, c cVar) {
        this.f30337b = context;
        this.f30338c = str;
        this.f30339d = str2;
        this.f30342g = cVar;
        this.f30340e = str3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Void... voidArr) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    this.f30345j = new URL(this.f30338c);
                } catch (Exception unused) {
                }
            }
            if (Build.VERSION.SDK_INT < 26) {
                try {
                    this.f30345j = new URL(this.f30338c);
                } catch (Exception unused2) {
                }
            }
            URL url = new URL(this.f30338c);
            this.f30345j = url;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestProperty("Content-Type", cc.L);
            if (!this.f30339d.isEmpty() && !this.f30339d.equals("")) {
                httpURLConnection.setRequestProperty("User-agent", this.f30339d);
            }
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
            if (!this.f30340e.isEmpty() && !this.f30340e.equals("")) {
                httpURLConnection.setRequestProperty("referer", this.f30340e);
            }
            this.f30344i = String.valueOf(httpURLConnection.getResponseCode());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine + "\n");
            }
            bufferedReader.close();
            JSONObject jSONObject = new JSONObject(sb.toString());
            this.f30343h = jSONObject;
            return (jSONObject.has("rawUrl") && this.f30343h.getString("rawUrl").startsWith("http")) ? this.f30343h.getString("rawUrl") : "";
        } catch (Exception e8) {
            this.f30341f = e8;
            return b9.h.f16676t;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        if (this.f30342g != null && this.f30344i.equals("200")) {
            this.f30342g.a(str, "", "");
        } else {
            this.f30342g.onError(str.toString(), "");
        }
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
    }
}
