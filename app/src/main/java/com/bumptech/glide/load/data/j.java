package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
/* compiled from: HttpUrlFetcher.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j implements d<InputStream> {

    /* renamed from: g  reason: collision with root package name */
    static final b f10356g = new a();

    /* renamed from: a  reason: collision with root package name */
    private final c2.g f10357a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10358b;

    /* renamed from: c  reason: collision with root package name */
    private final b f10359c;

    /* renamed from: d  reason: collision with root package name */
    private HttpURLConnection f10360d;

    /* renamed from: e  reason: collision with root package name */
    private InputStream f10361e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f10362f;

    /* compiled from: HttpUrlFetcher.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpUrlFetcher.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public j(c2.g gVar, int i10) {
        this(gVar, i10, f10356g);
    }

    private HttpURLConnection c(URL url, Map<String, String> map) throws w1.e {
        try {
            HttpURLConnection a10 = this.f10359c.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a10.addRequestProperty(entry.getKey(), entry.getValue());
            }
            a10.setConnectTimeout(this.f10358b);
            a10.setReadTimeout(this.f10358b);
            a10.setUseCaches(false);
            a10.setDoInput(true);
            a10.setInstanceFollowRedirects(false);
            return a10;
        } catch (IOException e8) {
            throw new w1.e("URL.openConnection threw", 0, e8);
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e8) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e8);
                return -1;
            }
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) throws w1.e {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f10361e = s2.c.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f10361e = httpURLConnection.getInputStream();
            }
            return this.f10361e;
        } catch (IOException e8) {
            throw new w1.e("Failed to obtain InputStream", f(httpURLConnection), e8);
        }
    }

    private static boolean h(int i10) {
        return i10 / 100 == 2;
    }

    private static boolean i(int i10) {
        return i10 / 100 == 3;
    }

    private InputStream j(URL url, int i10, URL url2, Map<String, String> map) throws w1.e {
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new w1.e("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection c10 = c(url, map);
            this.f10360d = c10;
            try {
                c10.connect();
                this.f10361e = this.f10360d.getInputStream();
                if (this.f10362f) {
                    return null;
                }
                int f10 = f(this.f10360d);
                if (h(f10)) {
                    return g(this.f10360d);
                }
                if (!i(f10)) {
                    if (f10 == -1) {
                        throw new w1.e(f10);
                    }
                    try {
                        throw new w1.e(this.f10360d.getResponseMessage(), f10);
                    } catch (IOException e8) {
                        throw new w1.e("Failed to get a response message", f10, e8);
                    }
                }
                String headerField = this.f10360d.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    try {
                        URL url3 = new URL(url, headerField);
                        b();
                        return j(url3, i10 + 1, url, map);
                    } catch (MalformedURLException e10) {
                        throw new w1.e("Bad redirect url: " + headerField, f10, e10);
                    }
                }
                throw new w1.e("Received empty or null redirect url", f10);
            } catch (IOException e11) {
                throw new w1.e("Failed to connect or obtain data", f(this.f10360d), e11);
            }
        }
        throw new w1.e("Too many (> 5) redirects!", -1);
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f10361e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f10360d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f10360d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f10362f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public w1.a d() {
        return w1.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) {
        StringBuilder sb;
        long b10 = s2.f.b();
        try {
            try {
                aVar.f(j(this.f10357a.h(), 0, null, this.f10357a.e()));
            } catch (IOException e8) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e8);
                }
                aVar.c(e8);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
                sb = new StringBuilder();
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(s2.f.a(b10));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + s2.f.a(b10));
            }
            throw th;
        }
    }

    j(c2.g gVar, int i10, b bVar) {
        this.f10357a = gVar;
        this.f10358b = i10;
        this.f10359c = bVar;
    }
}
