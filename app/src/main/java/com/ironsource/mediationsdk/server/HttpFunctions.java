package com.ironsource.mediationsdk.server;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import com.ironsource.o9;
import com.ironsource.xe;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class HttpFunctions {
    public static final String ERROR_PREFIX = "ERROR:";

    /* renamed from: a  reason: collision with root package name */
    private static final int f19129a = 15000;

    /* renamed from: b  reason: collision with root package name */
    private static final String f19130b = "GET";

    /* renamed from: c  reason: collision with root package name */
    private static final String f19131c = "POST";

    /* renamed from: d  reason: collision with root package name */
    private static final String f19132d = "UTF-8";

    /* renamed from: e  reason: collision with root package name */
    private static final String f19133e = "Bad Request - 400";

    /* renamed from: f  reason: collision with root package name */
    private static final ExecutorService f19134f = Executors.newSingleThreadExecutor();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f19135a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f19136b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ xe f19137c;

        a(String str, String str2, xe xeVar) {
            this.f19135a = str;
            this.f19136b = str2;
            this.f19137c = xeVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpURLConnection httpURLConnection;
            OutputStream outputStream;
            try {
                httpURLConnection = HttpFunctions.b(this.f19135a);
                try {
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        try {
                            HttpFunctions.b(this.f19136b, outputStream);
                            int responseCode = httpURLConnection.getResponseCode();
                            boolean z10 = responseCode == 200;
                            if (!z10) {
                                IronLog.INTERNAL.error("invalid response code " + responseCode + " sending request");
                            }
                            this.f19137c.a(z10);
                        } catch (Exception e8) {
                            e = e8;
                            o9.d().a(e);
                            IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                            this.f19137c.a(false);
                            HttpFunctions.b(outputStream, httpURLConnection, null);
                        }
                    } catch (Throwable th) {
                        th = th;
                        HttpFunctions.b(outputStream, httpURLConnection, null);
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    outputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                    HttpFunctions.b(outputStream, httpURLConnection, null);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                httpURLConnection = null;
                outputStream = null;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = null;
                outputStream = null;
            }
            HttpFunctions.b(outputStream, httpURLConnection, null);
        }
    }

    private static String a(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            sb.append(readLine);
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return null;
        }
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HttpURLConnection b(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(f19129a);
        httpURLConnection.setConnectTimeout(f19129a);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(OutputStream outputStream, HttpURLConnection httpURLConnection, BufferedReader bufferedReader) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e8) {
                o9.d().a(e8);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception while closing output stream " + e8.getMessage());
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e10) {
                o9.d().a(e10);
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("exception while closing reader " + e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, f19132d));
        bufferedWriter.write(str);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public static String getStringFromURL(String str) throws Exception {
        return getStringFromURL(str, null);
    }

    public static String getStringFromURL(String str, p.c cVar) {
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        Exception e8;
        BufferedReader bufferedReader2;
        Throwable th;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(f19129a);
                httpURLConnection.setConnectTimeout(f19129a);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 400) {
                    if (cVar != null) {
                        cVar.a(f19133e);
                    }
                    b(null, httpURLConnection, null);
                    return null;
                }
                bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                try {
                    String a10 = a(bufferedReader2);
                    b(null, httpURLConnection, bufferedReader2);
                    return a10;
                } catch (Exception e10) {
                    e8 = e10;
                    try {
                        o9.d().a(e8);
                        b(null, httpURLConnection, bufferedReader2);
                        return null;
                    } catch (Throwable th2) {
                        bufferedReader = bufferedReader2;
                        th = th2;
                        BufferedReader bufferedReader3 = bufferedReader;
                        th = th;
                        bufferedReader2 = bufferedReader3;
                        b(null, httpURLConnection, bufferedReader2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    b(null, httpURLConnection, bufferedReader2);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                e8 = e;
                bufferedReader2 = null;
                o9.d().a(e8);
                b(null, httpURLConnection, bufferedReader2);
                return null;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                BufferedReader bufferedReader32 = bufferedReader;
                th = th;
                bufferedReader2 = bufferedReader32;
                b(null, httpURLConnection, bufferedReader2);
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            httpURLConnection = null;
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            bufferedReader = null;
        }
    }

    public static String sendPostRequest(String str, String str2, p.c cVar) {
        BufferedReader bufferedReader;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection;
        Exception e8;
        BufferedReader bufferedReader2;
        Throwable th;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = b(str);
            try {
                httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                outputStream = httpURLConnection.getOutputStream();
            } catch (Exception e10) {
                e = e10;
                outputStream = null;
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                httpURLConnection2 = httpURLConnection;
                bufferedReader = null;
            }
            try {
                b(str2, outputStream);
                int responseCode = httpURLConnection.getResponseCode();
                if (!(responseCode == 200)) {
                    if (responseCode == 400 && cVar != null) {
                        cVar.a(f19133e);
                    }
                    b(outputStream, httpURLConnection, null);
                    return null;
                }
                bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                try {
                    String a10 = a(bufferedReader2);
                    b(outputStream, httpURLConnection, bufferedReader2);
                    return a10;
                } catch (Exception e11) {
                    e8 = e11;
                    try {
                        o9.d().a(e8);
                        IronLog.INTERNAL.error("exception while sending request " + e8.getMessage());
                        b(outputStream, httpURLConnection, bufferedReader2);
                        return null;
                    } catch (Throwable th3) {
                        httpURLConnection2 = httpURLConnection;
                        bufferedReader = bufferedReader2;
                        th = th3;
                        th = th;
                        bufferedReader2 = bufferedReader;
                        httpURLConnection = httpURLConnection2;
                        b(outputStream, httpURLConnection, bufferedReader2);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    b(outputStream, httpURLConnection, bufferedReader2);
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                e8 = e;
                bufferedReader2 = null;
                o9.d().a(e8);
                IronLog.INTERNAL.error("exception while sending request " + e8.getMessage());
                b(outputStream, httpURLConnection, bufferedReader2);
                return null;
            } catch (Throwable th5) {
                th = th5;
                httpURLConnection2 = httpURLConnection;
                bufferedReader = null;
                th = th;
                bufferedReader2 = bufferedReader;
                httpURLConnection = httpURLConnection2;
                b(outputStream, httpURLConnection, bufferedReader2);
                throw th;
            }
        } catch (Exception e13) {
            e = e13;
            httpURLConnection = null;
            outputStream = null;
        } catch (Throwable th6) {
            th = th6;
            bufferedReader = null;
            outputStream = null;
        }
    }

    public static void sendPostRequest(String str, String str2, xe xeVar) {
        f19134f.submit(new a(str, str2, xeVar));
    }
}
