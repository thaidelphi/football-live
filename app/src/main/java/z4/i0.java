package z4;

import java.io.IOException;
/* compiled from: LoadErrorHandlingPolicy.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface i0 {

    /* compiled from: LoadErrorHandlingPolicy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f33507a;

        /* renamed from: b  reason: collision with root package name */
        public final int f33508b;

        /* renamed from: c  reason: collision with root package name */
        public final int f33509c;

        /* renamed from: d  reason: collision with root package name */
        public final int f33510d;

        public a(int i10, int i11, int i12, int i13) {
            this.f33507a = i10;
            this.f33508b = i11;
            this.f33509c = i12;
            this.f33510d = i13;
        }

        public boolean a(int i10) {
            if (i10 == 1) {
                if (this.f33507a - this.f33508b <= 1) {
                    return false;
                }
            } else if (this.f33509c - this.f33510d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f33511a;

        /* renamed from: b  reason: collision with root package name */
        public final long f33512b;

        public b(int i10, long j10) {
            a5.a.a(j10 >= 0);
            this.f33511a = i10;
            this.f33512b = j10;
        }
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final e4.l f33513a;

        /* renamed from: b  reason: collision with root package name */
        public final e4.p f33514b;

        /* renamed from: c  reason: collision with root package name */
        public final IOException f33515c;

        /* renamed from: d  reason: collision with root package name */
        public final int f33516d;

        public c(e4.l lVar, e4.p pVar, IOException iOException, int i10) {
            this.f33513a = lVar;
            this.f33514b = pVar;
            this.f33515c = iOException;
            this.f33516d = i10;
        }
    }

    int a(int i10);

    long b(c cVar);

    void c(long j10);

    b d(a aVar, c cVar);
}
