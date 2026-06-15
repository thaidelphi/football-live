package t9;

import com.ironsource.mediationsdk.logger.IronSourceError;
import n9.r;
/* compiled from: Header.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final y9.f f31086d = y9.f.i(":");

    /* renamed from: e  reason: collision with root package name */
    public static final y9.f f31087e = y9.f.i(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final y9.f f31088f = y9.f.i(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final y9.f f31089g = y9.f.i(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final y9.f f31090h = y9.f.i(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final y9.f f31091i = y9.f.i(":authority");

    /* renamed from: a  reason: collision with root package name */
    public final y9.f f31092a;

    /* renamed from: b  reason: collision with root package name */
    public final y9.f f31093b;

    /* renamed from: c  reason: collision with root package name */
    final int f31094c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Header.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public interface a {
        void a(r rVar);
    }

    public c(String str, String str2) {
        this(y9.f.i(str), y9.f.i(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f31092a.equals(cVar.f31092a) && this.f31093b.equals(cVar.f31093b);
        }
        return false;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f31092a.hashCode()) * 31) + this.f31093b.hashCode();
    }

    public String toString() {
        return o9.c.r("%s: %s", this.f31092a.w(), this.f31093b.w());
    }

    public c(y9.f fVar, String str) {
        this(fVar, y9.f.i(str));
    }

    public c(y9.f fVar, y9.f fVar2) {
        this.f31092a = fVar;
        this.f31093b = fVar2;
        this.f31094c = fVar.r() + 32 + fVar2.r();
    }
}
