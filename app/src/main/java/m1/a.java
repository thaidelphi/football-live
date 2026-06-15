package m1;

import androidx.work.impl.WorkDatabase;
import androidx.work.s;
import androidx.work.z;
import java.util.LinkedList;
import java.util.UUID;
import l1.q;
/* compiled from: CancelWorkRunnable.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final e1.c f27619a = new e1.c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CancelWorkRunnable.java */
    /* renamed from: m1.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class C0312a extends a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e1.i f27620b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UUID f27621c;

        C0312a(e1.i iVar, UUID uuid) {
            this.f27620b = iVar;
            this.f27621c = uuid;
        }

        @Override // m1.a
        void h() {
            WorkDatabase w10 = this.f27620b.w();
            w10.beginTransaction();
            try {
                a(this.f27620b, this.f27621c.toString());
                w10.setTransactionSuccessful();
                w10.endTransaction();
                g(this.f27620b);
            } catch (Throwable th) {
                w10.endTransaction();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CancelWorkRunnable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e1.i f27622b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f27623c;

        b(e1.i iVar, String str) {
            this.f27622b = iVar;
            this.f27623c = str;
        }

        @Override // m1.a
        void h() {
            WorkDatabase w10 = this.f27622b.w();
            w10.beginTransaction();
            try {
                for (String str : w10.l().h(this.f27623c)) {
                    a(this.f27622b, str);
                }
                w10.setTransactionSuccessful();
                w10.endTransaction();
                g(this.f27622b);
            } catch (Throwable th) {
                w10.endTransaction();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CancelWorkRunnable.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c extends a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e1.i f27624b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f27625c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f27626d;

        c(e1.i iVar, String str, boolean z10) {
            this.f27624b = iVar;
            this.f27625c = str;
            this.f27626d = z10;
        }

        @Override // m1.a
        void h() {
            WorkDatabase w10 = this.f27624b.w();
            w10.beginTransaction();
            try {
                for (String str : w10.l().e(this.f27625c)) {
                    a(this.f27624b, str);
                }
                w10.setTransactionSuccessful();
                w10.endTransaction();
                if (this.f27626d) {
                    g(this.f27624b);
                }
            } catch (Throwable th) {
                w10.endTransaction();
                throw th;
            }
        }
    }

    public static a b(UUID uuid, e1.i iVar) {
        return new C0312a(iVar, uuid);
    }

    public static a c(String str, e1.i iVar, boolean z10) {
        return new c(iVar, str, z10);
    }

    public static a d(String str, e1.i iVar) {
        return new b(iVar, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        q l10 = workDatabase.l();
        l1.b d10 = workDatabase.d();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            z.a f10 = l10.f(str2);
            if (f10 != z.a.SUCCEEDED && f10 != z.a.FAILED) {
                l10.b(z.a.CANCELLED, str2);
            }
            linkedList.addAll(d10.b(str2));
        }
    }

    void a(e1.i iVar, String str) {
        f(iVar.w(), str);
        iVar.u().l(str);
        for (e1.e eVar : iVar.v()) {
            eVar.c(str);
        }
    }

    public s e() {
        return this.f27619a;
    }

    void g(e1.i iVar) {
        e1.f.b(iVar.q(), iVar.w(), iVar.v());
    }

    abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f27619a.a(s.f4822a);
        } catch (Throwable th) {
            this.f27619a.a(new s.b.a(th));
        }
    }
}
