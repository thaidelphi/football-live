package i3;

import java.util.concurrent.Executor;
import k3.b;
/* compiled from: WorkInitializer.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f26501a;

    /* renamed from: b  reason: collision with root package name */
    private final j3.d f26502b;

    /* renamed from: c  reason: collision with root package name */
    private final y f26503c;

    /* renamed from: d  reason: collision with root package name */
    private final k3.b f26504d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(Executor executor, j3.d dVar, y yVar, k3.b bVar) {
        this.f26501a = executor;
        this.f26502b = dVar;
        this.f26503c = yVar;
        this.f26504d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        for (b3.o oVar : this.f26502b.r()) {
            this.f26503c.a(oVar, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f26504d.j(new b.a() { // from class: i3.v
            @Override // k3.b.a
            public final Object b() {
                Object d10;
                d10 = w.this.d();
                return d10;
            }
        });
    }

    public void c() {
        this.f26501a.execute(new Runnable() { // from class: i3.u
            @Override // java.lang.Runnable
            public final void run() {
                w.this.e();
            }
        });
    }
}
