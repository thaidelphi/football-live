package n3;

import java.io.IOException;
/* compiled from: ParserException.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h2 extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28001a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28002b;

    /* JADX INFO: Access modifiers changed from: protected */
    public h2(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f28001a = z10;
        this.f28002b = i10;
    }

    public static h2 a(String str, Throwable th) {
        return new h2(str, th, true, 1);
    }

    public static h2 b(String str, Throwable th) {
        return new h2(str, th, true, 0);
    }

    public static h2 c(String str, Throwable th) {
        return new h2(str, th, true, 4);
    }

    public static h2 d(String str) {
        return new h2(str, null, false, 1);
    }
}
