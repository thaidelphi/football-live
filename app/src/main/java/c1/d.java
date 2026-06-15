package c1;

import java.util.Objects;
/* compiled from: WebMessageCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final e[] f5308a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5309b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f5310c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5311d;

    public d(String str, e[] eVarArr) {
        this.f5309b = str;
        this.f5310c = null;
        this.f5308a = eVarArr;
        this.f5311d = 0;
    }

    private void a(int i10) {
        if (i10 == this.f5311d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + d(this.f5311d) + " expected, but got " + d(i10));
    }

    private String d(int i10) {
        return i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String";
    }

    public String b() {
        a(0);
        return this.f5309b;
    }

    public e[] c() {
        return this.f5308a;
    }

    public d(byte[] bArr, e[] eVarArr) {
        Objects.requireNonNull(bArr);
        this.f5310c = bArr;
        this.f5309b = null;
        this.f5308a = eVarArr;
        this.f5311d = 1;
    }
}
