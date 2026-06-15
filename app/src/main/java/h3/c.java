package h3;

import b3.o;
import b3.t;
import c3.m;
import i3.y;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import k3.b;
/* compiled from: DefaultScheduler.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f26194f = Logger.getLogger(t.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final y f26195a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f26196b;

    /* renamed from: c  reason: collision with root package name */
    private final c3.e f26197c;

    /* renamed from: d  reason: collision with root package name */
    private final j3.d f26198d;

    /* renamed from: e  reason: collision with root package name */
    private final k3.b f26199e;

    public c(Executor executor, c3.e eVar, y yVar, j3.d dVar, k3.b bVar) {
        this.f26196b = executor;
        this.f26197c = eVar;
        this.f26195a = yVar;
        this.f26198d = dVar;
        this.f26199e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(o oVar, b3.i iVar) {
        this.f26198d.C(oVar, iVar);
        this.f26195a.a(oVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final o oVar, z2.h hVar, b3.i iVar) {
        try {
            m mVar = this.f26197c.get(oVar.b());
            if (mVar == null) {
                String format = String.format("Transport backend '%s' is not registered", oVar.b());
                f26194f.warning(format);
                hVar.a(new IllegalArgumentException(format));
                return;
            }
            final b3.i b10 = mVar.b(iVar);
            this.f26199e.j(new b.a() { // from class: h3.b
                @Override // k3.b.a
                public final Object b() {
                    Object d10;
                    d10 = c.this.d(oVar, b10);
                    return d10;
                }
            });
            hVar.a(null);
        } catch (Exception e8) {
            Logger logger = f26194f;
            logger.warning("Error scheduling event " + e8.getMessage());
            hVar.a(e8);
        }
    }

    @Override // h3.e
    public void a(final o oVar, final b3.i iVar, final z2.h hVar) {
        this.f26196b.execute(new Runnable() { // from class: h3.a
            @Override // java.lang.Runnable
            public final void run() {
                c.this.e(oVar, hVar, iVar);
            }
        });
    }
}
