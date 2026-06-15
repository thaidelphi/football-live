package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.d;
import java.util.Map;
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new k0();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    Bundle f14902a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f14903b;

    /* renamed from: c  reason: collision with root package name */
    private b f14904c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f14905a;

        /* renamed from: b  reason: collision with root package name */
        private final String f14906b;

        /* renamed from: c  reason: collision with root package name */
        private final String[] f14907c;

        /* renamed from: d  reason: collision with root package name */
        private final String f14908d;

        /* renamed from: e  reason: collision with root package name */
        private final String f14909e;

        /* renamed from: f  reason: collision with root package name */
        private final String[] f14910f;

        /* renamed from: g  reason: collision with root package name */
        private final String f14911g;

        /* renamed from: h  reason: collision with root package name */
        private final String f14912h;

        /* renamed from: i  reason: collision with root package name */
        private final String f14913i;

        /* renamed from: j  reason: collision with root package name */
        private final String f14914j;

        /* renamed from: k  reason: collision with root package name */
        private final String f14915k;

        /* renamed from: l  reason: collision with root package name */
        private final String f14916l;

        /* renamed from: m  reason: collision with root package name */
        private final String f14917m;

        /* renamed from: n  reason: collision with root package name */
        private final Uri f14918n;

        /* renamed from: o  reason: collision with root package name */
        private final String f14919o;

        /* renamed from: p  reason: collision with root package name */
        private final Integer f14920p;

        /* renamed from: q  reason: collision with root package name */
        private final Integer f14921q;

        /* renamed from: r  reason: collision with root package name */
        private final Integer f14922r;

        /* renamed from: s  reason: collision with root package name */
        private final int[] f14923s;

        /* renamed from: t  reason: collision with root package name */
        private final Long f14924t;

        /* renamed from: u  reason: collision with root package name */
        private final boolean f14925u;

        /* renamed from: v  reason: collision with root package name */
        private final boolean f14926v;

        /* renamed from: w  reason: collision with root package name */
        private final boolean f14927w;

        /* renamed from: x  reason: collision with root package name */
        private final boolean f14928x;

        /* renamed from: y  reason: collision with root package name */
        private final boolean f14929y;

        /* renamed from: z  reason: collision with root package name */
        private final long[] f14930z;

        private static String[] b(f0 f0Var, String str) {
            Object[] g10 = f0Var.g(str);
            if (g10 == null) {
                return null;
            }
            String[] strArr = new String[g10.length];
            for (int i10 = 0; i10 < g10.length; i10++) {
                strArr[i10] = String.valueOf(g10[i10]);
            }
            return strArr;
        }

        public String a() {
            return this.f14908d;
        }

        private b(f0 f0Var) {
            this.f14905a = f0Var.p("gcm.n.title");
            this.f14906b = f0Var.h("gcm.n.title");
            this.f14907c = b(f0Var, "gcm.n.title");
            this.f14908d = f0Var.p("gcm.n.body");
            this.f14909e = f0Var.h("gcm.n.body");
            this.f14910f = b(f0Var, "gcm.n.body");
            this.f14911g = f0Var.p("gcm.n.icon");
            this.f14913i = f0Var.o();
            this.f14914j = f0Var.p("gcm.n.tag");
            this.f14915k = f0Var.p("gcm.n.color");
            this.f14916l = f0Var.p("gcm.n.click_action");
            this.f14917m = f0Var.p("gcm.n.android_channel_id");
            this.f14918n = f0Var.f();
            this.f14912h = f0Var.p("gcm.n.image");
            this.f14919o = f0Var.p("gcm.n.ticker");
            this.f14920p = f0Var.b("gcm.n.notification_priority");
            this.f14921q = f0Var.b("gcm.n.visibility");
            this.f14922r = f0Var.b("gcm.n.notification_count");
            this.f14925u = f0Var.a("gcm.n.sticky");
            this.f14926v = f0Var.a("gcm.n.local_only");
            this.f14927w = f0Var.a("gcm.n.default_sound");
            this.f14928x = f0Var.a("gcm.n.default_vibrate_timings");
            this.f14929y = f0Var.a("gcm.n.default_light_settings");
            this.f14924t = f0Var.j("gcm.n.event_time");
            this.f14923s = f0Var.e();
            this.f14930z = f0Var.q();
        }
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param Bundle bundle) {
        this.f14902a = bundle;
    }

    public Map<String, String> X() {
        if (this.f14903b == null) {
            this.f14903b = d.a.a(this.f14902a);
        }
        return this.f14903b;
    }

    public String n0() {
        return this.f14902a.getString("from");
    }

    public b o0() {
        if (this.f14904c == null && f0.t(this.f14902a)) {
            this.f14904c = new b(new f0(this.f14902a));
        }
        return this.f14904c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        k0.c(this, parcel, i10);
    }
}
