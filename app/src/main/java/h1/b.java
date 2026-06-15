package h1;

import com.google.protobuf.CodedOutputStream;
/* compiled from: NetworkState.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f26176a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f26177b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f26178c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f26179d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f26176a = z10;
        this.f26177b = z11;
        this.f26178c = z12;
        this.f26179d = z13;
    }

    public boolean a() {
        return this.f26176a;
    }

    public boolean b() {
        return this.f26178c;
    }

    public boolean c() {
        return this.f26179d;
    }

    public boolean d() {
        return this.f26177b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f26176a == bVar.f26176a && this.f26177b == bVar.f26177b && this.f26178c == bVar.f26178c && this.f26179d == bVar.f26179d;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r02 = this.f26176a;
        int i10 = r02;
        if (this.f26177b) {
            i10 = r02 + 16;
        }
        int i11 = i10;
        if (this.f26178c) {
            i11 = i10 + 256;
        }
        return this.f26179d ? i11 + CodedOutputStream.DEFAULT_BUFFER_SIZE : i11;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f26176a), Boolean.valueOf(this.f26177b), Boolean.valueOf(this.f26178c), Boolean.valueOf(this.f26179d));
    }
}
