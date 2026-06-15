package t9;

import java.io.IOException;
/* compiled from: StreamResetException.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class n extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final b f31250a;

    public n(b bVar) {
        super("stream was reset: " + bVar);
        this.f31250a = bVar;
    }
}
