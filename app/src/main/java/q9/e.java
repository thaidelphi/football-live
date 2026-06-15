package q9;

import java.io.IOException;
/* compiled from: RouteException.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class e extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private IOException f30166a;

    /* renamed from: b  reason: collision with root package name */
    private IOException f30167b;

    public e(IOException iOException) {
        super(iOException);
        this.f30166a = iOException;
        this.f30167b = iOException;
    }

    public void a(IOException iOException) {
        o9.c.a(this.f30166a, iOException);
        this.f30167b = iOException;
    }

    public IOException b() {
        return this.f30166a;
    }

    public IOException c() {
        return this.f30167b;
    }
}
