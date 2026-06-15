package z4;

import android.content.Context;
import z4.l;
/* compiled from: DefaultDataSourceFactory.java */
@Deprecated
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u implements l.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f33665a;

    /* renamed from: b  reason: collision with root package name */
    private final s0 f33666b;

    /* renamed from: c  reason: collision with root package name */
    private final l.a f33667c;

    public u(Context context, s0 s0Var, l.a aVar) {
        this.f33665a = context.getApplicationContext();
        this.f33666b = s0Var;
        this.f33667c = aVar;
    }

    @Override // z4.l.a
    /* renamed from: c */
    public t a() {
        t tVar = new t(this.f33665a, this.f33667c.a());
        s0 s0Var = this.f33666b;
        if (s0Var != null) {
            tVar.i(s0Var);
        }
        return tVar;
    }
}
