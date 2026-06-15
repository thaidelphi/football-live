package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;
/* compiled from: GlideContext.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    static final l<?, ?> f10276k = new a();

    /* renamed from: a  reason: collision with root package name */
    private final z1.b f10277a;

    /* renamed from: b  reason: collision with root package name */
    private final i f10278b;

    /* renamed from: c  reason: collision with root package name */
    private final p2.f f10279c;

    /* renamed from: d  reason: collision with root package name */
    private final b.a f10280d;

    /* renamed from: e  reason: collision with root package name */
    private final List<o2.e<Object>> f10281e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Class<?>, l<?, ?>> f10282f;

    /* renamed from: g  reason: collision with root package name */
    private final y1.k f10283g;

    /* renamed from: h  reason: collision with root package name */
    private final e f10284h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10285i;

    /* renamed from: j  reason: collision with root package name */
    private o2.f f10286j;

    public d(Context context, z1.b bVar, i iVar, p2.f fVar, b.a aVar, Map<Class<?>, l<?, ?>> map, List<o2.e<Object>> list, y1.k kVar, e eVar, int i10) {
        super(context.getApplicationContext());
        this.f10277a = bVar;
        this.f10278b = iVar;
        this.f10279c = fVar;
        this.f10280d = aVar;
        this.f10281e = list;
        this.f10282f = map;
        this.f10283g = kVar;
        this.f10284h = eVar;
        this.f10285i = i10;
    }

    public <X> p2.i<ImageView, X> a(ImageView imageView, Class<X> cls) {
        return this.f10279c.a(imageView, cls);
    }

    public z1.b b() {
        return this.f10277a;
    }

    public List<o2.e<Object>> c() {
        return this.f10281e;
    }

    public synchronized o2.f d() {
        if (this.f10286j == null) {
            this.f10286j = this.f10280d.build().M();
        }
        return this.f10286j;
    }

    public <T> l<?, T> e(Class<T> cls) {
        l<?, T> lVar = (l<?, T>) this.f10282f.get(cls);
        if (lVar == null) {
            for (Map.Entry<Class<?>, l<?, ?>> entry : this.f10282f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lVar = (l<?, T>) entry.getValue();
                }
            }
        }
        return lVar == null ? (l<?, T>) f10276k : lVar;
    }

    public y1.k f() {
        return this.f10283g;
    }

    public e g() {
        return this.f10284h;
    }

    public int h() {
        return this.f10285i;
    }

    public i i() {
        return this.f10278b;
    }
}
