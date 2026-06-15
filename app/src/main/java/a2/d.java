package a2;

import a2.a;
import java.io.File;
/* compiled from: DiskLruCacheFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d implements a.InterfaceC0006a {

    /* renamed from: a  reason: collision with root package name */
    private final long f207a;

    /* renamed from: b  reason: collision with root package name */
    private final a f208b;

    /* compiled from: DiskLruCacheFactory.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        File a();
    }

    public d(a aVar, long j10) {
        this.f207a = j10;
        this.f208b = aVar;
    }

    @Override // a2.a.InterfaceC0006a
    public a2.a build() {
        File a10 = this.f208b.a();
        if (a10 == null) {
            return null;
        }
        if (a10.isDirectory() || a10.mkdirs()) {
            return e.c(a10, this.f207a);
        }
        return null;
    }
}
