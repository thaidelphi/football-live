package androidx.room;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import v0.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SQLiteCopyOpenHelperFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class v0 implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f4326a;

    /* renamed from: b  reason: collision with root package name */
    private final File f4327b;

    /* renamed from: c  reason: collision with root package name */
    private final Callable<InputStream> f4328c;

    /* renamed from: d  reason: collision with root package name */
    private final h.c f4329d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(String str, File file, Callable<InputStream> callable, h.c cVar) {
        this.f4326a = str;
        this.f4327b = file;
        this.f4328c = callable;
        this.f4329d = cVar;
    }

    @Override // v0.h.c
    public v0.h a(h.b bVar) {
        return new u0(bVar.f31679a, this.f4326a, this.f4327b, this.f4328c, bVar.f31681c.f31678a, this.f4329d.a(bVar));
    }
}
