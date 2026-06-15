package pl.droidsonroids.gif;

import java.io.IOException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class GifIOException extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final b f29968a;

    /* renamed from: b  reason: collision with root package name */
    private final String f29969b;

    private GifIOException(int i10, String str) {
        this.f29968a = b.a(i10);
        this.f29969b = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f29969b == null) {
            return this.f29968a.b();
        }
        return this.f29968a.b() + ": " + this.f29969b;
    }
}
