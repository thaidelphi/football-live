package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class d7 implements lv {

    /* renamed from: a  reason: collision with root package name */
    private final cm f16950a;

    /* renamed from: b  reason: collision with root package name */
    private final AdSize f16951b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.a<IronSourceError> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16952a = new a();

        a() {
            super(0);
        }

        @Override // t8.a
        /* renamed from: a */
        public final IronSourceError invoke() {
            return wb.f21282a.a("Load task config is null");
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class b extends kotlin.jvm.internal.o implements t8.a<IronSourceError> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16953a = new b();

        b() {
            super(0);
        }

        @Override // t8.a
        /* renamed from: a */
        public final IronSourceError invoke() {
            return wb.f21282a.l();
        }
    }

    public d7(cm cmVar, AdSize adSize) {
        this.f16950a = cmVar;
        this.f16951b = adSize;
    }

    @Override // com.ironsource.lv
    public void a() {
        a(this.f16950a != null, a.f16952a);
        a(this.f16951b != null, b.f16953a);
    }

    @Override // com.ironsource.lv
    public /* synthetic */ void a(boolean z10, t8.a aVar) {
        oz.a(this, z10, aVar);
    }
}
