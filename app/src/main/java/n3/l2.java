package n3;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import n3.h;
/* compiled from: PlaybackException.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l2 extends Exception implements h {

    /* renamed from: c  reason: collision with root package name */
    public static final h.a<l2> f28125c = new h.a() { // from class: n3.k2
        @Override // n3.h.a
        public final h a(Bundle bundle) {
            return new l2(bundle);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f28126a;

    /* renamed from: b  reason: collision with root package name */
    public final long f28127b;

    /* JADX INFO: Access modifiers changed from: protected */
    public l2(Bundle bundle) {
        this(bundle.getString(d(2)), c(bundle), bundle.getInt(d(0), 1000), bundle.getLong(d(1), SystemClock.elapsedRealtime()));
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }

    private static Throwable b(Class<?> cls, String str) throws Exception {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    private static Throwable c(Bundle bundle) {
        String string = bundle.getString(d(3));
        String string2 = bundle.getString(d(4));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, l2.class.getClassLoader());
            Throwable b10 = Throwable.class.isAssignableFrom(cls) ? b(cls, string2) : null;
            if (b10 != null) {
                return b10;
            }
        } catch (Throwable unused) {
        }
        return a(string2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public l2(String str, Throwable th, int i10, long j10) {
        super(str, th);
        this.f28126a = i10;
        this.f28127b = j10;
    }
}
