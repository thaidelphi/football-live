package com.adcolony.sdk;

import android.content.ContentValues;
import com.adcolony.sdk.e0;
import com.adcolony.sdk.n0;
import com.adcolony.sdk.o;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class o0 {

    /* renamed from: e  reason: collision with root package name */
    private static o0 f6166e;

    /* renamed from: a  reason: collision with root package name */
    private n0 f6167a;

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f6168b = z0.h();

    /* renamed from: c  reason: collision with root package name */
    private o.b f6169c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6170d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements x<o.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o.b[] f6171a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f6172b;

        a(o0 o0Var, o.b[] bVarArr, CountDownLatch countDownLatch) {
            this.f6171a = bVarArr;
            this.f6172b = countDownLatch;
        }

        @Override // com.adcolony.sdk.x
        public void a(o.b bVar) {
            this.f6171a[0] = bVar;
            this.f6172b.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements x<o.b> {
        b(o0 o0Var) {
        }

        @Override // com.adcolony.sdk.x
        public void a(o.b bVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f6173a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f6174b;

        c(x xVar, long j10) {
            this.f6173a = xVar;
            this.f6174b = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6173a.a(o0.this.f6170d ? o0.this.f6169c : v.a().a(o0.this.f6167a, this.f6174b));
        }
    }

    o0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f6170d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o0 c() {
        if (f6166e == null) {
            synchronized (o0.class) {
                if (f6166e == null) {
                    f6166e = new o0();
                }
            }
        }
        return f6166e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(n0 n0Var) {
        this.f6167a = n0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o.b b() {
        return this.f6169c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(h0 h0Var) {
        f1 a10;
        f1 n10;
        String p10;
        n0.a a11;
        if (this.f6167a == null || (a10 = h0Var.a()) == null || (n10 = a10.n("payload")) == null || (a11 = this.f6167a.a((p10 = n10.p("request_type")))) == null) {
            return;
        }
        a(p10, n10, a11);
    }

    private void a(String str, f1 f1Var, n0.a aVar) {
        try {
            ContentValues a10 = a(f1Var, aVar);
            v.a().a(aVar.f(), a10);
            v.a().a(aVar, a10);
            d();
        } catch (NullPointerException | NumberFormatException e8) {
            e8.printStackTrace();
            e0.a aVar2 = new e0.a();
            e0.a a11 = aVar2.a("Error parsing event:" + str + " ").a(f1Var.toString());
            a11.a("Schema version: " + this.f6167a.b() + " ").a(" e: ").a(e8.toString()).a(e0.f5979g);
        }
    }

    static ContentValues a(f1 f1Var, n0.a aVar) throws NumberFormatException, NullPointerException {
        ContentValues contentValues = new ContentValues();
        for (n0.b bVar : aVar.a()) {
            Object o10 = f1Var.o(bVar.b());
            if (o10 != null) {
                if (o10 instanceof Boolean) {
                    contentValues.put(bVar.b(), (Boolean) o10);
                } else if (o10 instanceof Long) {
                    contentValues.put(bVar.b(), (Long) o10);
                } else if (o10 instanceof Double) {
                    contentValues.put(bVar.b(), (Double) o10);
                } else if (o10 instanceof Number) {
                    Number number = (Number) o10;
                    if (number.doubleValue() == number.longValue() && "INTEGER".equalsIgnoreCase(bVar.c())) {
                        contentValues.put(bVar.b(), Long.valueOf(number.longValue()));
                    } else {
                        contentValues.put(bVar.b(), Double.valueOf(number.doubleValue()));
                    }
                } else if (o10 instanceof String) {
                    contentValues.put(bVar.b(), (String) o10);
                }
            }
        }
        return contentValues;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o.b a(long j10) {
        o.b[] bVarArr = new o.b[1];
        CountDownLatch countDownLatch = new CountDownLatch(1);
        a(new a(this, bVarArr, countDownLatch), j10);
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        return bVarArr[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        a(new b(this));
    }

    void a(x<o.b> xVar) {
        a(xVar, -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(x<o.b> xVar, long j10) {
        if (this.f6167a == null) {
            xVar.a(null);
        } else if (this.f6170d) {
            xVar.a(this.f6169c);
        } else if (z0.a(this.f6168b, new c(xVar, j10))) {
        } else {
            new e0.a().a("Execute ADCOdtEventsListener.calculateFeatureVectors failed").a(e0.f5981i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(o.b bVar) {
        this.f6169c = bVar;
        this.f6170d = true;
    }
}
