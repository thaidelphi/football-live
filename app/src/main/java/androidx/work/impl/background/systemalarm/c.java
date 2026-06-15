package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.p;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConstraintsCommandHandler.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class c {

    /* renamed from: e  reason: collision with root package name */
    private static final String f4695e = p.f("ConstraintsCmdHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f4696a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4697b;

    /* renamed from: c  reason: collision with root package name */
    private final e f4698c;

    /* renamed from: d  reason: collision with root package name */
    private final h1.d f4699d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, int i10, e eVar) {
        this.f4696a = context;
        this.f4697b = i10;
        this.f4698c = eVar;
        this.f4699d = new h1.d(context, eVar.f(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        List<l1.p> d10 = this.f4698c.g().w().l().d();
        ConstraintProxy.a(this.f4696a, d10);
        this.f4699d.d(d10);
        ArrayList<l1.p> arrayList = new ArrayList(d10.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (l1.p pVar : d10) {
            String str = pVar.f27432a;
            if (currentTimeMillis >= pVar.a() && (!pVar.b() || this.f4699d.c(str))) {
                arrayList.add(pVar);
            }
        }
        for (l1.p pVar2 : arrayList) {
            String str2 = pVar2.f27432a;
            Intent b10 = b.b(this.f4696a, str2);
            p.c().a(f4695e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            e eVar = this.f4698c;
            eVar.k(new e.b(eVar, b10, this.f4697b));
        }
        this.f4699d.e();
    }
}
