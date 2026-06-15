package o6;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import f6.e0;
import f6.r;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import o6.j;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: DefaultHeartBeatController.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class f implements i, j {

    /* renamed from: a  reason: collision with root package name */
    private final q6.b<k> f29453a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f29454b;

    /* renamed from: c  reason: collision with root package name */
    private final q6.b<z6.i> f29455c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<g> f29456d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f29457e;

    private f(final Context context, final String str, Set<g> set, q6.b<z6.i> bVar, Executor executor) {
        this(new q6.b() { // from class: o6.e
            @Override // q6.b
            public final Object get() {
                k j10;
                j10 = f.j(context, str);
                return j10;
            }
        }, set, executor, bVar, context);
    }

    public static f6.c<f> g() {
        final e0 a10 = e0.a(e6.a.class, Executor.class);
        return f6.c.f(f.class, i.class, j.class).b(r.j(Context.class)).b(r.j(c6.e.class)).b(r.l(g.class)).b(r.k(z6.i.class)).b(r.i(a10)).f(new f6.h() { // from class: o6.b
            @Override // f6.h
            public final Object a(f6.e eVar) {
                f h10;
                h10 = f.h(e0.this, eVar);
                return h10;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f h(e0 e0Var, f6.e eVar) {
        return new f((Context) eVar.a(Context.class), ((c6.e) eVar.a(c6.e.class)).n(), eVar.b(g.class), eVar.e(z6.i.class), (Executor) eVar.d(e0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() throws Exception {
        String byteArrayOutputStream;
        synchronized (this) {
            k kVar = this.f29453a.get();
            List<l> c10 = kVar.c();
            kVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                l lVar = c10.get(i10);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", lVar.c());
                jSONObject.put("dates", new JSONArray((Collection) lVar.b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
            try {
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k j(Context context, String str) {
        return new k(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k() throws Exception {
        synchronized (this) {
            this.f29453a.get().k(System.currentTimeMillis(), this.f29455c.get().a());
        }
        return null;
    }

    @Override // o6.i
    public Task<String> a() {
        if (!o.a(this.f29454b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f29457e, new Callable() { // from class: o6.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String i10;
                i10 = f.this.i();
                return i10;
            }
        });
    }

    @Override // o6.j
    public synchronized j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        k kVar = this.f29453a.get();
        if (kVar.i(currentTimeMillis)) {
            kVar.g();
            return j.a.GLOBAL;
        }
        return j.a.NONE;
    }

    public Task<Void> l() {
        if (this.f29456d.size() <= 0) {
            return Tasks.forResult(null);
        }
        if (!o.a(this.f29454b)) {
            return Tasks.forResult(null);
        }
        return Tasks.call(this.f29457e, new Callable() { // from class: o6.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void k10;
                k10 = f.this.k();
                return k10;
            }
        });
    }

    f(q6.b<k> bVar, Set<g> set, Executor executor, q6.b<z6.i> bVar2, Context context) {
        this.f29453a = bVar;
        this.f29456d = set;
        this.f29457e = executor;
        this.f29455c = bVar2;
        this.f29454b = context;
    }
}
