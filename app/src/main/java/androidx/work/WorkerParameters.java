package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    private UUID f4573a;

    /* renamed from: b  reason: collision with root package name */
    private e f4574b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f4575c;

    /* renamed from: d  reason: collision with root package name */
    private a f4576d;

    /* renamed from: e  reason: collision with root package name */
    private int f4577e;

    /* renamed from: f  reason: collision with root package name */
    private Executor f4578f;

    /* renamed from: g  reason: collision with root package name */
    private n1.a f4579g;

    /* renamed from: h  reason: collision with root package name */
    private c0 f4580h;

    /* renamed from: i  reason: collision with root package name */
    private v f4581i;

    /* renamed from: j  reason: collision with root package name */
    private j f4582j;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f4583a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f4584b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f4585c;
    }

    public WorkerParameters(UUID uuid, e eVar, Collection<String> collection, a aVar, int i10, Executor executor, n1.a aVar2, c0 c0Var, v vVar, j jVar) {
        this.f4573a = uuid;
        this.f4574b = eVar;
        this.f4575c = new HashSet(collection);
        this.f4576d = aVar;
        this.f4577e = i10;
        this.f4578f = executor;
        this.f4579g = aVar2;
        this.f4580h = c0Var;
        this.f4581i = vVar;
        this.f4582j = jVar;
    }

    public Executor a() {
        return this.f4578f;
    }

    public j b() {
        return this.f4582j;
    }

    public UUID c() {
        return this.f4573a;
    }

    public e d() {
        return this.f4574b;
    }

    public Network e() {
        return this.f4576d.f4585c;
    }

    public v f() {
        return this.f4581i;
    }

    public int g() {
        return this.f4577e;
    }

    public Set<String> h() {
        return this.f4575c;
    }

    public n1.a i() {
        return this.f4579g;
    }

    public List<String> j() {
        return this.f4576d.f4583a;
    }

    public List<Uri> k() {
        return this.f4576d.f4584b;
    }

    public c0 l() {
        return this.f4580h;
    }
}
