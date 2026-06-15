package com.ironsource;

import android.net.Uri;
import android.util.Pair;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class rg {

    /* renamed from: a  reason: collision with root package name */
    private static final String f19945a = "POST";

    /* renamed from: b  reason: collision with root package name */
    private static final String f19946b = "GET";

    /* renamed from: c  reason: collision with root package name */
    private static final String f19947c = "ISHttpService";

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class a {

        /* renamed from: h  reason: collision with root package name */
        private static final int f19948h = 15000;

        /* renamed from: i  reason: collision with root package name */
        private static final int f19949i = 15000;

        /* renamed from: j  reason: collision with root package name */
        private static final String f19950j = "UTF-8";

        /* renamed from: a  reason: collision with root package name */
        final String f19951a;

        /* renamed from: b  reason: collision with root package name */
        final String f19952b;

        /* renamed from: c  reason: collision with root package name */
        final String f19953c;

        /* renamed from: d  reason: collision with root package name */
        final int f19954d;

        /* renamed from: e  reason: collision with root package name */
        final int f19955e;

        /* renamed from: f  reason: collision with root package name */
        final String f19956f;

        /* renamed from: g  reason: collision with root package name */
        ArrayList<Pair<String, String>> f19957g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.ironsource.rg$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static class C0229a {

            /* renamed from: b  reason: collision with root package name */
            String f19959b;

            /* renamed from: d  reason: collision with root package name */
            String f19961d;

            /* renamed from: a  reason: collision with root package name */
            List<Pair<String, String>> f19958a = new ArrayList();

            /* renamed from: c  reason: collision with root package name */
            String f19960c = "POST";

            /* renamed from: e  reason: collision with root package name */
            int f19962e = 15000;

            /* renamed from: f  reason: collision with root package name */
            int f19963f = 15000;

            /* renamed from: g  reason: collision with root package name */
            String f19964g = a.f19950j;

            C0229a() {
            }

            C0229a a(int i10) {
                this.f19962e = i10;
                return this;
            }

            C0229a a(Pair<String, String> pair) {
                this.f19958a.add(pair);
                return this;
            }

            C0229a a(String str) {
                this.f19961d = str;
                return this;
            }

            C0229a a(List<Pair<String, String>> list) {
                this.f19958a.addAll(list);
                return this;
            }

            a a() {
                return new a(this);
            }

            C0229a b(int i10) {
                this.f19963f = i10;
                return this;
            }

            C0229a b(String str) {
                this.f19964g = str;
                return this;
            }

            C0229a c(String str) {
                this.f19959b = str;
                return this;
            }

            C0229a d(String str) {
                this.f19960c = str;
                return this;
            }
        }

        public a(C0229a c0229a) {
            this.f19951a = c0229a.f19959b;
            this.f19952b = c0229a.f19960c;
            this.f19953c = c0229a.f19961d;
            this.f19957g = new ArrayList<>(c0229a.f19958a);
            this.f19954d = c0229a.f19962e;
            this.f19955e = c0229a.f19963f;
            this.f19956f = c0229a.f19964g;
        }

        boolean a() {
            return "POST".equals(this.f19952b);
        }
    }

    public static fq a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri build = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C0229a c0229a = new a.C0229a();
        c0229a.c(build.toString()).a(str2).d("GET").a(list);
        return b(c0229a.a());
    }

    private static HttpURLConnection a(a aVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.f19951a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.f19954d);
        httpURLConnection.setReadTimeout(aVar.f19955e);
        httpURLConnection.setRequestMethod(aVar.f19952b);
        return httpURLConnection;
    }

    private static void a(HttpURLConnection httpURLConnection, a aVar) throws Exception {
        if (aVar.a()) {
            byte[] bytes = aVar.f19953c.getBytes(aVar.f19956f);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(bytes.length));
            a(httpURLConnection, bytes);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) throws ProtocolException {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    private static boolean a(String str, String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
        r6 = r3.getResponseCode();
        r2.f17495a = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
        if (r6 < 400) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
        android.util.Log.d(com.ironsource.rg.f19947c, "Failed post to " + r9.f19951a + " StatusCode: " + r2.f17495a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
        if (r4 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
        r8 = r4;
        r4 = r3;
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
        r4.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r3 != null) goto L15;
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a0: MOVE  (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:42:0x00a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ironsource.fq b(com.ironsource.rg.a r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.rg.b(com.ironsource.rg$a):com.ironsource.fq");
    }

    public static fq b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C0229a c0229a = new a.C0229a();
        c0229a.c(str).a(str2).d("POST").a(list);
        return b(c0229a.a());
    }
}
