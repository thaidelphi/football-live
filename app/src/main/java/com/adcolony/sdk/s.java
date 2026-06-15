package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.e0;
import com.google.protobuf.CodedOutputStream;
import com.ironsource.ls;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private HttpURLConnection f6234a;

    /* renamed from: b  reason: collision with root package name */
    private InputStream f6235b;

    /* renamed from: c  reason: collision with root package name */
    private h0 f6236c;

    /* renamed from: d  reason: collision with root package name */
    private a f6237d;

    /* renamed from: f  reason: collision with root package name */
    private String f6239f;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, List<String>> f6242i;

    /* renamed from: n  reason: collision with root package name */
    boolean f6247n;

    /* renamed from: o  reason: collision with root package name */
    int f6248o;

    /* renamed from: p  reason: collision with root package name */
    int f6249p;

    /* renamed from: e  reason: collision with root package name */
    private g f6238e = null;

    /* renamed from: g  reason: collision with root package name */
    private int f6240g = 0;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6241h = false;

    /* renamed from: j  reason: collision with root package name */
    private String f6243j = "";

    /* renamed from: k  reason: collision with root package name */
    private String f6244k = "";

    /* renamed from: l  reason: collision with root package name */
    String f6245l = "";

    /* renamed from: m  reason: collision with root package name */
    String f6246m = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(s sVar, h0 h0Var, Map<String, List<String>> map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(h0 h0Var, a aVar) {
        this.f6236c = h0Var;
        this.f6237d = aVar;
    }

    private void a(InputStream inputStream, OutputStream outputStream) throws Exception {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] bArr = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, CodedOutputStream.DEFAULT_BUFFER_SIZE);
                if (read != -1) {
                    int i10 = this.f6248o + read;
                    this.f6248o = i10;
                    if (this.f6241h && i10 > this.f6240g) {
                        throw new Exception("Data exceeds expected maximum (" + this.f6248o + "/" + this.f6240g + "): " + this.f6234a.getURL().toString());
                    }
                    outputStream.write(bArr, 0, read);
                } else {
                    String str = "UTF-8";
                    String str2 = this.f6239f;
                    if (str2 != null && !str2.isEmpty()) {
                        str = this.f6239f;
                    }
                    if (outputStream instanceof ByteArrayOutputStream) {
                        String headerField = this.f6234a.getHeaderField("Content-Type");
                        if (this.f6238e != null && headerField != null && headerField.contains("application/octet-stream") && ((ByteArrayOutputStream) outputStream).size() != 0) {
                            this.f6246m = this.f6238e.b(((ByteArrayOutputStream) outputStream).toByteArray());
                        } else {
                            this.f6246m = ((ByteArrayOutputStream) outputStream).toString(str);
                        }
                    }
                    bufferedInputStream.close();
                    if (inputStream != null) {
                        return;
                    }
                    return;
                }
            }
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    private boolean c() throws IOException {
        f1 a10 = this.f6236c.a();
        String h10 = c0.h(a10, "content_type");
        String h11 = c0.h(a10, "content");
        f1 n10 = a10.n("dictionaries");
        f1 n11 = a10.n("dictionaries_mapping");
        this.f6245l = c0.h(a10, "url");
        if (n10 != null) {
            g.a(n10.f());
        }
        if (com.adcolony.sdk.a.b().H() && n11 != null) {
            this.f6238e = g.a(c0.i(n11, "request"), c0.i(n11, ls.f18303n));
        }
        String h12 = c0.h(a10, "user_agent");
        int a11 = c0.a(a10, "read_timeout", 60000);
        int a12 = c0.a(a10, "connect_timeout", 60000);
        boolean b10 = c0.b(a10, "no_redirect");
        this.f6245l = c0.h(a10, "url");
        this.f6243j = c0.h(a10, "filepath");
        StringBuilder sb = new StringBuilder();
        sb.append(com.adcolony.sdk.a.b().z().d());
        String str = this.f6243j;
        sb.append(str.substring(str.lastIndexOf("/") + 1));
        this.f6244k = sb.toString();
        this.f6239f = c0.h(a10, "encoding");
        int a13 = c0.a(a10, "max_size", 0);
        this.f6240g = a13;
        this.f6241h = a13 != 0;
        this.f6248o = 0;
        this.f6235b = null;
        this.f6234a = null;
        this.f6242i = null;
        if (this.f6245l.startsWith("file://")) {
            if (this.f6245l.startsWith("file:///android_asset/")) {
                Context a14 = com.adcolony.sdk.a.a();
                if (a14 != null) {
                    this.f6235b = a14.getAssets().open(this.f6245l.substring(22));
                }
            } else {
                this.f6235b = new FileInputStream(this.f6245l.substring(7));
            }
        } else {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f6245l).openConnection();
            this.f6234a = httpURLConnection;
            httpURLConnection.setReadTimeout(a11);
            this.f6234a.setConnectTimeout(a12);
            this.f6234a.setInstanceFollowRedirects(!b10);
            if (h12 != null && !h12.equals("")) {
                this.f6234a.setRequestProperty("User-Agent", h12);
            }
            if (this.f6238e != null) {
                this.f6234a.setRequestProperty("Content-Type", "application/octet-stream");
                this.f6234a.setRequestProperty("Req-Dict-Id", this.f6238e.b());
                this.f6234a.setRequestProperty("Resp-Dict-Id", this.f6238e.c());
            } else {
                this.f6234a.setRequestProperty("Accept-Charset", h.f6025a.name());
                if (!h10.equals("")) {
                    this.f6234a.setRequestProperty("Content-Type", h10);
                }
            }
            if (this.f6236c.b().equals("WebServices.post")) {
                this.f6234a.setDoOutput(true);
                g gVar = this.f6238e;
                if (gVar != null) {
                    byte[] a15 = gVar.a(h11);
                    this.f6234a.setFixedLengthStreamingMode(a15.length);
                    this.f6234a.getOutputStream().write(a15);
                    this.f6234a.getOutputStream().flush();
                } else {
                    this.f6234a.setFixedLengthStreamingMode(h11.getBytes(h.f6025a).length);
                    new PrintStream(this.f6234a.getOutputStream()).print(h11);
                }
            }
        }
        return (this.f6234a == null && this.f6235b == null) ? false : true;
    }

    private void d() throws Exception {
        OutputStream outputStream;
        InputStream errorStream;
        String b10 = this.f6236c.b();
        if (this.f6235b != null) {
            if (this.f6243j.length() == 0) {
                outputStream = new ByteArrayOutputStream(CodedOutputStream.DEFAULT_BUFFER_SIZE);
            } else {
                outputStream = new FileOutputStream(new File(this.f6243j).getAbsolutePath());
            }
        } else if (b10.equals("WebServices.download")) {
            this.f6235b = this.f6234a.getInputStream();
            outputStream = new FileOutputStream(this.f6244k);
        } else if (b10.equals("WebServices.get")) {
            this.f6235b = this.f6234a.getInputStream();
            outputStream = new ByteArrayOutputStream(CodedOutputStream.DEFAULT_BUFFER_SIZE);
        } else if (b10.equals("WebServices.post")) {
            this.f6234a.connect();
            if (this.f6234a.getResponseCode() >= 200 && this.f6234a.getResponseCode() <= 299) {
                errorStream = this.f6234a.getInputStream();
            } else {
                errorStream = this.f6234a.getErrorStream();
            }
            this.f6235b = errorStream;
            outputStream = new ByteArrayOutputStream(CodedOutputStream.DEFAULT_BUFFER_SIZE);
        } else {
            outputStream = null;
        }
        HttpURLConnection httpURLConnection = this.f6234a;
        if (httpURLConnection != null) {
            this.f6249p = httpURLConnection.getResponseCode();
            this.f6242i = this.f6234a.getHeaderFields();
        }
        a(this.f6235b, outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0 b() {
        return this.f6236c;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z10;
        boolean z11 = false;
        this.f6247n = false;
        try {
            if (c()) {
                d();
                if (this.f6236c.b().equals("WebServices.post") && this.f6249p != 200) {
                    z10 = false;
                    this.f6247n = z10;
                }
                z10 = true;
                this.f6247n = z10;
            }
        } catch (AssertionError e8) {
            new e0.a().a("okhttp error: ").a(e8.toString()).a(e0.f5980h);
            e8.printStackTrace();
        } catch (IllegalArgumentException e10) {
            new e0.a().a("Exception, possibly response encoded with different dictionary: ").a(e10.toString()).a(e0.f5981i);
            e10.printStackTrace();
        } catch (IllegalStateException e11) {
            new e0.a().a("okhttp error: ").a(e11.toString()).a(e0.f5980h);
            e11.printStackTrace();
        } catch (MalformedURLException e12) {
            new e0.a().a("MalformedURLException: ").a(e12.toString()).a(e0.f5981i);
            this.f6247n = true;
        } catch (IOException e13) {
            new e0.a().a("Download of ").a(this.f6245l).a(" failed: ").a(e13.toString()).a(e0.f5979g);
            int i10 = this.f6249p;
            if (i10 == 0) {
                i10 = 504;
            }
            this.f6249p = i10;
        } catch (Exception e14) {
            new e0.a().a("Exception: ").a(e14.toString()).a(e0.f5980h);
            e14.printStackTrace();
        } catch (OutOfMemoryError unused) {
            new e0.a().a("Out of memory error - disabling AdColony. (").a(this.f6248o).a("/").a(this.f6240g).a("): " + this.f6245l).a(e0.f5980h);
            com.adcolony.sdk.a.b().b(true);
        } catch (DataFormatException e15) {
            new e0.a().a("Exception, possibly trying to decompress plain response: ").a(e15.toString()).a(e0.f5981i);
            e15.printStackTrace();
        }
        z11 = true;
        if (z11) {
            if (this.f6236c.b().equals("WebServices.download")) {
                a(this.f6244k, this.f6243j);
            }
            this.f6237d.a(this, this.f6236c, this.f6242i);
        }
    }

    private void a(String str, String str2) {
        try {
            String substring = str2.substring(0, str2.lastIndexOf("/") + 1);
            if (str2.equals("") || substring.equals(com.adcolony.sdk.a.b().z().d()) || new File(str).renameTo(new File(str2))) {
                return;
            }
            new e0.a().a("Moving of ").a(str).a(" failed.").a(e0.f5979g);
        } catch (Exception e8) {
            new e0.a().a("Exception: ").a(e8.toString()).a(e0.f5980h);
            e8.printStackTrace();
        }
    }
}
