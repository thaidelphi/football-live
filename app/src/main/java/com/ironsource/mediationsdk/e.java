package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.in;
import com.ironsource.ls;
import com.ironsource.m5;
import com.ironsource.mb;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.o5;
import com.ironsource.o9;
import com.ironsource.s4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f18787a = "1";

    /* renamed from: b  reason: collision with root package name */
    private final String f18788b = "102";

    /* renamed from: c  reason: collision with root package name */
    private final String f18789c = "102";

    /* renamed from: d  reason: collision with root package name */
    private final String f18790d = "GenericNotifications";

    /* renamed from: e  reason: collision with root package name */
    private f f18791e;

    /* renamed from: f  reason: collision with root package name */
    private IronSource.AD_UNIT f18792f;

    /* renamed from: g  reason: collision with root package name */
    private o5 f18793g;

    /* renamed from: h  reason: collision with root package name */
    private s4 f18794h;

    /* renamed from: i  reason: collision with root package name */
    private ISBannerSize f18795i;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        protected s4 f18796a;

        /* renamed from: b  reason: collision with root package name */
        protected d.a f18797b;

        /* renamed from: c  reason: collision with root package name */
        protected int f18798c;

        /* renamed from: d  reason: collision with root package name */
        protected String f18799d;

        /* renamed from: e  reason: collision with root package name */
        protected long f18800e;

        /* renamed from: f  reason: collision with root package name */
        protected int f18801f;

        /* renamed from: h  reason: collision with root package name */
        private int f18803h;

        /* renamed from: k  reason: collision with root package name */
        private final URL f18806k;

        /* renamed from: l  reason: collision with root package name */
        private final JSONObject f18807l;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f18808m;

        /* renamed from: n  reason: collision with root package name */
        private final int f18809n;

        /* renamed from: o  reason: collision with root package name */
        private final long f18810o;

        /* renamed from: p  reason: collision with root package name */
        private final boolean f18811p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f18812q;

        /* renamed from: g  reason: collision with root package name */
        protected String f18802g = "other";

        /* renamed from: i  reason: collision with root package name */
        protected String f18804i = "";

        /* renamed from: j  reason: collision with root package name */
        protected int f18805j = 0;

        public a(s4 s4Var, URL url, JSONObject jSONObject, boolean z10, int i10, long j10, boolean z11, boolean z12, int i11) {
            this.f18796a = s4Var;
            this.f18806k = url;
            this.f18807l = jSONObject;
            this.f18808m = z10;
            this.f18809n = i10;
            this.f18810o = j10;
            this.f18811p = z11;
            this.f18812q = z12;
            this.f18803h = i11;
        }

        private String a() {
            return this.f18803h == 2 ? mb.b().d() : mb.b().c();
        }

        private String a(HttpURLConnection httpURLConnection) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
                sb.append(readLine);
            }
        }

        private HttpURLConnection a(URL url, long j10) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod(in.f17849b);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j10);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        private JSONObject a(String str, String str2) throws JSONException {
            String decode = IronSourceAES.decode(str, str2);
            if (TextUtils.isEmpty(decode)) {
                throw new JSONException("decryption error");
            }
            return new JSONObject(decode);
        }

        private void a(long j10, long j11) {
            long time = j10 - (new Date().getTime() - j11);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(java.net.HttpURLConnection r9, org.json.JSONObject r10, boolean r11) throws java.lang.Exception {
            /*
                r8 = this;
                java.io.OutputStream r9 = r9.getOutputStream()
                java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
                java.lang.String r1 = "UTF-8"
                r0.<init>(r9, r1)
                java.io.BufferedWriter r1 = new java.io.BufferedWriter
                r1.<init>(r0)
                int r2 = r8.f18803h
                r3 = 1
                r4 = 2
                if (r2 != r4) goto L4d
                com.ironsource.mb r2 = com.ironsource.mb.b()     // Catch: org.json.JSONException -> L1f
                java.lang.String r2 = r2.a()     // Catch: org.json.JSONException -> L1f
                goto L4f
            L1f:
                r2 = move-exception
                com.ironsource.o9 r5 = com.ironsource.o9.d()
                r5.a(r2)
                java.lang.String r5 = r2.getLocalizedMessage()
                r8.f18804i = r5
                r5 = 1015(0x3f7, float:1.422E-42)
                r8.f18805j = r5
                r8.f18803h = r3
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "get encrypted session key exception "
                r6.append(r7)
                java.lang.String r2 = r2.getMessage()
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r5.error(r2)
            L4d:
                java.lang.String r2 = ""
            L4f:
                java.lang.String r10 = r10.toString()
                java.lang.String r5 = r8.a()
                if (r11 == 0) goto L65
                com.ironsource.mediationsdk.logger.IronLog r11 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.String r6 = "compressing and encrypting auction request"
                r11.verbose(r6)
                java.lang.String r10 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r5, r10)
                goto L69
            L65:
                java.lang.String r10 = com.ironsource.mediationsdk.utils.IronSourceAES.encode(r5, r10)
            L69:
                int r11 = r8.f18803h
                r5 = 0
                if (r11 != r4) goto L7b
                java.lang.Object[] r11 = new java.lang.Object[r4]
                r11[r5] = r2
                r11[r3] = r10
                java.lang.String r10 = "{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}"
                java.lang.String r10 = java.lang.String.format(r10, r11)
                goto L85
            L7b:
                java.lang.Object[] r11 = new java.lang.Object[r3]
                r11[r5] = r10
                java.lang.String r10 = "{\"request\" : \"%1$s\"}"
                java.lang.String r10 = java.lang.String.format(r10, r11)
            L85:
                r1.write(r10)
                r1.flush()
                r1.close()
                r0.close()
                r9.close()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.e.a.a(java.net.HttpURLConnection, org.json.JSONObject, boolean):void");
        }

        private JSONObject b(String str, String str2) throws JSONException {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String decryptAndDecompress = IronSourceAES.decryptAndDecompress(str, str2);
            if (decryptAndDecompress != null) {
                return new JSONObject(decryptAndDecompress);
            }
            throw new JSONException("decompression error");
        }

        protected JSONObject a(JSONObject jSONObject, boolean z10) throws JSONException {
            String a10 = a();
            String string = jSONObject.getString(this.f18803h == 2 ? "ct" : ls.f18303n);
            return z10 ? b(a10, string) : a(a10, string);
        }

        protected void a(String str, boolean z10, boolean z11) throws JSONException {
            if (TextUtils.isEmpty(str)) {
                throw new JSONException("empty response");
            }
            JSONObject jSONObject = new JSONObject(str);
            if (z10) {
                jSONObject = a(jSONObject, z11);
            }
            d.a a10 = d.b().a(jSONObject);
            this.f18797b = a10;
            this.f18798c = a10.c();
            this.f18799d = this.f18797b.d();
        }

        protected void a(boolean z10, s4 s4Var, long j10) {
            if (z10) {
                s4Var.a(this.f18797b.h(), this.f18797b.a(), this.f18797b.e(), this.f18797b.f(), this.f18797b.b(), this.f18801f + 1, j10, this.f18805j, this.f18804i);
            } else {
                s4Var.a(this.f18798c, this.f18799d, this.f18801f + 1, this.f18802g, j10);
            }
        }

        protected boolean b() {
            long time;
            int responseCode;
            String str;
            this.f18800e = new Date().getTime();
            try {
                this.f18803h = this.f18805j == 1015 ? 1 : this.f18803h;
                this.f18801f = 0;
                HttpURLConnection httpURLConnection = null;
                while (true) {
                    int i10 = this.f18801f;
                    int i11 = this.f18809n;
                    if (i10 >= i11) {
                        this.f18801f = i11 - 1;
                        this.f18802g = "trials_fail";
                        return false;
                    }
                    try {
                        time = new Date().getTime();
                        String str2 = "Auction Handler: auction trial " + (this.f18801f + 1) + " out of " + this.f18809n + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str2, 0);
                        IronSourceUtils.sendAutomationLog(str2);
                        httpURLConnection = a(this.f18806k, this.f18810o);
                        a(httpURLConnection, this.f18807l, this.f18811p);
                        responseCode = httpURLConnection.getResponseCode();
                    } catch (SocketTimeoutException e8) {
                        o9.d().a(e8);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f18798c = 1006;
                        this.f18799d = "Connection timed out";
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e8.getMessage());
                    } catch (Throwable th) {
                        o9.d().a(th);
                        IronLog.INTERNAL.error("getting exception " + th);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f18798c = 1000;
                        this.f18799d = th.getMessage();
                        this.f18802g = "other";
                        return false;
                    }
                    if (responseCode == 200 || responseCode == 204) {
                        try {
                            a(a(httpURLConnection), this.f18808m, this.f18812q);
                            httpURLConnection.disconnect();
                            return true;
                        } catch (JSONException e10) {
                            o9.d().a(e10);
                            if (e10.getMessage() != null && e10.getMessage().equalsIgnoreCase("decryption error")) {
                                this.f18798c = 1003;
                                str = "Auction decryption error";
                            } else if (e10.getMessage() == null || !e10.getMessage().equalsIgnoreCase("decompression error")) {
                                this.f18798c = 1002;
                                str = "Auction parsing error";
                            } else {
                                this.f18798c = 1008;
                                str = "Auction decompression error";
                            }
                            this.f18799d = str;
                            this.f18802g = "parsing";
                            IronLog.INTERNAL.error("Auction handle response exception " + e10.getMessage());
                            httpURLConnection.disconnect();
                            return false;
                        }
                    }
                    this.f18798c = 1001;
                    String str3 = "Auction response code not valid, error code response from server - " + responseCode;
                    this.f18799d = str3;
                    IronLog.INTERNAL.error(str3);
                    httpURLConnection.disconnect();
                    if (this.f18801f < this.f18809n - 1) {
                        a(this.f18810o, time);
                    }
                    this.f18801f++;
                }
            } catch (Exception e11) {
                o9.d().a(e11);
                this.f18798c = 1007;
                this.f18799d = e11.getMessage();
                this.f18801f = 0;
                this.f18802g = "other";
                IronLog.INTERNAL.error("Auction request exception " + e11.getMessage());
                return false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean b10 = b();
            s4 s4Var = this.f18796a;
            if (s4Var == null) {
                return;
            }
            a(b10, s4Var, new Date().getTime() - this.f18800e);
        }
    }

    @Deprecated
    public e(IronSource.AD_UNIT ad_unit, o5 o5Var, s4 s4Var) {
        this.f18792f = ad_unit;
        this.f18793g = o5Var;
        this.f18794h = s4Var;
    }

    public e(f fVar) {
        this.f18791e = fVar;
    }

    private JSONObject a(Map<String, Object> map, List<String> list, h hVar, int i10, boolean z10, IronSourceSegment ironSourceSegment) throws JSONException {
        i iVar = new i(this.f18792f);
        iVar.a(map);
        iVar.a(list);
        iVar.a(hVar);
        iVar.a(i10);
        iVar.a(this.f18795i);
        iVar.a(ironSourceSegment);
        iVar.b(z10);
        return d.b().a(iVar);
    }

    public void a(Context context, i iVar, s4 s4Var) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f18791e.a(context, iVar, s4Var));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("execute auction exception " + e8.getMessage());
            if (s4Var != null) {
                s4Var.a(1000, e8.getMessage(), 0, "other", 0L);
            }
        }
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i10, IronSourceSegment ironSourceSegment) {
        try {
            boolean isEncryptedResponse = IronSourceUtils.isEncryptedResponse();
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(this.f18794h, new URL(this.f18793g.a(false)), a(map, list, hVar, i10, isEncryptedResponse, ironSourceSegment), isEncryptedResponse, this.f18793g.g(), this.f18793g.m(), this.f18793g.n(), this.f18793g.o(), this.f18793g.d()));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("execute auction exception " + e8.getMessage());
            this.f18794h.a(1000, e8.getMessage(), 0, "other", 0L);
        }
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i10, IronSourceSegment ironSourceSegment, ISBannerSize iSBannerSize) {
        this.f18795i = iSBannerSize;
        a(context, map, list, hVar, i10, ironSourceSegment);
    }

    public void a(m5 m5Var, int i10, m5 m5Var2) {
        for (String str : m5Var.h()) {
            d.b().a("reportLoadSuccess", m5Var.c(), d.b().a(str, i10, m5Var, "", "", ""));
        }
        if (m5Var2 != null) {
            for (String str2 : m5Var2.h()) {
                d.b().a("reportLoadSuccess", "GenericNotifications", d.b().a(str2, i10, m5Var, "", "102", ""));
            }
        }
    }

    public void a(m5 m5Var, int i10, m5 m5Var2, String str) {
        for (String str2 : m5Var.b()) {
            d.b().a("reportImpression", m5Var.c(), d.b().a(str2, i10, m5Var, "", "", str));
        }
        if (m5Var2 != null) {
            for (String str3 : m5Var2.b()) {
                d.b().a("reportImpression", "GenericNotifications", d.b().a(str3, i10, m5Var, "", "102", str));
            }
        }
    }

    public void a(ArrayList<String> arrayList, ConcurrentHashMap<String, m5> concurrentHashMap, int i10, m5 m5Var, m5 m5Var2) {
        int j10 = m5Var2.j();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!next.equals(m5Var2.c())) {
                m5 m5Var3 = concurrentHashMap.get(next);
                int j11 = m5Var3.j();
                String i11 = m5Var3.i();
                String str = j11 < j10 ? "1" : "102";
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("instance=" + m5Var3.c() + ", instancePriceOrder= " + j11 + ", loseReasonCode=" + str + ", winnerInstance=" + m5Var2.c() + ", winnerInstancePriceOrder=" + j10);
                for (String str2 : m5Var3.g()) {
                    d.b().a("reportAuctionLose", m5Var3.c(), d.b().a(str2, i10, m5Var2, i11, str, ""));
                }
            }
        }
        if (m5Var != null) {
            for (String str3 : m5Var.g()) {
                d.b().a("reportAuctionLose", "GenericNotifications", d.b().a(str3, i10, m5Var2, "", "102", ""));
            }
        }
    }

    public void a(CopyOnWriteArrayList<y> copyOnWriteArrayList, ConcurrentHashMap<String, m5> concurrentHashMap, int i10, m5 m5Var, m5 m5Var2) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<y> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        a(arrayList, concurrentHashMap, i10, m5Var, m5Var2);
    }

    public boolean a() {
        return this.f18791e.a();
    }
}
