package com.ironsource;

import android.os.Handler;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class gb implements of {

    /* renamed from: e  reason: collision with root package name */
    private static final int f17553e = 5;

    /* renamed from: f  reason: collision with root package name */
    private static gb f17554f;

    /* renamed from: a  reason: collision with root package name */
    private fb f17555a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f17556b;

    /* renamed from: c  reason: collision with root package name */
    private Thread f17557c;

    /* renamed from: d  reason: collision with root package name */
    private final String f17558d;

    private gb(String str, hg hgVar, JSONObject jSONObject) {
        this.f17558d = str;
        this.f17555a = new fb(hgVar.a());
        this.f17556b = jSONObject;
        IronSourceStorageUtils.deleteFolder(b());
        IronSourceStorageUtils.makeDir(b());
    }

    public static synchronized gb a(String str, hg hgVar, JSONObject jSONObject) {
        gb gbVar;
        synchronized (gb.class) {
            if (f17554f == null) {
                f17554f = new gb(str, hgVar, jSONObject);
            }
            gbVar = f17554f;
        }
        return gbVar;
    }

    private Thread a(db dbVar, Handler handler) {
        return new Thread(new pt(dbVar, handler));
    }

    private String b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f17558d, d9.D);
    }

    private Thread b(nh nhVar, String str, int i10, int i11, Handler handler) {
        if (i10 <= 0) {
            i10 = this.f17556b.optInt("connectionTimeout", 5);
        }
        if (i11 <= 0) {
            i11 = this.f17556b.optInt("readTimeout", 5);
        }
        boolean optBoolean = this.f17556b.optBoolean(d9.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a(new db(nhVar, str, (int) timeUnit.toMillis(i10), (int) timeUnit.toMillis(i11), optBoolean, b()), handler);
    }

    public String a() {
        return this.f17558d;
    }

    @Override // com.ironsource.of
    public void a(nh nhVar, String str) {
        int optInt = this.f17556b.optInt("connectionTimeout", 5);
        int optInt2 = this.f17556b.optInt("readTimeout", 5);
        boolean optBoolean = this.f17556b.optBoolean(d9.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread a10 = a(new db(nhVar, str, (int) timeUnit.toMillis(optInt), (int) timeUnit.toMillis(optInt2), optBoolean, b()), this.f17555a);
        this.f17557c = a10;
        a10.start();
    }

    @Override // com.ironsource.of
    public void a(nh nhVar, String str, int i10, int i11) {
        b(nhVar, str, i10, i11, this.f17555a).start();
    }

    @Override // com.ironsource.of
    public void a(nh nhVar, String str, int i10, int i11, Handler handler) {
        b(nhVar, str, i10, i11, handler).start();
    }

    @Override // com.ironsource.of
    public void a(po poVar) {
        this.f17555a.a(poVar);
    }

    public boolean c() {
        Thread thread = this.f17557c;
        return thread != null && thread.isAlive();
    }

    public synchronized void d() {
        f17554f = null;
        fb fbVar = this.f17555a;
        if (fbVar != null) {
            fbVar.a();
            this.f17555a = null;
        }
    }
}
