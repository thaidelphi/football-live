package w1;

import java.io.IOException;
/* compiled from: HttpException.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private final int f31963a;

    public e(int i10) {
        this("Http request failed", i10);
    }

    public e(String str, int i10) {
        this(str, i10, null);
    }

    public e(String str, int i10, Throwable th) {
        super(str + ", status code: " + i10, th);
        this.f31963a = i10;
    }
}
