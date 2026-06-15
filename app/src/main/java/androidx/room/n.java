package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.room.q0;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import v0.h;
/* compiled from: DatabaseConfiguration.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public final h.c f4216a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4217b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4218c;

    /* renamed from: d  reason: collision with root package name */
    public final q0.d f4219d;

    /* renamed from: e  reason: collision with root package name */
    public final List<q0.b> f4220e;

    /* renamed from: f  reason: collision with root package name */
    public final q0.e f4221f;

    /* renamed from: g  reason: collision with root package name */
    public final List<Object> f4222g;

    /* renamed from: h  reason: collision with root package name */
    public final List<s0.a> f4223h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4224i;

    /* renamed from: j  reason: collision with root package name */
    public final q0.c f4225j;

    /* renamed from: k  reason: collision with root package name */
    public final Executor f4226k;

    /* renamed from: l  reason: collision with root package name */
    public final Executor f4227l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f4228m;

    /* renamed from: n  reason: collision with root package name */
    public final Intent f4229n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f4230o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f4231p;

    /* renamed from: q  reason: collision with root package name */
    private final Set<Integer> f4232q;

    /* renamed from: r  reason: collision with root package name */
    public final String f4233r;

    /* renamed from: s  reason: collision with root package name */
    public final File f4234s;

    /* renamed from: t  reason: collision with root package name */
    public final Callable<InputStream> f4235t;

    @SuppressLint({"LambdaLast"})
    public n(Context context, String str, h.c cVar, q0.d dVar, List<q0.b> list, boolean z10, q0.c cVar2, Executor executor, Executor executor2, Intent intent, boolean z11, boolean z12, Set<Integer> set, String str2, File file, Callable<InputStream> callable, q0.e eVar, List<Object> list2, List<s0.a> list3) {
        this.f4216a = cVar;
        this.f4217b = context;
        this.f4218c = str;
        this.f4219d = dVar;
        this.f4220e = list;
        this.f4224i = z10;
        this.f4225j = cVar2;
        this.f4226k = executor;
        this.f4227l = executor2;
        this.f4229n = intent;
        this.f4228m = intent != null;
        this.f4230o = z11;
        this.f4231p = z12;
        this.f4232q = set;
        this.f4233r = str2;
        this.f4234s = file;
        this.f4235t = callable;
        this.f4222g = list2 == null ? Collections.emptyList() : list2;
        this.f4223h = list3 == null ? Collections.emptyList() : list3;
    }

    public boolean a(int i10, int i11) {
        Set<Integer> set;
        if ((i10 > i11) && this.f4231p) {
            return false;
        }
        return this.f4230o && ((set = this.f4232q) == null || !set.contains(Integer.valueOf(i10)));
    }
}
