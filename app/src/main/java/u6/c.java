package u6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.d;
import com.ironsource.cc;
import com.ironsource.in;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import o6.i;
import org.json.JSONException;
import org.json.JSONObject;
import u6.d;
import u6.f;
/* compiled from: FirebaseInstallationServiceClient.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f31592d = Pattern.compile("[0-9]+s");

    /* renamed from: e  reason: collision with root package name */
    private static final Charset f31593e = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final Context f31594a;

    /* renamed from: b  reason: collision with root package name */
    private final q6.b<i> f31595b;

    /* renamed from: c  reason: collision with root package name */
    private final e f31596c = new e();

    public c(Context context, q6.b<i> bVar) {
        this.f31594a = context;
        this.f31595b = bVar;
    }

    private static String a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    private static JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.1.3");
            return jSONObject;
        } catch (JSONException e8) {
            throw new IllegalStateException(e8);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.1.3");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e8) {
            throw new IllegalStateException(e8);
        }
    }

    private String f() {
        try {
            Context context = this.f31594a;
            byte[] a10 = AndroidUtilsLight.a(context, context.getPackageName());
            if (a10 == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f31594a.getPackageName());
                return null;
            }
            return Hex.b(a10, false);
        } catch (PackageManager.NameNotFoundException e8) {
            Log.e("ContentValues", "No such package: " + this.f31594a.getPackageName(), e8);
            return null;
        }
    }

    private URL g(String str) throws com.google.firebase.installations.d {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e8) {
            throw new com.google.firebase.installations.d(e8.getMessage(), d.a.UNAVAILABLE);
        }
    }

    private static byte[] h(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean i(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    private static void j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String o10 = o(httpURLConnection);
        if (TextUtils.isEmpty(o10)) {
            return;
        }
        Log.w("Firebase-Installations", o10);
        Log.w("Firebase-Installations", a(str, str2, str3));
    }

    private HttpURLConnection l(URL url, String str) throws com.google.firebase.installations.d {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
            httpURLConnection.addRequestProperty("Content-Type", cc.L);
            httpURLConnection.addRequestProperty("Accept", cc.L);
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f31594a.getPackageName());
            i iVar = this.f31595b.get();
            if (iVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(iVar.a()));
                } catch (InterruptedException e8) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e8);
                } catch (ExecutionException e10) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e10);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
    }

    @VisibleForTesting
    static long m(String str) {
        Preconditions.b(f31592d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private d n(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f31593e));
        f.a a10 = f.a();
        d.a a11 = d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a11.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a11.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a11.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a10.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a10.d(m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a11.b(a10.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a11.e(d.b.OK).a();
    }

    private static String o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f31593e));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    private f p(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f31593e));
        f.a a10 = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a10.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a10.d(m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a10.b(f.b.OK).a();
    }

    private void q(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        s(httpURLConnection, h(b(str, str2)));
    }

    private void r(HttpURLConnection httpURLConnection) throws IOException {
        s(httpURLConnection, h(c()));
    }

    private static void s(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    public d d(String str, String str2, String str3, String str4, String str5) throws com.google.firebase.installations.d {
        int responseCode;
        d n10;
        if (this.f31596c.b()) {
            URL g10 = g(String.format("projects/%s/installations", str3));
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection l10 = l(g10, str);
                try {
                    l10.setRequestMethod(in.f17849b);
                    l10.setDoOutput(true);
                    if (str5 != null) {
                        l10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    q(l10, str2, str4);
                    responseCode = l10.getResponseCode();
                    this.f31596c.f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (i(responseCode)) {
                    n10 = n(l10);
                } else {
                    k(l10, str4, str, str3);
                    if (responseCode == 429) {
                        throw new com.google.firebase.installations.d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", d.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        j();
                        n10 = d.a().e(d.b.BAD_CONFIG).a();
                    } else {
                        l10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                l10.disconnect();
                TrafficStats.clearThreadStatsTag();
                return n10;
            }
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }

    public f e(String str, String str2, String str3, String str4) throws com.google.firebase.installations.d {
        int responseCode;
        f p10;
        if (this.f31596c.b()) {
            URL g10 = g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection l10 = l(g10, str);
                try {
                    l10.setRequestMethod(in.f17849b);
                    l10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    l10.setDoOutput(true);
                    r(l10);
                    responseCode = l10.getResponseCode();
                    this.f31596c.f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (i(responseCode)) {
                    p10 = p(l10);
                } else {
                    k(l10, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode == 429) {
                            throw new com.google.firebase.installations.d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", d.a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            j();
                            p10 = f.a().b(f.b.BAD_CONFIG).a();
                        } else {
                            l10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    p10 = f.a().b(f.b.AUTH_ERROR).a();
                }
                l10.disconnect();
                TrafficStats.clearThreadStatsTag();
                return p10;
            }
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }
}
