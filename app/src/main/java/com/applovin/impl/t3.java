package com.applovin.impl;

import android.os.Process;
import android.os.SystemClock;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.t3;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class t3 {

    /* renamed from: a  reason: collision with root package name */
    private final PriorityBlockingQueue f9246a = new PriorityBlockingQueue();

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.j f9247b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private final BlockingQueue f9248a;

        /* renamed from: b  reason: collision with root package name */
        private final com.applovin.impl.sdk.j f9249b;

        private void a() {
            b((c) this.f9248a.take());
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Multi-variable type inference failed */
        private void b(final c cVar) {
            Throwable th;
            InputStream inputStream;
            HttpURLConnection httpURLConnection;
            InputStream inputStream2;
            long elapsedRealtime;
            InputStream inputStream3;
            InputStream inputStream4;
            byte[] bArr;
            byte[] bArr2;
            InputStream inputStream5;
            InputStream inputStream6;
            InputStream inputStream7;
            InputStream inputStream8;
            Throwable th2;
            byte[] bArr3;
            HttpURLConnection httpURLConnection2;
            long elapsedRealtime2;
            byte[] bArr4;
            byte[] bArr5;
            byte[] bArr6;
            int i10 = 0;
            if (((Boolean) this.f9249b.a(o4.f8258y)).booleanValue()) {
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                try {
                    httpURLConnection2 = a(cVar);
                    try {
                        if (cVar.f9254d != null && cVar.f9254d.length > 0) {
                            httpURLConnection2.setDoOutput(true);
                            httpURLConnection2.setFixedLengthStreamingMode(cVar.f9254d.length);
                            OutputStream outputStream = httpURLConnection2.getOutputStream();
                            outputStream.write(cVar.f9254d);
                            outputStream.close();
                        }
                        elapsedRealtime3 = SystemClock.elapsedRealtime();
                        i10 = httpURLConnection2.getResponseCode();
                        elapsedRealtime2 = SystemClock.elapsedRealtime();
                        if (i10 > 0) {
                            try {
                                InputStream inputStream9 = httpURLConnection2.getInputStream();
                                bArr3 = o0.a(inputStream9, this.f9249b);
                                if (inputStream9 != null) {
                                    try {
                                        inputStream9.close();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            HashMap hashMap = new HashMap();
                                            CollectionUtils.putStringIfValid("details", "responseDataInputStream", hashMap);
                                            this.f9249b.D().a("NetworkCommunicationThread", "processRequest", th, hashMap);
                                            throw th;
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            try {
                                                elapsedRealtime2 = SystemClock.elapsedRealtime();
                                                this.f9249b.I().a("NetworkCommunicationThread", th2);
                                                this.f9249b.I();
                                                if (com.applovin.impl.sdk.n.a()) {
                                                    this.f9249b.I().d("NetworkCommunicationThread", "Failed to make HTTP request", th2);
                                                }
                                                if (httpURLConnection2 != null) {
                                                    try {
                                                        InputStream errorStream = httpURLConnection2.getErrorStream();
                                                        bArr4 = o0.a(errorStream, this.f9249b);
                                                        if (errorStream != null) {
                                                            try {
                                                                errorStream.close();
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                this.f9249b.I().a("NetworkCommunicationThread", th2);
                                                                HashMap hashMap2 = new HashMap();
                                                                CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", hashMap2);
                                                                this.f9249b.D().a("NetworkCommunicationThread", "processRequest", th, hashMap2);
                                                                bArr5 = bArr4;
                                                                bArr6 = bArr3;
                                                                d7.a(httpURLConnection2, this.f9249b);
                                                                final d a10 = d.a().a(i10).a(bArr6).b(bArr5).a(elapsedRealtime2 - elapsedRealtime3).a(th2).a();
                                                                cVar.f9257g.execute(new Runnable() { // from class: com.applovin.impl.ie
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        t3.b.a(t3.c.this, a10);
                                                                    }
                                                                });
                                                                return;
                                                            }
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        bArr4 = null;
                                                    }
                                                    bArr5 = bArr4;
                                                    bArr6 = bArr3;
                                                } else {
                                                    bArr6 = bArr3;
                                                    bArr5 = null;
                                                }
                                                d7.a(httpURLConnection2, this.f9249b);
                                                final d a102 = d.a().a(i10).a(bArr6).b(bArr5).a(elapsedRealtime2 - elapsedRealtime3).a(th2).a();
                                                cVar.f9257g.execute(new Runnable() { // from class: com.applovin.impl.ie
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        t3.b.a(t3.c.this, a102);
                                                    }
                                                });
                                                return;
                                            } catch (Throwable th7) {
                                                d7.a(httpURLConnection2, this.f9249b);
                                                throw th7;
                                            }
                                        }
                                    }
                                }
                                bArr6 = bArr3;
                                bArr5 = null;
                                th2 = null;
                            } catch (Throwable th8) {
                                th = th8;
                                bArr3 = null;
                            }
                        } else {
                            bArr5 = null;
                            th2 = null;
                            bArr6 = null;
                        }
                    } catch (Throwable th9) {
                        th2 = th9;
                        bArr3 = null;
                    }
                } catch (Throwable th10) {
                    th2 = th10;
                    bArr3 = null;
                    httpURLConnection2 = null;
                }
                d7.a(httpURLConnection2, this.f9249b);
                final d a1022 = d.a().a(i10).a(bArr6).b(bArr5).a(elapsedRealtime2 - elapsedRealtime3).a(th2).a();
                cVar.f9257g.execute(new Runnable() { // from class: com.applovin.impl.ie
                    @Override // java.lang.Runnable
                    public final void run() {
                        t3.b.a(t3.c.this, a1022);
                    }
                });
                return;
            }
            long elapsedRealtime4 = SystemClock.elapsedRealtime();
            try {
                httpURLConnection = a(cVar);
                try {
                    if (cVar.f9254d != null && cVar.f9254d.length > 0) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setFixedLengthStreamingMode(cVar.f9254d.length);
                        if (((Boolean) this.f9249b.a(o4.f8266z)).booleanValue()) {
                            OutputStream outputStream2 = httpURLConnection.getOutputStream();
                            outputStream2.write(cVar.f9254d);
                            outputStream2.close();
                        } else {
                            OutputStream outputStream3 = httpURLConnection.getOutputStream();
                            outputStream3.write(cVar.f9254d);
                            outputStream3.close();
                        }
                    }
                    elapsedRealtime4 = SystemClock.elapsedRealtime();
                    i10 = httpURLConnection.getResponseCode();
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    if (i10 > 0) {
                        com.applovin.impl.sdk.j jVar = this.f9249b;
                        o4 o4Var = o4.f8266z;
                        try {
                            if (((Boolean) jVar.a(o4Var)).booleanValue()) {
                                try {
                                    inputStream8 = httpURLConnection.getInputStream();
                                    try {
                                        bArr = o0.a(inputStream8, this.f9249b);
                                    } catch (Throwable th11) {
                                        th = th11;
                                        HashMap hashMap3 = new HashMap();
                                        CollectionUtils.putStringIfValid("details", "responseDataInputStream", hashMap3);
                                        this.f9249b.D().a("NetworkCommunicationThread", "processRequest", th, hashMap3);
                                        throw th;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                }
                            } else {
                                inputStream8 = httpURLConnection.getInputStream();
                                bArr = o0.a(inputStream8, this.f9249b);
                            }
                            bArr2 = null;
                            inputStream7 = inputStream8;
                        } catch (Throwable th13) {
                            th = th13;
                            inputStream = o4Var;
                            try {
                                elapsedRealtime = SystemClock.elapsedRealtime();
                                this.f9249b.I().a("NetworkCommunicationThread", th);
                                this.f9249b.I();
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.f9249b.I().d("NetworkCommunicationThread", "Failed to make HTTP request", th);
                                }
                                if (httpURLConnection != null) {
                                    try {
                                        inputStream3 = httpURLConnection.getErrorStream();
                                        try {
                                            bArr2 = o0.a(inputStream3, this.f9249b);
                                            inputStream4 = inputStream3;
                                            bArr = null;
                                            inputStream5 = inputStream;
                                        } catch (Throwable th14) {
                                            th = th14;
                                            try {
                                                if (((Boolean) this.f9249b.a(o4.f8266z)).booleanValue()) {
                                                    HashMap hashMap4 = new HashMap();
                                                    CollectionUtils.putStringIfValid("details", "responseErrorDataInputStream", hashMap4);
                                                    this.f9249b.D().a("NetworkCommunicationThread", "processRequest", th, hashMap4);
                                                }
                                                inputStream4 = inputStream3;
                                                bArr = null;
                                                bArr2 = null;
                                                inputStream5 = inputStream;
                                                d7.a(inputStream5, this.f9249b);
                                                d7.a(inputStream4, this.f9249b);
                                                d7.a(httpURLConnection, this.f9249b);
                                                final d a11 = d.a().a(i10).a(bArr).b(bArr2).a(elapsedRealtime - elapsedRealtime4).a(th).a();
                                                cVar.f9257g.execute(new Runnable() { // from class: com.applovin.impl.he
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        t3.b.b(t3.c.this, a11);
                                                    }
                                                });
                                            } catch (Throwable th15) {
                                                th = th15;
                                                inputStream2 = inputStream3;
                                                d7.a(inputStream, this.f9249b);
                                                d7.a(inputStream2, this.f9249b);
                                                d7.a(httpURLConnection, this.f9249b);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th16) {
                                        th = th16;
                                        inputStream3 = null;
                                    }
                                    d7.a(inputStream5, this.f9249b);
                                    d7.a(inputStream4, this.f9249b);
                                    d7.a(httpURLConnection, this.f9249b);
                                    final d a112 = d.a().a(i10).a(bArr).b(bArr2).a(elapsedRealtime - elapsedRealtime4).a(th).a();
                                    cVar.f9257g.execute(new Runnable() { // from class: com.applovin.impl.he
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            t3.b.b(t3.c.this, a112);
                                        }
                                    });
                                }
                                bArr = null;
                                bArr2 = null;
                                inputStream6 = inputStream;
                                inputStream4 = null;
                                inputStream5 = inputStream6;
                                d7.a(inputStream5, this.f9249b);
                                d7.a(inputStream4, this.f9249b);
                                d7.a(httpURLConnection, this.f9249b);
                                final d a1122 = d.a().a(i10).a(bArr).b(bArr2).a(elapsedRealtime - elapsedRealtime4).a(th).a();
                                cVar.f9257g.execute(new Runnable() { // from class: com.applovin.impl.he
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        t3.b.b(t3.c.this, a1122);
                                    }
                                });
                            } catch (Throwable th17) {
                                th = th17;
                                inputStream2 = null;
                            }
                        }
                    } else {
                        bArr = null;
                        bArr2 = null;
                        inputStream7 = null;
                    }
                    th = null;
                    inputStream6 = inputStream7;
                } catch (Throwable th18) {
                    th = th18;
                    inputStream = null;
                }
            } catch (Throwable th19) {
                th = th19;
                inputStream = null;
                httpURLConnection = null;
            }
            inputStream4 = null;
            inputStream5 = inputStream6;
            d7.a(inputStream5, this.f9249b);
            d7.a(inputStream4, this.f9249b);
            d7.a(httpURLConnection, this.f9249b);
            final d a11222 = d.a().a(i10).a(bArr).b(bArr2).a(elapsedRealtime - elapsedRealtime4).a(th).a();
            cVar.f9257g.execute(new Runnable() { // from class: com.applovin.impl.he
                @Override // java.lang.Runnable
                public final void run() {
                    t3.b.b(t3.c.this, a11222);
                }
            });
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private b(BlockingQueue blockingQueue, int i10, com.applovin.impl.sdk.j jVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (jVar != null) {
                this.f9248a = blockingQueue;
                this.f9249b = jVar;
                setPriority(((Integer) jVar.a(o4.T)).intValue());
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f9256f.accept(dVar);
        }

        private HttpURLConnection a(c cVar) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f9251a).openConnection();
            httpURLConnection.setRequestMethod(cVar.f9252b);
            httpURLConnection.setConnectTimeout(cVar.f9255e);
            httpURLConnection.setReadTimeout(cVar.f9255e);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f9253c.isEmpty()) {
                for (Map.Entry entry : cVar.f9253c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(c cVar, d dVar) {
            cVar.f9256f.accept(dVar);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c implements Comparable {

        /* renamed from: i  reason: collision with root package name */
        private static final AtomicInteger f9250i = new AtomicInteger();

        /* renamed from: a  reason: collision with root package name */
        private final String f9251a;

        /* renamed from: b  reason: collision with root package name */
        private final String f9252b;

        /* renamed from: c  reason: collision with root package name */
        private final Map f9253c;

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f9254d;

        /* renamed from: e  reason: collision with root package name */
        private final int f9255e;

        /* renamed from: f  reason: collision with root package name */
        private final androidx.core.util.b f9256f;

        /* renamed from: g  reason: collision with root package name */
        private final Executor f9257g;

        /* renamed from: h  reason: collision with root package name */
        private final int f9258h;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private String f9259a;

            /* renamed from: b  reason: collision with root package name */
            private String f9260b;

            /* renamed from: c  reason: collision with root package name */
            private Map f9261c = new HashMap();

            /* renamed from: d  reason: collision with root package name */
            private byte[] f9262d;

            /* renamed from: e  reason: collision with root package name */
            private int f9263e;

            /* renamed from: f  reason: collision with root package name */
            private androidx.core.util.b f9264f;

            /* renamed from: g  reason: collision with root package name */
            private Executor f9265g;

            public a a(String str) {
                this.f9259a = str;
                return this;
            }

            public a b(String str) {
                this.f9260b = str;
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f9261c = map;
                return this;
            }

            public a a(String str, String str2) {
                this.f9261c.put(str, str2);
                return this;
            }

            public a a(byte[] bArr) {
                this.f9262d = bArr;
                return this;
            }

            public a a(int i10) {
                this.f9263e = i10;
                return this;
            }

            public a a(androidx.core.util.b bVar) {
                this.f9264f = bVar;
                return this;
            }

            public a a(Executor executor) {
                this.f9265g = executor;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: h */
        public int compareTo(c cVar) {
            return this.f9258h - cVar.f9258h;
        }

        private c(a aVar) {
            this.f9251a = aVar.f9259a;
            this.f9252b = aVar.f9260b;
            this.f9253c = aVar.f9261c != null ? aVar.f9261c : Collections.emptyMap();
            this.f9254d = aVar.f9262d;
            this.f9255e = aVar.f9263e;
            this.f9256f = aVar.f9264f;
            this.f9257g = aVar.f9265g;
            this.f9258h = f9250i.incrementAndGet();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final int f9266a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f9267b;

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f9268c;

        /* renamed from: d  reason: collision with root package name */
        private final long f9269d;

        /* renamed from: e  reason: collision with root package name */
        private final Throwable f9270e;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private int f9271a;

            /* renamed from: b  reason: collision with root package name */
            private byte[] f9272b;

            /* renamed from: c  reason: collision with root package name */
            private byte[] f9273c;

            /* renamed from: d  reason: collision with root package name */
            private long f9274d;

            /* renamed from: e  reason: collision with root package name */
            private Throwable f9275e;

            public a a(int i10) {
                this.f9271a = i10;
                return this;
            }

            public a b(byte[] bArr) {
                this.f9273c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.f9272b = bArr;
                return this;
            }

            public a a(Throwable th) {
                this.f9275e = th;
                return this;
            }

            public a a(long j10) {
                this.f9274d = j10;
                return this;
            }

            public d a() {
                return new d(this);
            }
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.f9266a;
        }

        public int c() {
            Throwable th = this.f9270e;
            if (th == null) {
                return this.f9266a;
            }
            throw th;
        }

        public byte[] d() {
            Throwable th = this.f9270e;
            if (th == null) {
                return this.f9267b;
            }
            throw th;
        }

        public long e() {
            return this.f9269d;
        }

        public byte[] f() {
            return this.f9268c;
        }

        private d(a aVar) {
            this.f9266a = aVar.f9271a;
            this.f9267b = aVar.f9272b;
            this.f9268c = aVar.f9273c;
            this.f9269d = aVar.f9274d;
            this.f9270e = aVar.f9275e;
        }
    }

    public t3(com.applovin.impl.sdk.j jVar) {
        this.f9247b = jVar;
    }

    public void a() {
        for (int i10 = 0; i10 < ((Integer) this.f9247b.a(o4.S)).intValue(); i10++) {
            new b(this.f9246a, i10, this.f9247b).start();
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f9246a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
