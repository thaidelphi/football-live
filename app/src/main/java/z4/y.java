package z4;

import java.io.FileNotFoundException;
import java.io.IOException;
import n3.h2;
import z4.i0;
import z4.j0;
/* compiled from: DefaultLoadErrorHandlingPolicy.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class y implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f33697a;

    public y() {
        this(-1);
    }

    @Override // z4.i0
    public int a(int i10) {
        int i11 = this.f33697a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    @Override // z4.i0
    public long b(i0.c cVar) {
        IOException iOException = cVar.f33515c;
        if ((iOException instanceof h2) || (iOException instanceof FileNotFoundException) || (iOException instanceof a0) || (iOException instanceof j0.h) || m.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f33516d - 1) * 1000, 5000);
    }

    @Override // z4.i0
    public /* synthetic */ void c(long j10) {
        h0.a(this, j10);
    }

    @Override // z4.i0
    public i0.b d(i0.a aVar, i0.c cVar) {
        if (e(cVar.f33515c)) {
            if (aVar.a(1)) {
                return new i0.b(1, 300000L);
            }
            if (aVar.a(2)) {
                return new i0.b(2, 60000L);
            }
            return null;
        }
        return null;
    }

    protected boolean e(IOException iOException) {
        if (iOException instanceof e0) {
            int i10 = ((e0) iOException).f33485d;
            return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
        }
        return false;
    }

    public y(int i10) {
        this.f33697a = i10;
    }
}
