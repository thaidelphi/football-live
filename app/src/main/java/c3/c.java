package c3;

import android.content.Context;
import java.util.Objects;
/* compiled from: AutoValue_CreationContext.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5421a;

    /* renamed from: b  reason: collision with root package name */
    private final l3.a f5422b;

    /* renamed from: c  reason: collision with root package name */
    private final l3.a f5423c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5424d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, l3.a aVar, l3.a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f5421a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f5422b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f5423c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f5424d = str;
    }

    @Override // c3.h
    public Context b() {
        return this.f5421a;
    }

    @Override // c3.h
    public String c() {
        return this.f5424d;
    }

    @Override // c3.h
    public l3.a d() {
        return this.f5423c;
    }

    @Override // c3.h
    public l3.a e() {
        return this.f5422b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f5421a.equals(hVar.b()) && this.f5422b.equals(hVar.e()) && this.f5423c.equals(hVar.d()) && this.f5424d.equals(hVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f5421a.hashCode() ^ 1000003) * 1000003) ^ this.f5422b.hashCode()) * 1000003) ^ this.f5423c.hashCode()) * 1000003) ^ this.f5424d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f5421a + ", wallClock=" + this.f5422b + ", monotonicClock=" + this.f5423c + ", backendName=" + this.f5424d + "}";
    }
}
