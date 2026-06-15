package e4;

import android.content.Context;
import e4.t;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import z4.l;
import z4.t;
/* compiled from: DefaultMediaSourceFactory.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i implements t.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f25065a;

    /* renamed from: b  reason: collision with root package name */
    private l.a f25066b;

    /* renamed from: c  reason: collision with root package name */
    private long f25067c;

    /* renamed from: d  reason: collision with root package name */
    private long f25068d;

    /* renamed from: e  reason: collision with root package name */
    private long f25069e;

    /* renamed from: f  reason: collision with root package name */
    private float f25070f;

    /* renamed from: g  reason: collision with root package name */
    private float f25071g;

    /* compiled from: DefaultMediaSourceFactory.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final s3.m f25072a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<Integer, x5.k<t.a>> f25073b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private final Set<Integer> f25074c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        private final Map<Integer, t.a> f25075d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private l.a f25076e;

        public a(s3.m mVar) {
            this.f25072a = mVar;
        }

        public void a(l.a aVar) {
            if (aVar != this.f25076e) {
                this.f25076e = aVar;
                this.f25073b.clear();
                this.f25075d.clear();
            }
        }
    }

    public i(Context context, s3.m mVar) {
        this(new t.a(context), mVar);
    }

    public i(l.a aVar, s3.m mVar) {
        this.f25066b = aVar;
        a aVar2 = new a(mVar);
        this.f25065a = aVar2;
        aVar2.a(aVar);
        this.f25067c = -9223372036854775807L;
        this.f25068d = -9223372036854775807L;
        this.f25069e = -9223372036854775807L;
        this.f25070f = -3.4028235E38f;
        this.f25071g = -3.4028235E38f;
    }
}
