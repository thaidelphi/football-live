package com.ironsource;

import android.view.View;
import com.ironsource.b9;
import com.ironsource.qh;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class uh {

    /* renamed from: a  reason: collision with root package name */
    private qh f21011a;

    /* renamed from: b  reason: collision with root package name */
    private View f21012b;

    /* renamed from: c  reason: collision with root package name */
    private View f21013c;

    /* renamed from: d  reason: collision with root package name */
    private View f21014d;

    /* renamed from: e  reason: collision with root package name */
    private View f21015e;

    /* renamed from: f  reason: collision with root package name */
    private View f21016f;

    /* renamed from: g  reason: collision with root package name */
    private View f21017g;

    /* renamed from: h  reason: collision with root package name */
    private View f21018h;

    /* renamed from: i  reason: collision with root package name */
    private a f21019i;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public interface a {
        void a(qv qvVar);

        void a(b bVar);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum b {
        Title(b9.h.D0),
        Advertiser(b9.h.F0),
        Body(b9.h.E0),
        Cta(b9.h.G0),
        Icon(b9.h.H0),
        Container("container"),
        PrivacyIcon(b9.h.J0);
        

        /* renamed from: a  reason: collision with root package name */
        private final String f21028a;

        b(String str) {
            this.f21028a = str;
        }

        public final String b() {
            return this.f21028a;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c implements qh.a {
        c() {
        }

        @Override // com.ironsource.qh.a
        public void a(qv viewVisibilityParams) {
            kotlin.jvm.internal.n.f(viewVisibilityParams, "viewVisibilityParams");
            a n10 = uh.this.n();
            if (n10 != null) {
                n10.a(viewVisibilityParams);
            }
        }
    }

    public uh(qh containerView, View view, View view2, View view3, View view4, View view5, View view6, View privacyIconView) {
        kotlin.jvm.internal.n.f(containerView, "containerView");
        kotlin.jvm.internal.n.f(privacyIconView, "privacyIconView");
        this.f21011a = containerView;
        this.f21012b = view;
        this.f21013c = view2;
        this.f21014d = view3;
        this.f21015e = view4;
        this.f21016f = view5;
        this.f21017g = view6;
        this.f21018h = privacyIconView;
        r();
        s();
    }

    public /* synthetic */ uh(qh qhVar, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i10, kotlin.jvm.internal.h hVar) {
        this(qhVar, (i10 & 2) != 0 ? null : view, (i10 & 4) != 0 ? null : view2, (i10 & 8) != 0 ? null : view3, (i10 & 16) != 0 ? null : view4, (i10 & 32) != 0 ? null : view5, (i10 & 64) != 0 ? null : view6, view7);
    }

    private static final void a(final uh uhVar, View view, final b bVar) {
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.ironsource.e10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    uh.a(uh.this, bVar, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(uh this$0, b viewName, View view) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(viewName, "$viewName");
        a aVar = this$0.f21019i;
        if (aVar != null) {
            aVar.a(viewName);
        }
    }

    private final void r() {
        a(this, this.f21012b, b.Title);
        a(this, this.f21013c, b.Advertiser);
        a(this, this.f21015e, b.Body);
        a(this, this.f21017g, b.Cta);
        a(this, this.f21014d, b.Icon);
        a(this, this.f21011a, b.Container);
        a(this, this.f21018h, b.PrivacyIcon);
    }

    private final void s() {
        this.f21011a.setListener$mediationsdk_release(new c());
    }

    public final qh a() {
        return this.f21011a;
    }

    public final uh a(qh containerView, View view, View view2, View view3, View view4, View view5, View view6, View privacyIconView) {
        kotlin.jvm.internal.n.f(containerView, "containerView");
        kotlin.jvm.internal.n.f(privacyIconView, "privacyIconView");
        return new uh(containerView, view, view2, view3, view4, view5, view6, privacyIconView);
    }

    public final void a(View view) {
        this.f21013c = view;
    }

    public final void a(qh qhVar) {
        kotlin.jvm.internal.n.f(qhVar, "<set-?>");
        this.f21011a = qhVar;
    }

    public final void a(a aVar) {
        this.f21019i = aVar;
    }

    public final View b() {
        return this.f21012b;
    }

    public final void b(View view) {
        this.f21015e = view;
    }

    public final View c() {
        return this.f21013c;
    }

    public final void c(View view) {
        this.f21017g = view;
    }

    public final View d() {
        return this.f21014d;
    }

    public final void d(View view) {
        this.f21014d = view;
    }

    public final View e() {
        return this.f21015e;
    }

    public final void e(View view) {
        this.f21016f = view;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uh) {
            uh uhVar = (uh) obj;
            return kotlin.jvm.internal.n.a(this.f21011a, uhVar.f21011a) && kotlin.jvm.internal.n.a(this.f21012b, uhVar.f21012b) && kotlin.jvm.internal.n.a(this.f21013c, uhVar.f21013c) && kotlin.jvm.internal.n.a(this.f21014d, uhVar.f21014d) && kotlin.jvm.internal.n.a(this.f21015e, uhVar.f21015e) && kotlin.jvm.internal.n.a(this.f21016f, uhVar.f21016f) && kotlin.jvm.internal.n.a(this.f21017g, uhVar.f21017g) && kotlin.jvm.internal.n.a(this.f21018h, uhVar.f21018h);
        }
        return false;
    }

    public final View f() {
        return this.f21016f;
    }

    public final void f(View view) {
        kotlin.jvm.internal.n.f(view, "<set-?>");
        this.f21018h = view;
    }

    public final View g() {
        return this.f21017g;
    }

    public final void g(View view) {
        this.f21012b = view;
    }

    public final View h() {
        return this.f21018h;
    }

    public int hashCode() {
        int hashCode = this.f21011a.hashCode() * 31;
        View view = this.f21012b;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.f21013c;
        int hashCode3 = (hashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.f21014d;
        int hashCode4 = (hashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.f21015e;
        int hashCode5 = (hashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        View view5 = this.f21016f;
        int hashCode6 = (hashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        View view6 = this.f21017g;
        return ((hashCode6 + (view6 != null ? view6.hashCode() : 0)) * 31) + this.f21018h.hashCode();
    }

    public final View i() {
        return this.f21013c;
    }

    public final View j() {
        return this.f21015e;
    }

    public final qh k() {
        return this.f21011a;
    }

    public final View l() {
        return this.f21017g;
    }

    public final View m() {
        return this.f21014d;
    }

    public final a n() {
        return this.f21019i;
    }

    public final View o() {
        return this.f21016f;
    }

    public final View p() {
        return this.f21018h;
    }

    public final View q() {
        return this.f21012b;
    }

    public final JSONObject t() {
        JSONObject put = new JSONObject().put(b9.h.D0, this.f21012b != null).put(b9.h.F0, this.f21013c != null).put(b9.h.E0, this.f21015e != null).put(b9.h.G0, this.f21017g != null).put(b9.h.I0, this.f21016f != null).put(b9.h.H0, this.f21014d != null);
        kotlin.jvm.internal.n.e(put, "JSONObject()\n        .pu…\"icon\", iconView != null)");
        return put;
    }

    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.f21011a + ", titleView=" + this.f21012b + ", advertiserView=" + this.f21013c + ", iconView=" + this.f21014d + ", bodyView=" + this.f21015e + ", mediaView=" + this.f21016f + ", ctaView=" + this.f21017g + ", privacyIconView=" + this.f21018h + ')';
    }
}
