package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.q;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface h extends q {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static abstract class a implements h {

        /* renamed from: a  reason: collision with root package name */
        private final String f18701a;

        /* renamed from: b  reason: collision with root package name */
        private final String f18702b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f18703c;

        public a(String str, String str2, boolean z10) {
            this.f18701a = str;
            this.f18702b = str2;
            this.f18703c = z10;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.q
        public abstract IronSourceError a();

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public String b() {
            return this.f18702b;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public String c() {
            return this.f18701a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public boolean d() {
            return this.f18703c;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b extends a {

        /* renamed from: d  reason: collision with root package name */
        private final String f18704d;

        /* renamed from: e  reason: collision with root package name */
        private final Activity f18705e;

        /* renamed from: f  reason: collision with root package name */
        private final ISDemandOnlyBannerLayout f18706f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String adFormat, Activity activity, String str, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str2, boolean z10) {
            super(str, str2, z10);
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            this.f18704d = adFormat;
            this.f18705e = activity;
            this.f18706f = iSDemandOnlyBannerLayout;
        }

        public /* synthetic */ b(String str, Activity activity, String str2, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str3, boolean z10, int i10, kotlin.jvm.internal.h hVar) {
            this(str, activity, str2, iSDemandOnlyBannerLayout, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? false : z10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        public IronSourceError a() {
            IronSourceError a10 = new q.a(this.f18704d).a(this);
            if (a10 != null) {
                return a10;
            }
            return null;
        }

        public final Activity f() {
            return this.f18705e;
        }

        public final ISDemandOnlyBannerLayout g() {
            return this.f18706f;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private String f18707a = "";

        /* renamed from: b  reason: collision with root package name */
        private Activity f18708b;

        /* renamed from: c  reason: collision with root package name */
        private String f18709c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f18710d;

        /* renamed from: e  reason: collision with root package name */
        private String f18711e;

        /* renamed from: f  reason: collision with root package name */
        private ISDemandOnlyBannerLayout f18712f;

        public final b a() {
            return new b(this.f18707a, this.f18708b, this.f18709c, this.f18712f, this.f18711e, this.f18710d);
        }

        public final c a(Activity activity) {
            this.f18708b = activity;
            return this;
        }

        public final c a(Activity activity, Activity activity2) {
            if (activity == null) {
                activity = activity2;
            }
            this.f18708b = activity;
            return this;
        }

        public final c a(IronSource.AD_UNIT adFormat) {
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            String ad_unit = adFormat.toString();
            kotlin.jvm.internal.n.e(ad_unit, "adFormat.toString()");
            this.f18707a = ad_unit;
            return this;
        }

        public final c a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
            this.f18712f = iSDemandOnlyBannerLayout;
            return this;
        }

        public final c a(String str) {
            this.f18711e = str;
            return this;
        }

        public final c a(boolean z10) {
            this.f18710d = z10;
            return this;
        }

        public final c b(String str) {
            this.f18709c = str;
            return this;
        }

        public final d b() {
            return new d(this.f18707a, this.f18708b, this.f18709c, this.f18711e, this.f18710d);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class d extends a implements com.ironsource.k {

        /* renamed from: d  reason: collision with root package name */
        private final String f18713d;

        /* renamed from: e  reason: collision with root package name */
        private final Activity f18714e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String adFormat, Activity activity, String str, String str2, boolean z10) {
            super(str, str2, z10);
            kotlin.jvm.internal.n.f(adFormat, "adFormat");
            this.f18713d = adFormat;
            this.f18714e = activity;
        }

        public /* synthetic */ d(String str, Activity activity, String str2, String str3, boolean z10, int i10, kotlin.jvm.internal.h hVar) {
            this(str, activity, str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? false : z10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        public IronSourceError a() {
            IronSourceError a10 = new q.b(this.f18713d).a(this);
            if (a10 != null) {
                return a10;
            }
            return null;
        }

        @Override // com.ironsource.k
        public Activity e() {
            return this.f18714e;
        }
    }

    String b();

    String c();

    boolean d();
}
