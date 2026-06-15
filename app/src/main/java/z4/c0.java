package z4;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
/* compiled from: HttpDataSource.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c0 extends m {

    /* renamed from: b  reason: collision with root package name */
    public final p f33478b;

    /* renamed from: c  reason: collision with root package name */
    public final int f33479c;

    public c0(p pVar, int i10, int i11) {
        super(b(i10, i11));
        this.f33478b = pVar;
        this.f33479c = i11;
    }

    private static int b(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static c0 c(IOException iOException, p pVar, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !x5.a.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        if (i11 == 2007) {
            return new a0(iOException, pVar);
        }
        return new c0(iOException, pVar, i11, i10);
    }

    public c0(String str, p pVar, int i10, int i11) {
        super(str, b(i10, i11));
        this.f33478b = pVar;
        this.f33479c = i11;
    }

    public c0(IOException iOException, p pVar, int i10, int i11) {
        super(iOException, b(i10, i11));
        this.f33478b = pVar;
        this.f33479c = i11;
    }

    public c0(String str, IOException iOException, p pVar, int i10, int i11) {
        super(str, iOException, b(i10, i11));
        this.f33478b = pVar;
        this.f33479c = i11;
    }
}
