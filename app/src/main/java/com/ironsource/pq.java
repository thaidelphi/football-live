package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class pq implements lv {

    /* renamed from: a  reason: collision with root package name */
    private final cm f19775a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    static final class a extends kotlin.jvm.internal.o implements t8.a<IronSourceError> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19776a = new a();

        a() {
            super(0);
        }

        @Override // t8.a
        /* renamed from: a */
        public final IronSourceError invoke() {
            return wb.f21282a.d("Load task config is null");
        }
    }

    public pq(cm cmVar) {
        this.f19775a = cmVar;
    }

    @Override // com.ironsource.lv
    public void a() {
        a(this.f19775a != null, a.f19776a);
    }

    @Override // com.ironsource.lv
    public /* synthetic */ void a(boolean z10, t8.a aVar) {
        oz.a(this, z10, aVar);
    }
}
