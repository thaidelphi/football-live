package j1;

import android.content.Context;
/* compiled from: Trackers.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class g {

    /* renamed from: e  reason: collision with root package name */
    private static g f26783e;

    /* renamed from: a  reason: collision with root package name */
    private a f26784a;

    /* renamed from: b  reason: collision with root package name */
    private b f26785b;

    /* renamed from: c  reason: collision with root package name */
    private e f26786c;

    /* renamed from: d  reason: collision with root package name */
    private f f26787d;

    private g(Context context, n1.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f26784a = new a(applicationContext, aVar);
        this.f26785b = new b(applicationContext, aVar);
        this.f26786c = new e(applicationContext, aVar);
        this.f26787d = new f(applicationContext, aVar);
    }

    public static synchronized g c(Context context, n1.a aVar) {
        g gVar;
        synchronized (g.class) {
            if (f26783e == null) {
                f26783e = new g(context, aVar);
            }
            gVar = f26783e;
        }
        return gVar;
    }

    public a a() {
        return this.f26784a;
    }

    public b b() {
        return this.f26785b;
    }

    public e d() {
        return this.f26786c;
    }

    public f e() {
        return this.f26787d;
    }
}
